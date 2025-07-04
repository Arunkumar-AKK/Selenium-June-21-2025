package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TestFaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("Guest");
		ChromeDriver driver =new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.partialLinkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Karunya");
		driver.findElement(By.name("lastname")).sendKeys("Selvaraj");
		driver.findElement(By.name("reg_email__")).sendKeys("karunyarajan95@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Anu123");
		
		WebElement date=driver.findElement(By.id("day"));
		Select obj=new Select(date);
		obj.selectByValue("25");
	
	    WebElement month=driver.findElement(By.id("month"));
	    Select obj1=new Select(month);
	    obj1.selectByIndex(6);
	    
	    WebElement year=driver.findElement(By.id("year"));
	    Select obj2=new Select(year);
	    obj2.selectByVisibleText("1991");
	    
		WebElement radio = driver.findElement(By.xpath("//input[@name='sex' and @value='1']"));
		radio.click();

	}

}
