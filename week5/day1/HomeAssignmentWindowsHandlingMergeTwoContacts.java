package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.mongodb.gridfs.CLI;

public class HomeAssignmentWindowsHandlingMergeTwoContacts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Initialise ChromeOptions to pass arguments to launch browser as guest
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		options.addArguments("--disable-notification");

		// Launching url after logging in as Guest
		ChromeDriver driver = new ChromeDriver(options);
		// Maximising browser window and adding implicitly wait
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// enter user name in field user name
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		// enter the password in Webelement Password
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");

		// login btn click
		driver.findElement(By.className("decorativeSubmit")).click();

		// CRM
		driver.findElement(By.partialLinkText("CRM")).click();

		// Click on the Contacts button.
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		// Locate Merge Contact and perform Click
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

		// storing the parent window
		String parentWindow = driver.getWindowHandle();
		System.out.println("The Parent Window Address is: " + parentWindow);
		System.out.println(driver.getTitle());

		// Locating and clicking on the lookup icon to select contact

		driver.findElement(By.xpath("//a[@id='ext-gen610']")).click();

		Thread.sleep(2000);

		driver.manage().window().maximize();

		// child window switch it

		// to get the child window

		Set<String> childWindow = driver.getWindowHandles();

		// declare the list
		List<String> listWindow = new ArrayList<String>(childWindow);

		// Navigate to the child window
		driver.switchTo().window(listWindow.get(1));

		// child window
		String childWinOpened = driver.getWindowHandle();
		System.out.println("The Child Window Address is: " + childWinOpened);
		System.out.println(driver.getTitle());

		// selecting the first contact -//a[@class='linktext']

		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		
		// Switch to parent window
				driver.switchTo().window(parentWindow);
				
		// Locating and clicking on the lookup icon to select To Contact

		driver.findElement(By.xpath("//a[@id='ext-gen611']")).click();

		Thread.sleep(2000);

		driver.manage().window().maximize();

		// To get the child window of "To Contact" field

		// follow one more time
		// second time window switch
		// child window switch it

		// to get the child window

		Set<String> childWindow1 = driver.getWindowHandles();

		// declare the list
		List<String> listWindow1 = new ArrayList<String>(childWindow1);

		// Navigate to the child window
		driver.switchTo().window(listWindow1.get(1));

		// child window
		String childWinOpened1 = driver.getWindowHandle();
		System.out.println("The Child Window Address is: " + childWinOpened1);
		System.out.println(driver.getTitle());
		
		
				
		// second resulting contact - id-ext-gen303
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		
		// Switch to parent window
		driver.switchTo().window(parentWindow);
		
		
		// Merge click 
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		// Getting the alert and accepting it to process merge
		Alert mergeAlert = driver.switchTo().alert();
		mergeAlert.accept();
		// To allow for merge process
		Thread.sleep(2000); 
		
		// verify the title of the page 
		
		String pageTitle = driver.getTitle();
		
		if (pageTitle.equals("View Contact | opentaps CRM")) {
			
			System.out.println("Mege is successful and curent browser page is : " + pageTitle);
			
		} else {
			
			System.out.println("Mege is not successful and curent browser page is : " + pageTitle);
		}

		
		
	}

}
