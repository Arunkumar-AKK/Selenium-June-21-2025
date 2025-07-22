package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class BreakOutUniqueSetValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To Convert String use Touupercase or toLowerCase afrer input
		String companyName = "google";
		
		char[] charArray = companyName.toCharArray();
		
		Set<Character> unique = new LinkedHashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			
			unique.add(charArray[i]);
			
			
		}
		
		System.out.println(unique);
	}

}
