package transformation.parser;

import java.io.File;

public class Program {

	/*
	 * The program for parsing files to Task files.
	 * The arguments should contain paths to files and the first path can be the output directory (optional).
	 */
	public static void main(String[] args) {
		TaskParser parser = null;
		for(int i=0; i<args.length; i++) {
			File file = new File(args[i]);
			if(i==0) {
				if(!file.isFile()) {
					parser = new TaskParser(file.getPath());
					continue;
				}
				parser = new TaskParser();
			}
			parser.parseJavaFile(file);
		}
	}
}
