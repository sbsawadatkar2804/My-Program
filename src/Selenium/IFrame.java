package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.manage().window().maximize();
	//	driver.manage().window().setPosition(p);
	//	driver.manage().window().setSize(d);
	//	driver.manage().window().minimize();
	
		
			WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
			driver.switchTo().frame(frame);
			
			driver.findElement(By.xpath("/html/body/button")).click();
			
			//driver.switchTo().defaultContent();
			
			driver.switchTo().parentFrame();
			
			driver.findElement(By.xpath("//a[@id='tryhome']")).click();		
	}

}
