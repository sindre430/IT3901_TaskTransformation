package transformation.parser.languages;

public class JavaConfiguration extends LanguageConfiguration{
	
	public JavaConfiguration() {
		super(new String[] {"/*"}, new String[] {"*/"}, new String[] {"//"});
	}

}
