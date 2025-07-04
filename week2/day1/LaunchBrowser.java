package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		// to maximize
		driver.manage().window().maximize();
		//Webelement username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Webelement pass
		WebElement pwd = driver.findElement(By.name("PASSWORD"));
		pwd.sendKeys("crmsfa");
		
		//login btn
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// CRM 
		driver.findElement(By.partialLinkText("CRM")).click();
		
		// Click on leads 
		
		
		// Getting User Name Web element
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		// Getting Password Web element
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");

		// Login button and click
		WebElement logInBtn = driver.findElement(By.name("login"));
		logInBtn.click();
		// .click();

		// to get the text "Invalid username or password" since dont have valid user
		// name and pass acc
//		driver.findElement(By.partialLinkText("Invalid username or password"));

		// to get the page title
		String title = driver.getTitle();
		System.out.println(title);

		String expectedTitle = "Log in to Facebook";

		if (title.equals(expectedTitle)) {

			System.out.println("The Page Tittle is as Expected: " + title);

		}
	}
}
