package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BreakOutWebTableInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// locate the table
		WebElement element1 = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		element1.clear();
		element1.sendKeys("MAS");
		// locate to station fiend
		WebElement element2 = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		element2.clear();
		element2.sendKeys("MDU");
		
		// uncheck the sort 
		
//		///input[@id='chkSelectDateOnly']
		
		WebElement element3 = driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']"));
		element3.click();
		
		// train name 
		List<WebElement> TrainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
//		System.out.println(TrainNames);
		
		for (WebElement iter : TrainNames) {
			System.out.println(iter.getText());
			
		}
		
		
		
	}

}
