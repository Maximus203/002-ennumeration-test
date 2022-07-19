package test;


public enum Language {
	JAVA("Language Java", "Eclipse"),
	PHP("Language PHP", "Php Storm"),
	C("Language C", "Code blocks"),
	Python("Language Python", "Pycharm");

	private String name;
	private String editor;

	Language(String name, String editor) 
	{
		this.name = name;
		this.editor = editor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	
}
