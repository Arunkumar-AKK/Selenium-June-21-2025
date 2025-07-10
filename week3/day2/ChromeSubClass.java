package week3.day2;

public class ChromeSubClass extends BrowserSuperClass {
	
	public void openIncognit() {
		// TODO Auto-generated method stub
		System.out.println("Open in Ingonito mode");
	}

	public void clearCache() {
		// TODO Auto-generated method stub
		System.out.println("cache cleared");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeSubClass obj1 = new ChromeSubClass();
		obj1.clearCache();
		obj1.openIncognit();
		obj1.openURL();

	}

}
