package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistrationHomeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Facebook registration process Use case - Automation code

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		// Initialize Chrome driver
		ChromeDriver driver = new ChromeDriver(options);

		// Passing url
		driver.get("https://en-gb.facebook.com/");

		// maximize window
		driver.manage().window().maximize();

		// Adding Implicit Wait globally
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Click on Create New Acc BTN
		driver.findElement(By.partialLinkText("Create new")).click();

		// Enter First Name
		driver.findElement(By.xpath("//div[text()='First name']")).sendKeys("Testacc1");

		// Enter Surname
		driver.findElement(By.xpath("//div[text()='Surname']")).sendKeys("T");

		// Enter Mobile number or mail id element
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']")).sendKeys("9597215977");

		// enter new password
		driver.findElement(By.xpath("//div[text()='New password']")).sendKeys("012346789");

		// Handle all the dropdowns present in the web page
		// Drop down date
		WebElement dayDD = driver
				.findElement(By.xpath("//span[@aria-describedby='birthday-error-message']/span/select[1]"));

		Select sel1 = new Select(dayDD);

		sel1.selectByIndex(6);

		// Drop down Month

		WebElement monthDD = driver
				.findElement(By.xpath("//span[@aria-describedby='birthday-error-message']/span/select[2]"));

		Select sel2 = new Select(monthDD);

		sel2.selectByIndex(6);

		// Drop down Year

		WebElement yearDD = driver
				.findElement(By.xpath("//span[@aria-describedby='birthday-error-message']/span/select[3]"));

		Select sel3 = new Select(yearDD);

		sel3.selectByVisibleText("2011");

		// Radio button click
		WebElement radioBtn = driver.findElement(By.xpath("//input[@id='sex' and @value='2']"));
		radioBtn.click();

	}

}
