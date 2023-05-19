package webdriverproject;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotdemo 
{
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void setUp()
	{
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws IOException
	{
		//TakesScreenshot ts=((TakesScreenshot)driver);//
		
		 //File src=ts.getScreenshotAs(OutputType.FILE);
		// FileHandler .copy(src,new File("D://screenshots//er1.png"));//To copy the file to a location
		
		 //FileHandler.copy(src,new File(".//Screenshot//er.png"));//To copy the file and saving it to a working 
		//directory OR target location
	//SCREENSHOT OF A PORTION.............................................................
		
	// WebElement search=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
			//File src1=search.getScreenshotAs(OutputType.FILE); 
		 //FileHandler.copy(src1,new File(".//Screenshot//error1.png"));
		
		//SCREENSHOT OF SPECIFIC WEBELEMENT.........
		
		
	}
	

}
