package Selenium;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.Point;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SizeNdPosition {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		Dimension  d = new Dimension(300,600);
		
		Thread.sleep(3000);
		
		driver.manage().window().setSize(d);
		
		Point p = new Point(500,600);
		
		driver.manage().window().setPosition(p);

		}
}
