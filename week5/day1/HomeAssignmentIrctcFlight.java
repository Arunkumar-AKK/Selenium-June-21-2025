package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomeAssignmentIrctcFlight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Initialise ChromeOptions to pass arguments to launch browser as guest
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		options.addArguments("--disable-notification");
		
		
		// Launching url after logging in as Guest
		ChromeDriver driver = new ChromeDriver(options);
		// Maximising browser window and adding implicitly wait
		driver.get("https://www.irctc.co.in/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Handling pop-up page and click on Ok button
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		// click on the "FLIGHTS" link.
		
		driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
		
		Thread.sleep(2000); // for loading the new window 
		
		// to get the parent window id 
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("The Parent Window Address is: "+ parentWindow);
		System.out.println(driver.getTitle());
		
		// to get the child window 
		
		Set<String> childWindow = driver.getWindowHandles();
		
		// declare the list 
		List<String> listWindow = new ArrayList<String>(childWindow);
		
		// Navigate to the child window 
		driver.switchTo().window(listWindow.get(1));
		
		// child window 
		String childWinOpened = driver.getWindowHandle();
		System.out.println("The Child Window Address is: "+childWinOpened);
		System.out.println(driver.getTitle());
		
		
		// Switching to parent window to close 
		driver.switchTo().window(parentWindow).close();
				
				
	}

}
