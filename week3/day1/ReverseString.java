package week3.day1;

import java.util.Iterator;

public class ReverseString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = new String("Arunkumar");
		
		char[] charArray = name.toCharArray();
		System.out.println(charArray);
		
		// to match the index of for loop and length 
		for (int i =charArray.length-1 ; i >= 0; i--) {
			
			System.out.println(charArray[i]);
			
		}
		
		
		
		
	}
	

}
