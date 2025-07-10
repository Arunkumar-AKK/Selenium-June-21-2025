package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithAdvXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/");
		// to maximize
		driver.manage().window().maximize();
		// Webelement username
//		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//form[@id='login']/p/label/following-sibling::input"))
				.sendKeys("demosalesmanager");

		// Webelement pass
//		WebElement pwd = driver.findElement(By.name("PASSWORD"));
		WebElement pwd = driver.findElement(By.xpath("(//form[@id='login']/p/label/following-sibling::input)[2]"));
		pwd.sendKeys("crmsfa");

		// login btn
		driver.findElement(By.className("decorativeSubmit")).click();

		// CRM
		driver.findElement(By.partialLinkText("CRM")).click();

		// Click on leads

		driver.findElement(By.linkText("Leads")).click();

		// click on create lead

		driver.findElement(By.linkText("Create Lead")).click();

		// enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");

		// enter user name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arunkumar");

		// enter second name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");

		// click on sourceDD

		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel = new Select(sourceDD);
		sel.selectByIndex(4);
		// industry
		WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sel2 = new Select(industryDD);
		sel2.selectByValue("IND_FINANCE");

		// Tittle of the page
		String title = driver.getTitle();
		System.out.println(title);

	}

}
