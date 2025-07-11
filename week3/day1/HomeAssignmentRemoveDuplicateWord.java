package week3.day1;

import java.util.Iterator;

public class HomeAssignmentRemoveDuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare the String value
		String text = "We learn Java basics as part of java sessions in java week1";
		// Initialize a variable ‘count’
		int count = 0;

		// Split the text into an array of words using space as the delimiter

		String[] split = text.split(" "); // We, Learn, Java, basics, as, part, of, java, sessions, in, java, week1
											// 0, 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11

		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}

		// Create two nested for loops to compare each word with every other word in the
		// String array.

		for (int i = 0; i < split.length; i++) { // int [0] = we --> will be compared with next index from below i.e
													// learn

			for (int j = i + 1; j < split.length; j++) {

				// If a duplicate word is found, it is replaced with an empty string and the
				// count is incremented.

				if (split[i].equalsIgnoreCase(split[j])) {

					split[j] = " ";

					count++;

				}

			}
		}

		if (count > 0)
			System.out.println("\n" + "The String without Duplicate value is: ");

		{
			for (int i = 0; i < split.length; i++) {

				System.out.print(split[i] + " ");
			}

		}

	}

}
