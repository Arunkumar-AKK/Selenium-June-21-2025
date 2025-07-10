package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MarathonTC1PvrCinema {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//	MarathonTC1PvrCinema
		// Not Required for this, use disabbled notification and proceed in alert concept
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		// to maximize
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//choose location as chennai
		driver.findElement(By.xpath("//span[@class='cities-placed']/parent::span")).click();
		
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		
		// 4) Click on Cinema under Quick Book
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		
		// 5) Select Your Cinema
		
		driver.findElement(By.xpath("(//span[@class='p-dropdown-label p-inputtext p-placeholder'])[2]")).click();
		
		driver.findElement(By.xpath("//li[@class='p-dropdown-item'][2]")).click();
		
		//6) Select Your Date as Tomorrow

		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		
		//7) Select Your Movie
		
		driver.findElement(By.xpath("(//span[text()='3 BHK'])[2]")).click();
		
		// 8) Select Your Show Time
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='p-dropdown-item'][2]")).click();
		
		// 9) Click on Book Button
		
		driver.findElement(By.xpath("(//span[@class='p-button-label p-c'])[5]")).click();
		
		// Click Accept on Term and Condition
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		// 11) Click any one available seat - it will select the empty seat
		
		driver.findElement(By.xpath("//span[@class='seat-current-pvr']")).click();
		
		// Click Proceed Button
		
		driver.findElement(By.xpath("//div[@class='register-btn']")).click();
		
		// 13 Print the Seat info under book summary
		
		String SeatNumber = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		
		System.out.println(SeatNumber);
		
		// 14 Print the grand total under book summary
		
		WebElement GrandTotal = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']/h6/span"));
		System.out.println(GrandTotal);
		
		//15 Click continue and then Proceed Button
		
		driver.findElement(By.xpath("//button[@class='fb-added-btndesk']")).click();
		
		//  proceed 
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		
		// close 
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		// 17) Print Your Current Page title
		System.out.println(driver.getTitle());
		
	}

}
