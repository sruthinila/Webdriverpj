package practice_myself;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Screenshot_practice_2 
{
	WebDriver driver;
	@BeforeClass
	
	public void setup()
	{
		//WebDriver driver;
		driver=new ChromeDriver();
	}
	@Test
	public void tes1() throws Exception
	{
		driver.get("https://www.amazon.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;//ts is the reference of takesScreenshot interface
		                       //reference object of webdriver interface is casted to Takesscreenshot
		                       //converting driver object to takesScreenshot
		File src=ts.getScreenshotAs(OutputType.FILE);//calling getscreenshotas method using ts(reference object of takesscreenshot)
		         //OutputType is an interface which defines the outputtype of screenshot
		File target=new File(".//Screenshot//s11.png");
		FileHandler.copy(src, target);//Using Filehandler class copying source file to destination file
		
	}
	

}
