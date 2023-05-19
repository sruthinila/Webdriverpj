package webdriverproject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link200 
{
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void setUp()
	{
	driver.get("https://www.facebook.com/");
	}
	@Test
	public void test()
	{
		List<WebElement>l=driver.findElements(By.tagName("a"));
		System.out.println("total no of links:"+l.size());
		for(WebElement link:l)
		{
			String linkdetails=link.getAttribute("href");
			verify(linkdetails);
		}
	}
	private void verify(String linkdetails)
	{
		try
		{
			URL u=new URL(linkdetails);
		    u.openConnection();
		    HttpURLConnection con=(HttpURLConnection)u.openConnection();
		    con.connect();
		    con.setConnectTimeout(4000);
		    if(con.getResponseCode()==200)
		    {
                System.out.println("responsecode status is 200:sucess");
		    }
		    else if(con.getResponseCode()==404)
		    {
		    	 System.out.println("responsecode status is 404:sucess");
		    }
			
		}
		catch(Exception e)
		{
			 System.out.println(e.getMessage());
			
		}
		
	}

}
