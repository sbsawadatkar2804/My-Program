package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new  ChromeDriver();
		
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop//");
		
		
		driver.findElement(By.xpath("//li[@id='Accepted Elements']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
		
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag, drop).build().perform();
		
	/*	WebElement more = driver.findElement(By.xpath("//div[@class='exehdJ']"));
		
		act.moveToElement(more).perform();
		
		Thread.sleep(2000);
		
		WebElement Advertise = driver.findElement(By.xpath("//div[text()='Advertise']"));
		
		act.moveToElement(Advertise).perform();
		
		Thread.sleep(2000);
		
		WebElement fashion = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		act.moveToElement(fashion).perform();
		
		Thread.sleep(2000);
		
		// Click&Hold
		
		WebElement menfootware = driver.findElement(By.xpath("(//a[@class='_6WOcW9'])[4]"));
		act.moveToElement(menfootware).clickAndHold().build().perform();		*/
		
		
	}

}
