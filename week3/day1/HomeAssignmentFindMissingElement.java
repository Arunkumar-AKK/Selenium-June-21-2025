package week3.day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeAssignmentFindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare an Array with a set of values 
		int array1[] = {1,4,3,2,8,6,7};
		
		//Sorted array will be printed 
		//index
		// 0 1 2 3 4 5 6 
		// 1 2 3 4 6 7 8 
		Arrays.sort(array1);
		
		//loop the array till its length 
		for (int i = 0; i < array1.length-1; i++) {
			
			//Check if the iterator variable is not equal to the array values respectively
			if (array1[i+1] - array1[i] != 1) { // 6-4=2 --> which is, 2 != 1
				System.out.println("The Missing Element in the Sorted Array is: "  + (array1[i]+1));
				
				
			}
			
		}
		
		
		

	}

}
