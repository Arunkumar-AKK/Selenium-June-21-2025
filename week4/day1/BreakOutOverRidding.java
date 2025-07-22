package week4.day1;

public class BreakOutOverRidding extends BreakOutMethodOverloading {
	
	public void reportStep(String check, String Verification) {
		// TODO Auto-generated method stub
		System.out.println("The Message is:"+ check + "/n"+"The status is:"+ Verification);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BreakOutOverRidding obj2 = new BreakOutOverRidding();
		obj2.reportStep("Overridded", "verified 2.25 version");
	}

}
