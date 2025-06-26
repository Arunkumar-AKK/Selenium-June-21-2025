package week1.day2;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 12;
		int b = a;
		
		if (a != 0) {
			if (a > 0) {
				System.out.println("The given number is positive" + "\n" + a);

			}

		} else {
			System.out.println("The Given Number is not a positive number" + " \n" + a);

		}
		if (b < 0) {
			System.out.println("The Number is negative:" + " \n" + a);

		}
	}
}


