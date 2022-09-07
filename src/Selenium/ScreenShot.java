package Selenium;

import java.io.File;

import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.checkerframework.checker.units.qual.Time;
import org.checkerframework.common.reflection.qual.NewInstance;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.media.model.Timestamp;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot {
	

	public static void main(String[] args) throws IOException, InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
	/*	for(int i=1;i<=5;i++) {
		
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File dest = new File("C:\\Users\\admin\\Desktop\\Java Files\\shivam"+i+".jpg");
			
			FileHandler.copy(source, dest);
		}
		*/
			//String timestamp = new SimpleDateFormat("yyyy_mm_dd_mm_ss").format(new Date());
		
	//	String timestamp = new SimpleDateFormat("yyyy_MM_dd_mm_ss").format(new Date(1));
		
		//Date d = new Date(0);
		
		//File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
	//	String random = RandomString.make(3);
			
		//File dest = new File("C:\\Users\\admin\\Desktop\\Java Files\\Screenshot\\shiv.jpg");
		
	//	FileHandler.copy(source, dest);
		
	/*	File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("\"C:\\\\Users\\\\admin\\\\Desktop\\\\Java Files\\\\Screenshot\\\\shiv.jpg\"");
		
		FileHandler.copy(source, dest);	*/
		
		String Timestamp = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
		
											//  yyyy_MM_dd_hh_mm_ss
		
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File dest = new File("C:\\Users\\admin\\Desktop\\Java Files\\Screenshot\\devShiv"+Timestamp+".jpg");
			
			FileHandler.copy(source, dest);
	}
	
}
