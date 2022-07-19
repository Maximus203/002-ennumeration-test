package test;

public class Application {

	public static void main(String[] args) {		
		for (Language lang : Language.values()) {
			System.out.println(lang.getName() + " : " + lang.getEditor());
		}
		
	}

}
