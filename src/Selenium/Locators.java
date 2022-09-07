package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
/*
		
						Types Of Locators
		
				driver.findElement(By.id(null));
				driver.findElement(By.linkText(null));
				driver.findElement(By.name(null));
				driver.findElement(By.className(null));
				driver.findElement(By.partialLinkText(null));
				driver.findElement(By.tagName(null));
				driver.findElement(By.xpath(null));
				driver.findElement(By.cssSelector(null));
				
																													*/
		
	/*	driver.findElement(By.xpath("//input[@type ='text']")).sendKeys("sawadatkarshivam@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("123456789");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		*/
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sawadatkarshivam@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).clear();	
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234567890");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@value='1']")).click();
		//driver.findElement(By.xpath("//input[text()='text']")).click();
		

	}

}
