package Selenium;

import java.time.Duration;
import java.util.List;
import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		
		//driver.get("https://www.facebook.com/");
		
		/*  Thread.sleep(3000);
		
		driver.navigate().to("https://twitter.com/login"); 
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		driver.close();
		
		Thread.sleep(4000);
		
		
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		
		
		
		
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String Expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
	
		if(title.equalsIgnoreCase(Expected)) {
			
			System.out.println("It Navigate To Right Page");
		}
		else {
			System.out.println("It Not Navigate To Right age");
		}
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.google.in/");
	
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.google.in/");
		
		
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		
		*/
		
		//WebElement day = driver.findElement(By.id("day"));
		//WebElement month = driver.findElement(By.id("month"));
		//WebElement year = driver.findElement(By.id("year"));
		
		//day.click();
		
		//boolean result = day.isSelected();
		//System.out.println(result);
		
		//Select s = new Select(month);
		//Select s = new Select(year);
		//s.selectByIndex(25);
		//s.selectByValue("20");
		//s.selectByVisibleText("Feb");
		
		//s.selectByIndex(20);
		//s.selectByValue("15");
		//s.selectByVisibleText("Feb");
		
		WebElement element = driver.findElement(By.xpath("//select[@id='year']"));
		
		
			//element.getText();
		//element.getAttribute("class");
			//System.out.println(element);
	//	element.isDisplayed();
		//System.out.println(element);
		
		Select s = new Select(element);
		List<WebElement> option = s.getOptions();	// get Option method gives the option present in the listbox
		System.out.println(option.size());
		
		for(int i=0; i<=option.size()-1;i++) {				// For All Value Printing Then We USe For Loop
			System.out.println(option.get(i).getText());
		}
		/*	boolean result = s.isMultiple();
		System.out.println(result);
		
		if(result==true) {
			System.out.println("Element is Multipale selected");
		}else {
			System.out.println("Element is not Multipale selected, its Single Selected");
		}		*/
		
		
/*	WebElement element1 = driver.findElement(By.xpath("//div[@class='pvl _52lp']"));
		
		String result = element.getText();
		
				String result1 = element.getAttribute("class");
		 
					System.out.println(result);  
					
				
					
					
				boolean xyz = element1.isDisplayed();
				System.out.println(xyz);			*/
	}

}

