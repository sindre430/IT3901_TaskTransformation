package transformation.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.json.JSONArray;
import org.json.JSONObject;

import transformation.Blank;
import transformation.Container;
import transformation.EditText;
import transformation.FileInformation;
import transformation.IndexRegion;
import transformation.SourceRegion;
import transformation.Moveable;
import transformation.MultipleChoice;
import transformation.Content;
import transformation.RandomNumberVariable;
import transformation.RandomStringVariable;
import transformation.RegexRegion;
import transformation.RegionTypes;
import transformation.StaticVariable;
import transformation.TextRegion;
import transformation.TransformationFactory;
import transformation.TransformationElement;
import transformation.TransformationPackage;
import transformation.Variable;
import transformation.impl.ContainerImpl;
import transformation.impl.EditTextImpl;
import transformation.impl.FileInformationImpl;
import transformation.impl.MultipleChoiceImpl;
import transformation.impl.RandomStringVariableImpl;
import transformation.parser.languages.LanguageConfiguration;
import transformation.parser.languages.LanguageLibrary;
import transformation.parser.languages.LanguageConfiguration.CommentSymbols;

public class TaskParser {

	private enum TransformationTypes {VARIABLE, EDIT_TEXT, BLANK, MULTIPLE_CHOICE, MOVEABLE;}
	private enum VariableTypes {STATIC, RANDOM_STRING, RANDOM_INT;}

	private URI outputDirURI = null;
	private URI curFileURI = null;
	private List<String> curFileLines = null;
	
	private LanguageLibrary languageLibrary = new LanguageLibrary();
	private LanguageConfiguration languageConfig;
	
	public TaskParser() {}
	
	public TaskParser(String outputDirectory){
		if(!(outputDirectory.equals(null) || outputDirectory.equals(""))) {
			outputDirURI = URI.createURI(outputDirectory);
		}
	}
	
	/*
	 * The main process for parsing the Java file.
	 * Takes in a a path to a Java file, gets its lines, 
	 * sorts out the lines with no interest and makes tasks before it exports the result to a new task file.
	 */
	public void parseJavaFile(File file) {
		if(!file.isFile()) return;
		
		curFileURI = URI.createFileURI(file.getPath());
		
		try {
			languageConfig = languageLibrary.getLanguageConfig(file);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e1) {
			e1.printStackTrace();
			return;
		}

		try {
			curFileLines = getLines(file);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		List<JSONObject> interests = getTasksFromLines(curFileLines);
		List<TransformationElement> variables = new ArrayList<TransformationElement>();
		List<TransformationElement> tasks = new ArrayList<TransformationElement>();
		
		for(int i=0; i<interests.size(); i++) {
			JSONObject o = makeJSONObject(interests.get(i).getString("transformation"));
			if(o == null) continue;
			interests.get(i).put("JSONTask", o);
			TransformationTypes type = (TransformationTypes) o.get("transformationType");
			TransformationElement te;
			if(type == TransformationTypes.VARIABLE) {
				te = makeVariable(o);
				te.setLineText((String)interests.get(i).get("line"));
				te.setLineNumber((int) interests.get(i).get("lineNumber"));
				variables.add(te);
			}
		}
		
		for(int i=0; i<interests.size(); i++) {
			JSONObject o = makeJSONObject(interests.get(i).getString("transformation"));
			if(o == null) continue;
			interests.get(i).put("JSONTask", o);
			TransformationTypes type = (TransformationTypes) o.get("transformationType");
			TransformationElement te;
			if(type == TransformationTypes.EDIT_TEXT) {
				te = makeEditText(o, variables, interests.get(i).getString("line"));
			}else if(type == TransformationTypes.BLANK) {
				te = makeBlank(o, interests.get(i).getString("line"));
			}else if(type == TransformationTypes.MOVEABLE) {
				te = makeMoveable(o, variables);
			}else if(type == TransformationTypes.MULTIPLE_CHOICE) {
				te = makeMultipleChoice(o, interests.get(i).getString("line"), variables);
			}else continue;
			
			if(te == null) continue;
			
			te.setLineText(interests.get(i).getString("line"));
			te.setLineNumber(interests.get(i).getInt("lineNumber"));
			tasks.add(te);
		}
		
		List<TransformationElement> finalList = new ArrayList<TransformationElement>();
		finalList.addAll(variables);
		finalList.addAll(tasks);
		exportInstance(finalList);
	}
	
	/*
	 * Checks a list of Strings for matching patterns and returns a list of JSONObjects with relevant information.
	 */
	private List<JSONObject> getTasksFromLines(List<String> lines) {
		List<JSONObject> list = new ArrayList<JSONObject>();
		boolean isInComment = false;
		int lineNumber = 0;
		
		for (String line : lines) {
			lineNumber++;
			String orgLine = line;
			boolean foundComment = isInComment;

			int index = languageConfig.stringContains(orgLine, CommentSymbols.BLOCK_START);
			if(index != -1 && !isInComment) {
				line = line.substring(index);
				isInComment = true;
				foundComment = true;
			}
			
			index = languageConfig.stringContains(line, CommentSymbols.BLOCK_END);
			if(index != -1 && isInComment) {
				line = line.substring(0, index);
				isInComment = false;
				foundComment = true;
			}
			
			index = languageConfig.stringContains(line, CommentSymbols.COMMENT);
			if(index != -1 && !isInComment) {
				line = line.substring(index);
				foundComment = true;
			}
			
			if(!foundComment && !isInComment) continue;

			while (line.contains("{") && line.contains("}")){
				int startIndex = line.indexOf("{");
				int endIndex = line.indexOf("}");
				JSONObject o = new JSONObject();
				o.put("line", orgLine);
				o.put("lineNumber", lineNumber);
				o.put("transformation", line.substring(startIndex, endIndex+1));
				list.add(o);
				line = line.substring(endIndex+1);
			}
		}
		
		return list;
	}
	
	/*
	 * Makes a JSONObject out of a string.
	 * Checks if the string represents a variable or a task of some sort.
	 * Returns a JSONObject with information which can be used to make the task itself. If the result is a variable no further processing is needed.
	 */
	private JSONObject makeJSONObject(String string) {
		if(string.length() < 2) return null;
		String s = string;
		s = s.replaceAll("\\s+(?=([^\"]*\"[^\"]*\")*[^\"]*$)","");
		s = s.substring(1, s.length()-1);
		String[] parts = s.split(",(?![^\\(\\[]*[\\]\\)])");
		
		if(parts.length <= 0) return null;
		
		JSONObject obj = new JSONObject();
		JSONArray flags = new JSONArray();
		
		if(parts[0].contains("$")) {
			obj.put("transformationType", TransformationTypes.VARIABLE);
			int equalsIndex = s.indexOf('=');
			String name = s.substring(1, equalsIndex);
			String value = s.substring(equalsIndex+1);
			obj.put("variableName", name);
			if(value.contains("random(")) {
				int startIndex = value.indexOf("random(");
				if(value.charAt(startIndex+7) == '[') {
					obj.put("variableType", VariableTypes.RANDOM_STRING);
					int arrayEndIndex = value.lastIndexOf(']');
					JSONArray options = new JSONArray();
					String[] arr = value.substring(startIndex+8, arrayEndIndex).split(",");
					for(int i=0; i<arr.length; i++) {
						options.put(arr[i]);
					}
					obj.put("options", options);
				}else {
					obj.put("variableType", VariableTypes.RANDOM_INT);
					int endIndex = value.indexOf(")");
					value = value.substring(startIndex+7, endIndex);
					String[] values = value.split(",");
					obj.put("from", values[0]);
					obj.put("to", values[1]);
				}
			}else{
				obj.put("variableType", VariableTypes.STATIC);
				obj.put("value", value);
			}
		}else{
			TransformationTypes type;
			switch(parts[0]) {
				case "editText":
					type = TransformationTypes.EDIT_TEXT;
				break;
				case "blank":
					type = TransformationTypes.BLANK;
				break;
				case "moveable":
					type = TransformationTypes.MOVEABLE;
				break;
				case "multipleChoice":
					type = TransformationTypes.MULTIPLE_CHOICE;
				break;
				default:
					return null;
			}
			obj.put("transformationType", type);
			for(int i=1; i<parts.length; i++) {
				int colonIndex = parts[i].indexOf(":");
				if(colonIndex != -1) {
					String[] arr = parts[i].split(":");
					obj.put(arr[0], arr[1]);
				}else {
					flags.put(parts[i]);
				}
			}
			if(flags.length() > 0) {
				obj.put("flags", flags);
			}
		}
		
		if(!obj.isEmpty()) return obj;
		else return null;
	}
	
	/*
	 * Takes in a file reference and returns its lines.
	 */
	private List<String> getLines(File file) throws FileNotFoundException, IOException {
		List<String> lines = new ArrayList<String>();
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
		    for(String line; (line = br.readLine()) != null; ) {
		        lines.add(line);
		    }
		    
		}
		return lines;
	}
	
	
	/*
	 * This function takes in a JSONObject which represents a variable to make an actual Variable out of it.
	 * 	 
	 * Possible inputJSONObject: {"variableType":["STATIC"|"RANDOM_INT"|"RANDOM_STRING"],"variableName":[String],"value":[String],"from":[int],"to":[int],"options":[String[]]}
	 * Input JSONObject example for static variable: {"variableType":"STATIC","taskType":"VARIABLE","variableName":"variableName1","value":"Hello World!"}
	 * Input JSONObject example for random integer: {"variableType":"RANDOM_INT","taskType":"VARIABLE","variableName":"variableName2","from":"10","to":"27"}
	 * Input JSONObject example for random string: {"variableType":"RANDOM_STRING","taskType":"VARIABLE","variableName":"variableName3","options":"[\"hello\",\"world\"]"}
	 * 
	 * VariableType is the type of the new variable.
	 * VariableName is the name of the new variable.
	 * Value is the value this variable should have (Only for static variables).
	 * From is the minimum value of a random int variable (Only for random int variables).
	 * To is the maximum value of a random int variable (Only for random int variables).
	 * Options is a list of string that can be used in a random string variable (Only for random String variables).
	 * 
	 * Based on the variableType value it can identify if the variable should be static, random integer or random string.
	 * 
	 * @returns Variable
	 */
	private Variable makeVariable(JSONObject o) {
		if(!o.has("variableType")) return null;
		
		if(o.get("variableType") == VariableTypes.STATIC) {
			StaticVariable v = TransformationFactory.eINSTANCE.createStaticVariable();
			v.setName(o.getString("variableName"));
			v.setValue(o.getString("value"));
			return v;
		}else if(o.get("variableType") == VariableTypes.RANDOM_INT) {
			RandomNumberVariable v = TransformationFactory.eINSTANCE.createRandomNumberVariable();
			v.setName(o.getString("variableName"));
			v.setMinValue(o.getInt("from"));
			v.setMaxValue(o.getInt("to"));
			return v;
		}else if(o.get("variableType") == VariableTypes.RANDOM_STRING) {
			RandomStringVariableImpl v = (RandomStringVariableImpl) TransformationFactory.eINSTANCE.createRandomStringVariable();
			v.setName(o.getString("variableName"));
			JSONArray options = o.getJSONArray("options");
			for(int i=0; i<options.length(); i++) {
				options.put(i, removeFirstAndLastQuotes(options.getString(i)));
			}
			v.eSet(TransformationPackage.RANDOM_STRING_VARIABLE__POSSIBLE_VALUES, options.toList());
			return (RandomStringVariable) v;
		}else return null;
	}
	
	/*
	 * This function takes in a JSONObject which represents a edit task to make an actual Edit out of it.
	 * 
	 * Possible input JSONObject: {"output":[(String|Variable)*], "input":[String|int|int-int]}
	 * Input JSONObject example: {"output":"$variableName","input":"\"21\""}
	 * Input JSONObject example: {"output":"\"0\"","input":"20-30"}
	 * 
	 * In this example the variable named "variableName" will be used as the output. To be able to use variables there is necessary to pass
	 * the variables as a parameter to this function.
	 * 
	 * Output is the value that should be inserted into the line. If not present the output will be "".
	 * Input is the value that should be replaced. It can be a string or indexes (index1-index2)
	 * 
	 * @returns Edit
	 */
	private EditText makeEditText(JSONObject o, List<TransformationElement> variables, String line) {
		EditTextImpl e = (EditTextImpl)TransformationFactory.eINSTANCE.createEditText();
		
		if(o.has("sourceRegion")) {
			e.setSourceRegion(makeSourceRegion(o.getString("sourceRegion"), line));
		}else {
			e.setSourceRegion(makeSourceRegion("0", line));
		}
		
		if(o.has("replacement")) {
			e.eSet(TransformationPackage.EDIT_TEXT__REPLACEMENT, makeContents(o.getString("replacement"), variables));
		}else {
			e.eSet(TransformationPackage.EDIT_TEXT__REPLACEMENT, makeContents("", variables));
		}
		
		return (EditText)e;
	}
	
	/*
	 * This function takes in a JSONObject which represents a movable task to make an actual Movable out of it.
	 * 
	 * Possible input JSONObject: {"region":[(default)"line"|"body"], "set":[int], "block":[int], flags:[String[]]}
	 * Input JSONObject example: {"set":"1","flags":["start"],"block":"2"}
	 * Input JSONObject example: {"set":"1","flags":["end"],"block":"2"}
	 * 
	 * Region tells if the movable should be the line the task was presented on or its body-content.
	 * Set tells which lines this movable should affect.
	 * Block tells that this line is part of a movable block with id [int]
	 * Flags is extra information used to start and end blocks. Possible values: "start" and "end"
	 * 
	 * If region is body all other values are ignored.
	 * If region is not body the value set must be present.
	 * If block is not present the movable is independent and not within a block
	 * 
	 * @returns Movable
	 */
	private Moveable makeMoveable(JSONObject o, List<TransformationElement> variables) {
		Moveable m = TransformationFactory.eINSTANCE.createMoveable();
		if(o.has("regionType")) {
			if(o.getString("regionType").equals("body")){
				m.setRegionType(RegionTypes.BODY);
				return m;
			}
		}
		m.setRegionType(RegionTypes.LINE);
		
		if(o.has("setId")) {
			m.setSetId(o.getInt("setId"));
		}else {
			return null;
		}
		
		if(o.has("groupId")) {
			m.setGroupId(o.getInt("groupId"));
			if(o.has("flags")) {
				JSONArray l = o.getJSONArray("flags");
				for(int i=0; i<l.length(); i++) {
					if(l.getString(i).equals("groupStart")) {
						m.setGroupStart(true);
					}
					if(l.getString(i).equals("groupEnd")) {
						m.setGroupEnd(true);
					}
				}
			}
		}
		
		return m;
	}
	
	/*
	 * This function takes in a JSONObject which represents a blank task to make an actual Blank out of it.
	 * 
	 * Possible input JSONObject: {"region":[(default)"line"|"body"], "input":[String], "from":[String|int], "to":[String|int]}
	 * Input JSONObject example: {}
	 * Input JSONObject example: {"from":"\"return\""}
	 * Input JSONObject example: {"from":"\"public\"","to":"\"main\""}
	 * Input JSONObject example: {"region":"body"}
	 * 
	 * Region tells if the blank should be on the line the task was presented on or its body-content.
	 * Input tells the text that should be blanked out.
	 * From tells the start position of the blank. Both String and index is possible here. (Ignored if region is body or input is presented)
	 * To tells the end position of the blank. Both String and index is possible here. (Ignored if region is body or input is presented)
	 * 
	 * If no values are presented, the whole line will be blanked out.
	 * If region is body all other value are ignored.
	 * 
	 * @returns Blank
	 */
	private Blank makeBlank(JSONObject o, String line) {
		Blank b = TransformationFactory.eINSTANCE.createBlank();
		String region = "";
		
		if(o.has("region")) {
			if(o.getString("region").equals("body")){
				b.setRegionType(RegionTypes.BODY);
				return b;
			}
		}else {
			b.setRegionType(RegionTypes.LINE);
		}
	
		if(o.has("sourceRegion")) {
			region = o.getString("sourceRegion");
		}else {
			int from = 0;
			region = line;
			if(o.has("from")) {
				String s = o.getString("from");
				if(s.indexOf("\"") != -1) {
					region = region.substring(region.indexOf(removeFirstAndLastQuotes(s)));
				}else {
					from = Integer.parseInt(s);
					region = region.substring(from);
				}
			}
			
			if(o.has("to")) {
				String s = o.getString("to");
				if(s.indexOf("\"") != -1) {
					region = region.substring(0, region.indexOf(removeFirstAndLastQuotes(s)));
				}else {
					region = region.substring(0, Integer.parseInt(s)-from);
				}
			}
			
			int commentIndex = languageConfig.stringContains(line, CommentSymbols.COMMENT);
			if(commentIndex == -1) {
				commentIndex = languageConfig.stringContains(line, CommentSymbols.BLOCK_START);
			}
			if(commentIndex != -1) {
				line=line.substring(0, commentIndex);
			}
			
			region='"'+region+'"';
		}
		
		b.setSourceRegion(makeSourceRegion(region, line));
		return b;
	}
	
	/*
	 * This function takes in a JSONObject which represents a multiple choice task to make an actual MultipleChoice out of it.
	 * 
	 * Possible input JSONObject: {"input":[String], "options":[String[]]}
	 * Input JSONObject example: {"input":"\"i++\"","options":"[\"i+=2\",\"i\",\"i++\",\"i--\",\"i-=2\"]"}
	 * Input JSONObject example: {"options":"[\"text1",\"text2\",\"text3\"]"}
	 * 
	 * Input tells the text that should be replaced with a multiple choice.
	 * Options tells the different possible choices.
	 * 
	 * If input is present the whole line will be used as the input.
	 * Options is required.
	 * 
	 * @returns MultipleChoice
	 */
	private MultipleChoice makeMultipleChoice(JSONObject o, String line, List<TransformationElement> variables) {
		MultipleChoiceImpl m = (MultipleChoiceImpl) TransformationFactory.eINSTANCE.createMultipleChoice();
		
		if(o.has("sourceRegion")) {
			m.setSourceRegion(makeSourceRegion(o.getString("sourceRegion"), line));
		}else {
			int commentIndex = languageConfig.stringContains(line, CommentSymbols.COMMENT);
			if(commentIndex == -1) {
				commentIndex = languageConfig.stringContains(line, CommentSymbols.BLOCK_START);
			}
			if(commentIndex == -1) return null;
			m.setSourceRegion(makeSourceRegion('"'+line.substring(0, commentIndex)+'"', line));
		}
		
		if(o.has("options")) {
			String s = o.getString("options");
			String[] options = s.substring(1, s.length()-1).split(",");
			Content[] optionContents = new Content[options.length];
			for(int i=0; i<options.length; i++) {
				optionContents[i] = makeContent(options[i], variables);
			}
			m.eSet(TransformationPackage.MULTIPLE_CHOICE__OPTIONS, Arrays.asList(optionContents));
		}else {
			return null;
		}
		
		return (MultipleChoice) m;
	}
	
	/*
	 * Makes an Input out of string or int.
	 * Example input: "10-20" (returns Input with From Index: 10, To Index: 20)
	 * Example input: "10" (returns Input with From Index: 10)
	 * Example input: "\"public\"" (returns Input with String: "public")
	 * 
	 * This function removes the first and last quotes from the string, if any.
	 * 
	 * @returns Input
	 */
	private SourceRegion makeSourceRegion(String s, String line) {
		if(s.charAt(0)=='"') {
			s = removeFirstAndLastQuotes(s).trim();
			if(line.indexOf(s) != -1) {
				TextRegion tr = TransformationFactory.eINSTANCE.createTextRegion();
				tr.setText(s);
				return tr;
			}else {
				boolean isRegex;
				try {
				  Pattern.compile(s);
				  isRegex = true;
				} catch (PatternSyntaxException e) {
				  isRegex = false;
				}
				if(isRegex) {
					RegexRegion rr = TransformationFactory.eINSTANCE.createRegexRegion();
					rr.setRegex(s);
					return rr;
				}else {
					return null;
				}
			}
			
		}else {
			IndexRegion ir = TransformationFactory.eINSTANCE.createIndexRegion();
			String[] fromTo = s.split("-");
			ir.setOffset(Integer.parseInt(fromTo[0]));
			if(fromTo.length>1) {
				ir.setLength((Integer.parseInt(fromTo[1]) - ir.getOffset()));
			}
			return ir;
		}
	}
	
	
	/*
	 * Makes a list of outputs.
	 * Takes in a string as a parameter and splits it on '+'-sign outside quotes and make outputs based on each value.
	 * Example of string could be: $variable+"+=", which will return a list with these values: [$variable, "+="].
	 * 
	 * @returns List<Output>
	 */
	private List<Content> makeContents(String s, List<TransformationElement> variables){
		List<Content> l = new ArrayList<Content>();
		if(s.length() == 0) return l;
		String[] arr = s.split("\\+(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
		
		for(int i=0; i<arr.length; i++) {
			l.add(makeContent(arr[i], variables));
		}
		
		return l;
	}
	
	private Content makeContent(String s, List<TransformationElement> variables){
		if(s.length() == 0) return null;
		Content c = TransformationFactory.eINSTANCE.createContent();
		s = removeFirstAndLastQuotes(s);
		if(s.charAt(0) == '$') {
			for(int j=0; j<variables.size(); j++) {
				if(s.substring(1).equals(((Variable)variables.get(j)).getName())) {
					c.setVariable((Variable)variables.get(j));
				}
			}
		}else {
			c.setText(s);
		}
		
		return c;
	}
	
	/*
	 * Removes the first and last quotes of a string.
	 * Example:
	 * 	input: "\"text\""
	 * 	output: "text"
	 * 
	 * @returns String
	 */
	private String removeFirstAndLastQuotes(String s) {
		if(s.length() < 3) return s;
		if(s.charAt(0) == '"') s = s.substring(1);
		if(s.charAt(s.length()-1) == '"') s = s.substring(0, s.length()-1);
		return s;
	}
	
	/*
	 * Exports the FileInfo and Container instances with all the tasks created from the input file.
	 */
	private void exportInstance(List<TransformationElement> transformationElements) {
		if(outputDirURI == null) {
			outputDirURI = URI.createURI(curFileURI.trimSegments(1).toFileString());
		}
		
		FileInformationImpl tei = (FileInformationImpl) TransformationFactory.eINSTANCE.createFileInformation();
		tei.setFilename(curFileURI.lastSegment());
		tei.eSet(TransformationPackage.FILE_INFORMATION__LINES, curFileLines);
		
		ContainerImpl c = (ContainerImpl) TransformationFactory.eINSTANCE.createContainer();
		c.eSet(TransformationPackage.CONTAINER__TRANSFORMATION_ELEMENTS, transformationElements);
	
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("task", new XMIResourceFactoryImpl());
	        
	    ResourceSet resSet = new ResourceSetImpl();
	    Resource resource = resSet.createResource(URI.createFileURI(outputDirURI.toString()).appendSegment(curFileURI.trimFileExtension().lastSegment()).appendFileExtension("task"));
	    resource.getContents().add((FileInformation) tei);
	    resource.getContents().add((Container) c);

	    try {
	    	resource.save(Collections.EMPTY_MAP);
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
	}
}
