package utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
	 
	public static String CaptureScreenshot(WebDriver driver) throws IOException
	{
		Date a = new Date();
		
		String date = a.toString().replace(":", "-");
		
		File get = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String path="./test-output/"+date+".png";
		File source = new File(path);
		
		FileHandler.copy(get, source);
		
		return path;
		
	}

}
