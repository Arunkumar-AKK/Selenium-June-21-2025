package week3.day1;

public class HomeAssignmentReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Home Assignment <3>: Reverse Odd Words in a String

		// **Reverse the odd position words from a String with the input:
		// String test = "I am a software tester";
		// Expected output: “I ma a erawtfos tester” **

		// declare input String
		String testString = "I am a software tester";

		// splitting string
		String[] testStringSplit = testString.split(" ");

		// find the odd index first
		for (int i = 0; i < testStringSplit.length; i++) {

			// to check whether the index is odd or not
			if (i % 2 != 0) {

				// declaring a char Array to reverse the odd word identified above
				// convert the string array character array

				char[] oddWordch = testStringSplit[i].toCharArray();

				// use for loop to print the char in reverse

				for (int j = oddWordch.length - 1; j >= 0; j--) {

					System.out.print(oddWordch[j]);

				}

				System.out.println(" ");
			} else {
				// block to print even words
				
				System.out.println("The Even word is: " + testStringSplit[i] + " ");
			}

		}
	}

}
