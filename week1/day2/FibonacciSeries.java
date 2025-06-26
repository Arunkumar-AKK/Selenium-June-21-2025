package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0 1 1 2 3 5 8
		int a = 0;
		int b = 1;
		int c;
		for (int i = 0; i < 8; i++) {
			System.out.println(a);

			c = a + b; // 1 2
			a = b; // 1 1
			b = c; // 1 2

		}
	}

}
