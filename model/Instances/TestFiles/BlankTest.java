public class BlankTest {
	private String s1; //{blank, from:"s1"}
	private String s2; //{blank, from:16}
	private String s3; //{blank, from:9, to:15}
	
	
	public static void main(String[] args) { // {blank, from:"public", to:"void"}
		System.out.println("Main"); // {blank, input:"System.out"}
	}
	
	public String getStringOne() { //{blank, region:body}
		System.out.println("This should be blanked out.");
	}
	
	public void setStringOne(String s) { //{blank, input:30-38}
		s1 = s; //{blank, input:14}
		if (
	}
}
