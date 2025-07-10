package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MarathonTC2Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		// to maximize
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().refresh();
		
		//03) Type "Bags for boys" in the Search box , to enter from keyboard, keys.downarrow
		
		//searchTopBar.sendKeys("Bags for boys",Keys.ENTER);
		WebElement searchTopBar = driver.findElement(By.id("twotabsearchtextbox"));
		searchTopBar.sendKeys("Bags for boys");
		
		// 04) Choose the      item in the result (bags for boys) 
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='s-suggestion-container'])[1]")).click();
		
		// 05) Print the total number of results (like 50000)
		  // example like this-----> 1-48 of over 50,000 results for "bags for boys" 
		// //h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']
		//By.className("a-size-base a-spacing-small a-spacing-top-small a-text-normal")
		
		WebElement searchResult = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']"));
		
		System.out.println(searchResult.getText());
		
		// 06) Select the first 2 brands in the left menu
	    //(like American Tourister, Generic)
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click();
		
		// Choose New Arrivals (Sort)
		
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		
		WebElement sortDD = driver.findElement(By.xpath("//a[text()='Newest Arrivals']"));
		sortDD.click();
//		Select sel = new Select(sortDD);
//		sel.deselectByVisibleText("Newest Arrivals");
		
		// 08) Print the first resulting bag info (name, discounted price)
		
		String firstResultBag = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]")).getText();
		System.out.println("Bag Brang Name is:"+" "+ firstResultBag);
		
		// price of nag 
		
		WebElement priceOfBag = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		System.out.println(priceOfBag.getText());
		
		System.out.println(driver.getTitle());
		
		//	driver.close();
		
	}

}
