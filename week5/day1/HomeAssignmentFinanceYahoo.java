package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeAssignmentFinanceYahoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://finance.yahoo.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// hower on the more icon 
		WebElement moreIconEle = driver.findElement(By.xpath("//button[@aria-label='More']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(moreIconEle);
		
		WebElement cryptoEle = driver.findElement(By.xpath("(//a[text()='Crypto '])[3]"));
		act.click(cryptoEle).perform();
		
		
		// locate the table
		
		////Finding number of Rows in table
		List<WebElement> rowsNumber = driver.findElements(By.xpath("//*[@class='yf-ao6als bd']/tbody/tr/td[1]"));
		int rowCount = rowsNumber.size();
		System.out.println("No of rows in this table : " + rowCount);
		
		// Finding Number of columns in table 
		//Finding number of Columns

		List<WebElement> columnsNumber = driver.findElements(By.xpath("//*[@class='yf-ao6als bd']/thead/tr[1]/th"));
		int columnCount = columnsNumber.size();
		System.out.println("No of columns in this table : " + columnCount);
		
		//Finding cell value at 4th row and 3rd column

		WebElement cellAddress = driver.findElement(By.xpath("//table[@class='yf-ao6als bd']/tbody/tr[4]/td[4]"));
		String value = cellAddress.getText();
		System.out.println("The Cell Value is : " + value);
		
		
		// Retrieving the cryptocurrency names and print it using getText(). 
		List<WebElement> cryptoCurrencyName = driver.findElements(By.xpath("//table[@class='yf-ao6als bd']/tbody/tr/td[2]"));
//		System.out.println(TrainNames);
				String var = "Bitcoin USD";
				String var1 ="XRP USD";
				boolean check = false;
		List<String> newList = new ArrayList<>();
		
			for (WebElement iter : cryptoCurrencyName) {
				
//				System.out.println(iter.getText());
				
				String textValue = iter.getText();
				newList.add(textValue);
//				System.out.println(textValue);
				
				if (textValue.equalsIgnoreCase(var) || textValue.equalsIgnoreCase(var1) ) {
					
					System.out.println("The Crypto Currance is:" + textValue + "\n");
					
					check = true; 
					
					
				}
				
				} if (check) {
					System.out.println("Found");
					
				}else {
					System.out.println("Not found");
				}
			System.out.println(newList);
			 
				
//				System.out.println("Retrieving the cryptocurrency names :" + " /n" + "------------------------------");
//				
//				for (WebElement iter : cryptoCurrencyName) {
//					
//					if (cryptoCurrencyName.equals("Bitcoin USD") || cryptoCurrencyName.equals("XRP USD") ||  cryptoCurrencyName.equals("Cardano USD") )
//					{
//					System.out.println(iter.getText());
//					
//					}
//					
//				}
				
			
		
	}

}
