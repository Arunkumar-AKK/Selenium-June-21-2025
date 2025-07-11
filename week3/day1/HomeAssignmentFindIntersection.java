package week3.day1;

public class HomeAssignmentFindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Two Arrays declared below 
		// index        0,1,2, 3, 4,5
		int array1[] = {3,2,11,4,6,7}; // Length of the array is 6
		// index        0,1,2, 3, 4,5
		int array2[] = {1,2,8,4,9,7}; // Length of the array is 6
		
		// Declare for loop iterator from 0 to array length
		
		for (int i = 0; i < array1.length; i++) {
			
			for (int j = 0; j < array2.length; j++) {
				
				if (array1[i] == array2[j]) {
					System.out.println("There is a match between Array1 element and Array2 element:"+ array1[i] +" ");
					
				}
				
			}
			
		}
	}

}
