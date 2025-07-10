package week3.day2;

public class EdgeSubClass extends ChromeSubClass{

	
	private void takeSnap() {
		// TODO Auto-generated method stub
		System.out.println("Take a Snapshot");
	}
	
	private void clearCookies() {
		// TODO Auto-generated method stub
		System.out.println("Clear the Cookies");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeSubClass obj2 = new EdgeSubClass();
		obj2.openURL();
		obj2.clearCache();
		obj2.clearCookies();
	}

}
