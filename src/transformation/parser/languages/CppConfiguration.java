package transformation.parser.languages;

public class CppConfiguration extends LanguageConfiguration{
	
	public CppConfiguration() {
		super(new String[] {"/*"}, new String[] {"*/"}, new String[] {"//"});
	}

}
