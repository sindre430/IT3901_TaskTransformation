package transformation.parser.languages;

import java.io.File;

import org.eclipse.emf.common.util.URI;

public class LanguageLibrary {

	public LanguageLibrary() {
		
	}
	
	public LanguageConfiguration getLanguageConfig(File f) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String fileExtension = URI.createFileURI(f.getPath()).fileExtension();
		fileExtension = fileExtension.substring(0, 1).toUpperCase() + fileExtension.substring(1).toLowerCase();
		Class<?> c = Class.forName(this.getClass().getPackage().getName()+"."+fileExtension+"Configuration");
		return (LanguageConfiguration)(c.newInstance());
	}
	
}
