package week3.day1;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = { 2, 5, 7, 7, 5, 9, 2, 3 ,9};
		
		Arrays.sort(num);// 2 2 3 5 5 7 7 9 

		System.out.println("Duplicate values: ");
		for (int i = 0; i < num.length; i++) {
			
			
			// to check form next index 
			for (int j = i+1; j < num.length; j++) {

				if (num[i] == num[j]) {
					System.out.println( num[i]);

				}

			}

		}

	}

}
