package testngpgms;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterisationpgm 
{
	ChromeDriver driver=new ChromeDriver ();
	@BeforeTest
	public void setUp()
	{
		driver.get("https://www.google.com");
	}
	@Parameters("searchvalue")
	@Test
	public void test1(String s)
	{
		driver.findElement(By.name("q")).sendKeys(s,Keys.ENTER);;
	}
	
	
	

}
