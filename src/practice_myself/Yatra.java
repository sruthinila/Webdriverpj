package practice_myself;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Yatra 
{

	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.yatra.com");
	}
	@Test
	public void tes1()
	{
		List<WebElement>links1=driver.findElements(By.tagName("a"));
		int count=links1.size();
		System.out.println("link count is:"+count);
		
	}
	}


