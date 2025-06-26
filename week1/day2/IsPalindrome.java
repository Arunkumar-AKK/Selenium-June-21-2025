package week1.day2;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 121;
		int reverseNumber = 0;
//		int output = reverseNumber;

		for (int i = input; i > 0; i = i / 10) {
			int reminder = i % 10;
			reverseNumber = reverseNumber * 10 + reminder;

		}
		System.out.println(reverseNumber);
		if (reverseNumber == input) {
			System.out.println("The Given Numnber is a Palindrome");

		} else {
			System.out.println("The Given Number is Not a Palindrome");
		}

	}

}
