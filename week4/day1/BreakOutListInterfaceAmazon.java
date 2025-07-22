package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BreakOutListInterfaceAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		// to maximize
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.navigate().refresh();

		// 03) Type "Bags for boys" in the Search box , to enter from keyboard,
		// keys.downarrow

		// searchTopBar.sendKeys("Bags for boys",Keys.ENTER);
		WebElement searchTopBar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		// to perform the keys action use the Keys class
		searchTopBar.sendKeys("Mobile phones", Keys.ENTER);
		
		List<Integer> priceList = new ArrayList<Integer>();
		
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
//		List<String> list = new ArrayList<String>();
		
		for (int i = 0; i < elements.size(); i++) {
			
			String text = elements.get(i).getText();
			// check it with Vinoth 
			String replaceAll = text.replaceAll(",","");
			
			//convert to an Integer 
			int mob = Integer.parseInt(replaceAll);
			
			System.out.println(text);
			priceList.add(mob);
			
		}
		System.out.println(priceList);
		// use replace all , sorting 
		Collections.sort(priceList);
		System.out.println(priceList);
		
	}

}
