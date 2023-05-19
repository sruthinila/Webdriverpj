package testngpgms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo

{
	ChromeDriver driver=new ChromeDriver ();
	@BeforeTest
	public void setUp()
	{
		
	}
	@BeforeMethod()
	public void urlloading()
	{
		driver.get("https://www.facebook.com");
		System.out.println("urlloading");
	}
	@Test(invocationCount=3)
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(priority=3,dependsOnMethods="test1")//test2 will execute after test1
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(priority=1)
	public void test3()
	{
		System.out.println("test3");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	@AfterTest
	public void end()
	{
		driver.quit();
	}

}
