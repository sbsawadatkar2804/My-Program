package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpandDown {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new  ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		
		driver.get("https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollIntoView");
		
	//	JavascriptExecutor js = ((JavascriptExecutor)driver);
	/*	
		// Scroll Upp
		js.executeScript("window.scrollBy(0,1500)");
		
		Thread.sleep(2000);
		
		// Scroll Down
		
		js.executeScript("window.scrollBy(0,-900)");
		
		Thread.sleep(2000);
		
		// Scroll Left
		
		js.executeScript("window.scrollBy(500,0)");
		
		Thread.sleep(2000);
		
		// Scroll Right
		
		js.executeScript("window.scrollBy(-600,0)");				*/
		
		
		// Scroll Into View
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='About']"));
	
		JavascriptExecutor js1 = ((JavascriptExecutor)driver);
		
		js1.executeScript("arguments[0].scrollIntoView(true);",ele);
		
	}

}
