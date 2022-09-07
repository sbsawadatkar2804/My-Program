package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Wait {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		// 1) Implicit Wait
		
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		// Old Version 3.141.59
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// 2) Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		
		
		
		
		
	}

}
