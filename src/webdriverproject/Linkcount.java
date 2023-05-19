package webdriverproject;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount
{
	 ChromeDriver driver=new ChromeDriver();
     @Before
     public void setUp()
     {
     	driver.get("https://register.rediff.com/register/"
     + "register.php?FormName=user_details");
     }
     @Test
     public void test()
     {
    	 List <WebElement> linkcount=driver.findElements(By.tagName("a"));
    	 System.out.println("link count is "+linkcount.size());
     }
}
