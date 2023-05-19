package practice_myself;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Linkcount1 
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void tes1()
	{
		List <WebElement> linkcount=driver.findElements(By.tagName("a"));
		System.out.println("no of links is:"+linkcount.size());
	}

}
