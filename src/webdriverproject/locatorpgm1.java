package webdriverproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorpgm1
{
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void setUp()
	{
	driver.get("https://www.facebook.com");
	}
	@Test
	public void test()
	{
		driver.findElement(By.name("email")).sendKeys("abc");
		driver.findElement(By.name("pass")).sendKeys("123@abc");
		driver.findElement(By.name("login")).click();
	}
	@After
	public void end()
	{
		
	}

}
