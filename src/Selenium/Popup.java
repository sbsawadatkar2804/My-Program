package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		Thread.sleep(2000);
		
		// Alert Popup
		
	/*	driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();			*/
		
		// Confirm Alert Popup
		
	/*	driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		
		driver.switchTo().alert().dismiss();		*/
		
		// PramotAlert Popup
		
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		
		Thread.sleep(2000);
		
		String x = driver.switchTo().alert().getText();
		
		System.out.println(x);
		
		driver.switchTo().alert().accept();
		
	}

}
