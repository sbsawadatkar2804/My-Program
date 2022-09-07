package Selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopPup {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		Set<String> abc = driver.getWindowHandles();
		
		ArrayList<String> xyz = new ArrayList<String>(abc);
		
		driver.switchTo().window(xyz.get(1));
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
	
		
	
		
		
	
		
		

	}

}
