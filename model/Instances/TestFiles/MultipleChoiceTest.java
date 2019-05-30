
public class MultipleChoiceTest {
	private String s1;
	private String s2;
	private String s3;
	
	public static void main(String[] args) { // {multipleChoice, input:"main", options:["main", "Main", "start", "Start"]}
		System.out.println("Main");
	}
	
	public void setStringOne(String s) { // {multipleChoice, input:25-33, options:["String s", "int i", "boolean b", "float f"]}
		s1 = s; //{multipleChoice, options:["s1 = s;", "s2 = s;", "s = s1;", "s = s2;"]}
	}
}
