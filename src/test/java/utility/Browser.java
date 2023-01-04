package utility;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser 
 {

	
	static WebDriver driver;
	
	public static WebDriver ChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver",
				"src"+File.separator+"test"+File.separator+"resources"
				+ File.separator+"driver"+File.separator+"chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.accessibility.com/digital-lawsuits");
		driver.manage().window().maximize();
		
		return driver;
	}
 }
