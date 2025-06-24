package week1.day2;

import java.util.Iterator;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	2 is the only even prime number hence ignoring that for now

		int n = 13;
		// assuming the no entered is prime
		boolean prime = true;
		// Running the loop from 2 to (n-1) and checking for every number if it divides by n 

		for (int i = 2; i < n; i++) {

			if (n%i ==0) 
			{
				prime = false;
				break;

			}

		}

		System.out.println("The Given Number is prime : "+ " \n"+ prime);

	}

}
