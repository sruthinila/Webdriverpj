package webdriverproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo 
{
	 ChromeDriver driver;

	@Before
	public void setup()
	{
		  driver=new ChromeDriver();
		 driver.get("https://www.google.com");
	}
	
     @Test
	public void test()
	{
		String actualtitle=driver.getTitle();
		String expectation="Google";
		if(expectation.equalsIgnoreCase(actualtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
     @After
     public void tearDown()
     {
    	 driver.quit();
     }
	
}

