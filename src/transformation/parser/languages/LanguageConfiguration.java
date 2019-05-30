package transformation.parser.languages;

public abstract class LanguageConfiguration {
	
	public enum CommentSymbols {
		BLOCK_START,
		BLOCK_END,
		COMMENT;
	}
	
	private String[] commentBlockStartSymbols;
	private String[] commentBlockEndSymbols;
	private String[] commentLineSymbols;
	
	public LanguageConfiguration(String[] commentBlockStartSymbols, String[] commentBlockEndSymbols, String[] commentLineSymbols) {
		this.commentBlockStartSymbols = commentBlockStartSymbols;
		this.commentBlockEndSymbols = commentBlockEndSymbols;
		this.commentLineSymbols = commentLineSymbols;
	}
	
	public String[] getCommentBlockStartSymbols() {
		return commentBlockStartSymbols;
	}


	public void setCommentBlockStartSymbols(String[] commentBlockStartSymbols) {
		this.commentBlockStartSymbols = commentBlockStartSymbols;
	}


	public String[] getCommentBlockEndSymbols() {
		return commentBlockEndSymbols;
	}


	public void setCommentBlockEndSymbols(String[] commentBlockEndSymbols) {
		this.commentBlockEndSymbols = commentBlockEndSymbols;
	}


	public String[] getCommentLineSymbols() {
		return commentLineSymbols;
	}


	public void setCommentLineSymbols(String[] commentLineSymbols) {
		this.commentLineSymbols = commentLineSymbols;
	}
	
	/*
	 * Finds the index of an occurrence of a string within a list.
	 * Returns -1 if the input string does not contain any of the strings within the list.
	 * 
	 * @returns int
	 */
	public int stringContains(String str, CommentSymbols sy) {
		String[] list;
		
		if(sy == CommentSymbols.BLOCK_START) list = commentBlockStartSymbols;
		else if(sy == CommentSymbols.BLOCK_END) list = commentBlockEndSymbols;
		else list = commentLineSymbols;
		
		for (String s : list) {
			 if(str.indexOf(s) != -1){
				 if(sy == CommentSymbols.BLOCK_END) {
					 return str.indexOf(s);
				 }else {
					 return str.indexOf(s)+s.length();
				 }
				
		     }
		 }
		 return -1;
	}
	
}
