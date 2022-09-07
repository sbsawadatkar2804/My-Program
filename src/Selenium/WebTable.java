package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		// To Find Column in Web Table
		
		List<WebElement> ColumnSize = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/th"));
		
		System.out.println("No Of Column in Web Table "+ColumnSize.size());
		
		// To Find Row in Web Table
		
		List<WebElement> RowSize = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr"));
		
		System.out.println("No Of Row in Web Table "+RowSize.size());
		
	
		// To Find Spcific Cell And PrintOut Them
		
		String Specific = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[2]//td[3]")).getText();
		
		System.out.print(Specific+" ");
		
		
		// To Get All Data in Web Table
		
		for(int i = 2; i<=RowSize.size();i++) {
			
		for(int j=1; j<=ColumnSize.size();j++) {
				
		String All = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td["+j+"]")).getText();
				
		System.out.print(All);
			
			}
		
		System.out.println();		
		}				
		
	}

}
