package webdriverproject;


import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broklinkhandle 
{
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void setUp()
	{
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	


	}
	@Test
	public void Test() 
	{
		
	List<WebElement>l=driver.findElements(By.tagName("a"));	
	
	
	
		 for(WebElement link:l)     //capture href attribute
		 {
			  String s=link.getAttribute("href");  //store in a string  
			  verify(s);
			 
			  
			  
		 }
		
		
	}
	private void verify(String s)
	{
try
{
	URL u=new URL(s);
	HttpURLConnection con=(HttpURLConnection)u.openConnection(); 
	con.connect();
	if(con.getResponseCode()==404)
	{
		System.out.println("brokenlink:"+s);
	}
}
catch(Exception e)
{
	System.out.println(e.getMessage());
}
			
	}
	
	}


