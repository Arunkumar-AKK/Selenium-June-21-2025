package week5.day2;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeAssignmentAmazonAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		// 1. Amazon Site loaded
		driver.get("https://www.amazon.in/");
		// To maximize the window
		driver.manage().window().maximize();
		// To add Implicitly Wait for finding the locator
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.navigate().refresh();

		// to locate the search Webelement on the site
		WebElement searchBarElement = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		// 2. Search for "oneplus 9 pro".
		searchBarElement.sendKeys("oneplus 9 pro" + Keys.ENTER);

		// 3. To get price of the first product.
		WebElement priceFirstProd = driver.findElement(By.xpath("//div[@class='a-row a-size-base a-color-base']"));
		System.out.println(priceFirstProd.getText());

		Actions act = new Actions(driver);

//		act.moveToElement(priceFirstProd).perform();

		// 4. Print the number of customer ratings for the first displayed product
		// place the cursor and then take the rating

		WebElement scrollEle = driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-small a-star-small-4']"));
		act.moveToElement(scrollEle).perform();
//		System.out.println(scrollEle.getText());

		Thread.sleep(5000);
		
		// To be verified with Harrish
		WebElement ratingEle = driver.findElement(By.xpath("//span[@class='a-size-base a-color-secondary totalRatingCount']"));
		
		act.moveToElement(ratingEle).perform();
		
		Thread.sleep(5000);
		
		System.out.println(ratingEle.getText());

		// click using the Action class object
		// Click the first text link of the first image
		act.click(priceFirstProd).perform();

		// priceFirstProd.click();

		// 6. Take a screenshot of the product displayed. - SKIP

		// CLick the add to cart button

		WebElement addToCartEle = driver.findElement(By.xpath("//span[@class='a-button-text']"));

		act.click(addToCartEle).perform();

		// Get the cart subtotal and verify if it is correct. - To Do
		

		// Close the browser. - driver.close();

	}

}
