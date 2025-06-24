package week1.day1;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Browser

{

	public String launchBrowser(String browserName) {

		// TODO Auto-generated method stub
		System.out.println(browserName);
		return browserName;

	}

	public void loadUrl(String urlLoaded) {
		// TODO Auto-generated method stub
		System.out.println(urlLoaded);

	}

	public int add() {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 6;
		int c = a + b;
//		System.out.println(c);
		return c;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser objA = new Browser();
		objA.launchBrowser("ChromeBrowser");
		objA.loadUrl("Url specified is loaded successfully");
//		objA.add();
		System.out.println(objA.add());
	}

}
