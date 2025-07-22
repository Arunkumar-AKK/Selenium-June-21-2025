package week4.day2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import org.openqa.selenium.Keys;

public class CheckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<String> list = new ArrayList<String>();
//		
//		list.add("A");
//		list.add("B");
//		list.add("A");
//		
//		System.out.println(list);
		
		String s ="Hello";
//		s= s.replace('l', 'x');
//		System.out.println(s);
		
		System.out.println(s.toUpperCase());
		
		System.out.println(s.concat("World"));
		

		StringBuilder sb = new StringBuilder("HELLOWW");
		
		sb.append("+WORLD");
		
		System.out.println(sb);
		
		
	}

}
