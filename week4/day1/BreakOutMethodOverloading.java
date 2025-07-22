package week4.day1;

public class BreakOutMethodOverloading {
	
	
	public void reportStep(String version1, String version2) {
		// TODO Auto-generated method stub
		
		System.out.println("The Message is:"+ version1 + "/n"+"The status is:"+ version2);
		
		
	}
	
	public void reportStep(String version1, String version2, boolean snap) {
		// TODO Auto-generated method stub
		System.out.println("The Message is:"+ version1 + "/n"+"The status is:"+ version2 + "The Snap is taken:"+ snap);
	}

	public static void main(String[] args) {
		
		BreakOutMethodOverloading obj = new BreakOutMethodOverloading();
		
		obj.reportStep("loaded", "2.1");
		obj.reportStep("Loadded successfully", "2.5", false);
	}
}
