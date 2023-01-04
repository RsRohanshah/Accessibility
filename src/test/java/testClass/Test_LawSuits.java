package testClass;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pom.LawSuits;
import utility.Browser;
import utility.Screenshot;

public class Test_LawSuits 
  {

	WebDriver driver;
	static ExtentReports extent;
	static ExtentTest logger;
	SoftAssert asserts = new SoftAssert();
	@BeforeClass
	public void openOnce()
	{
		WebDriver driver = Browser.ChromeBrowser();
		this.driver=driver;
		
		
	}
	@BeforeMethod
	public void extentreport()
	{
		ExtentHtmlReporter reporter = new ExtentHtmlReporter
				("./test-output/Report.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		logger=extent.createTest("getData");
		
	}
	
	@Test
	public void getData()
	{
		LawSuits law= new LawSuits(driver);
		String a = law.fetchLawsuit1();
		asserts.assertEquals(a, "Plaintiff Name: ANDREW TORO Filing date: November 30, 2022 State of filing: New York Defendant Name: Think...");
		law.fetchLawsuit2();
		law.fetchLawsuit3();
		String d= law.fetchLawsuit4();
		asserts.assertEquals(d, "Plaintiff Name: LAMAR BROWN Filing date: November 30, 2022 State of filing: New York Defendant Name: Bella Vita,");
		law.fetchLawsuit5();
		law.fetchLawsuit6();law.fetchLawsuit7();law.fetchLawsuit8();
		law.fetchLawsuit9();law.fetchLawsuit10();law.fetchLawsuit11();
		law.fetchLawsuit12();law.fetchLawsuit13();law.fetchLawsuit14();
		law.fetchLawsuit15();
		
		asserts.assertAll();
	}
	
	@AfterMethod
	public void cap(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String path = Screenshot.CaptureScreenshot(driver);
			logger.fail(result.getThrowable().getMessage(),
					MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		}
		extent.flush();
	}
	@AfterClass()
	public void close()
	{
		driver.quit();
	}
  }
