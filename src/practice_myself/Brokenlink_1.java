package practice_myself;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Brokenlink_1 
{
     WebDriver driver;
     @BeforeClass
     public void setup()
     {
    	 driver=new ChromeDriver();
    	 driver.get("https://www.mathathumpoly.com/");
    	 driver.manage().window().maximize();
     }
     @Test
     public void test1()
     {
    	 List<WebElement>links=driver.findElements(By.tagName("a"));
    	 for(WebElement link:links)
    	 {
    		  String linkURL= link.getAttribute("href");
    		try
    		{
    			  URL url=new URL(linkURL);
    			  HttpURLConnection con= (HttpURLConnection) url.openConnection();
    			  if(con.getResponseCode()==404)
    			  {
    				System.out.println(linkURL+" ..."+con.getResponseCode());  
    			  }
    		}
    		catch(Exception e)
    		{
    			System.out.println(e.getMessage());
    		}
    	 }
    	 
    	 
    	 
     }
     

}
