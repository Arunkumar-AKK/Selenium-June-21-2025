package week2.day2;

import org.jsoup.select.Evaluator.ContainsText;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.IFactoryAnnotation;

public class CreateAccountHomeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// **NOTE**-->> Always enter a new user name to avoid the duplicate creation

		// to log in as Guest in chrom Driver
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		// Initialize Chrome driver
		ChromeDriver driver = new ChromeDriver(options);

		// Passing url
		driver.get("http://leaftaps.com/opentaps/");

		// maximize window
		driver.manage().window().maximize();

		// enter user name in field user name
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		// enter the password in Webelement Password
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");

		// login btn click
		driver.findElement(By.className("decorativeSubmit")).click();

		// CRM
		driver.findElement(By.partialLinkText("CRM")).click();

		// accounts click
		driver.findElement(By.partialLinkText("Accounts")).click();

		// create account click
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();

		// enter account name change it every time when you run since duplicate account
		// ***********can't be created*************
		WebElement accountName = driver.findElement(By.id("accountName"));
		accountName.sendKeys("ArunTest7");
		System.out.println(accountName);

		// enter description as "Selenium Automation Tester."
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");

		// enter Number Of Employees field
		driver.findElement(By.id("numberEmployees")).sendKeys("5");

		// Enter a Site Name as “LeafTaps”
		// driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");

		// Industry DropDown: Select "ComputerSoftware" from DropDown
		WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		Select sel1 = new Select(industryDD);
		sel1.selectByIndex(3);

		// Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select sel2 = new Select(ownershipDD);
		sel2.selectByVisibleText("S-Corporation");

		// Select "Employee" as the source using SelectByValue.
		WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
		Select sel3 = new Select(sourceDD);
		sel3.selectByValue("LEAD_EMPLOYEE");

		// Select "eCommerce Site Internal Campaign" as the marketing campaign using
		// SelectByIndex.
		WebElement marketingCampaignDD = driver.findElement(By.id("marketingCampaignId"));
		Select sel4 = new Select(marketingCampaignDD);
		sel4.selectByIndex(6);

		// Select "Texas" as the state/province using SelectByValue.
		WebElement stateProvinceDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sel5 = new Select(stateProvinceDD);
		sel5.selectByValue("TX");

		// Click the "Create Account" button
		driver.findElement(By.className("smallSubmit")).click();

		// get the title of the page and verify it
		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals(title)) {

			System.out.println("The Page Tittle is as Expected: " + title);

		} else {
			System.out.println("The Page Tittle is Not as Expected:");
		}

		// Verify that the account name is displayed correctly.

		// locate the element Account Name
		// "//span[contains(text(),'ArunTest')]" since xpath is dynamically changing for
		// each execution
		WebElement accNameVerification = driver.findElement(By.xpath("//span[contains(text(),'ArunTest')]"));
		accNameVerification.getText();
		System.out.println(accNameVerification);

		String text = accNameVerification.getText();
		if (text.equals(text)) {
			System.out.println("The User account name is displayed correctly." + text);

		}

		// To close the current window
		// driver.close();

	}

}
