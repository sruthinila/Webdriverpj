package webdriverproject;



import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{

	   ChromeDriver driver=new ChromeDriver();
	  @Before
	  public void setUp()
	  {
		  driver.get("https://www.amazon.in/"); 
	  }
	  @Test
	  public void test() throws IOException
	  {
		  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(src,new File("D://errorimage.png"));
		 // WebElement search=driver.findElement(By.xpath(""));
		// File src1=search.getScreenshotAs(OutputType.FILE); 
		// FileHandler.copy(src1,new File("./Screenshot//error.png"));
	  }


}
