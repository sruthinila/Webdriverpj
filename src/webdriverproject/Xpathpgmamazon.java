package webdriverproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpgmamazon 
{
   WebDriver driver;
   
   @Before
   public void setUp()
   {
	   driver=new ChromeDriver();
	   driver.get("https://www.amazon.in");
   }
   
   
   @Test
   public void Test()
   {
	  driver.findElement(null); 
		   
   }
   @After
   public void close()
   {
	   driver.quit();
   }
}
