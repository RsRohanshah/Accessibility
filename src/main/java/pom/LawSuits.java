package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LawSuits 
{   
	WebDriver driver;

	JavascriptExecutor exe ;
	
	@FindBy(xpath="(//div[@class='equal_content'])[1]") private WebElement lawsuit1;
	
	@FindBy(xpath="(//div[@class='equal_content'])[2]") private WebElement lawsuit2;
	
	@FindBy(xpath="(//div[@class='equal_content'])[3]") private WebElement lawsuit3;
	
	@FindBy(xpath="(//div[@class='equal_content'])[4]") private WebElement lawsuit4;
	
	@FindBy(xpath="(//div[@class='equal_content'])[5]") private WebElement lawsuit5;
	
	@FindBy(xpath="(//div[@class='equal_content'])[6]") private WebElement lawsuit6;
	
	@FindBy(xpath="(//div[@class='equal_content'])[7]") private WebElement lawsuit7;
	
	@FindBy(xpath="(//div[@class='equal_content'])[8]") private WebElement lawsuit8;
	
	@FindBy(xpath="(//div[@class='equal_content'])[9]") private WebElement lawsuit9;
	
	@FindBy(xpath="(//div[@class='equal_content'])[10]") private WebElement lawsuit10;
	
	@FindBy(xpath="(//div[@class='equal_content'])[11]") private WebElement lawsuit11;
	
	@FindBy(xpath="(//div[@class='equal_content'])[12]") private WebElement lawsuit12;
	
	@FindBy(xpath="(//div[@class='equal_content'])[13]") private WebElement lawsuit13;
	
	@FindBy(xpath="(//div[@class='equal_content'])[14]") private WebElement lawsuit14;
	
	@FindBy(xpath="(//div[@class='equal_content'])[15]") private WebElement lawsuit15;
	
	
	public LawSuits(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public String fetchLawsuit1()
	{
		exe= (JavascriptExecutor)driver;
		exe.executeScript("arguments[0].scrollIntoView(true)",lawsuit1);
		String data =lawsuit1.getText();
	    System.out.println(data);
		return data;
	}
	
	public void fetchLawsuit2()
	{
		String data =lawsuit2.getText();
		System.out.println(data);
	}
	
	public void fetchLawsuit3()
	{
		String data =lawsuit3.getText();
		System.out.println(data);
	}
	
	public String fetchLawsuit4()
	{
		exe= (JavascriptExecutor)driver;
		exe.executeScript("arguments[0].scrollIntoView(true)",lawsuit4);
		String data =lawsuit4.getText();
		System.out.println(data);
		return data;
	}
	
	
	public void fetchLawsuit5()
	{
		String data =lawsuit5.getText();
		System.out.println(data);
	}
	
	public void fetchLawsuit6()
	{
		String data =lawsuit6.getText();
		System.out.println(data);
	}
	
	public void fetchLawsuit7()
	{
		String data =lawsuit7.getText();
		System.out.println(data);
	}
	
	public void fetchLawsuit8()
	{
		String data =lawsuit8.getText();
		System.out.println(data);
	}
	
	public void fetchLawsuit9()
	{
		String data =lawsuit9.getText();
		System.out.println(data);
	}
	
	public void fetchLawsuit10()
	{
		String data =lawsuit10.getText();
		System.out.println(data);
	}
	
	public void fetchLawsuit11()
	{
		String data =lawsuit11.getText();
		System.out.println(data);
		
	}public void fetchLawsuit12()
	{
		String data =lawsuit12.getText();
		System.out.println(data);
	}
	public void fetchLawsuit13()
	{
		String data =lawsuit13.getText();
		System.out.println(data);
	}
	public void fetchLawsuit14()
	{
		String data =lawsuit14.getText();
		System.out.println(data);
	}
	public void fetchLawsuit15()
	{
		String data =lawsuit15.getText();
		System.out.println(data);
	}
}
