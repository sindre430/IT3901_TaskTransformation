package transformation.parser.languages;

public class PhpConfiguration extends LanguageConfiguration{
	
	public PhpConfiguration() {
		super(new String[] {"/*"}, new String[] {"*/"}, new String[] {"#", "//"});
	}

}
