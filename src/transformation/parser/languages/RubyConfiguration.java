package transformation.parser.languages;

public class RubyConfiguration extends LanguageConfiguration{
	
	public RubyConfiguration() {
		super(new String[] {"=begin"}, new String[] {"=end"}, new String[] {"#"});
	}

}
