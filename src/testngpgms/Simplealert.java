package testngpgms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simplealert 
{
	ChromeDriver driver;

	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void m()
	{
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	}
	@Test
	public void test1() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"alertBox\"]")).click();
		Alert simple=driver.switchTo().alert();
		String alert=simple.getText();//to store the text get from alert in a string
		System.out.println(alert);
		
		simple.accept();
		Thread.sleep(2000);//give 2 seconds to see the alert is closed or not 
		
		
	}
	
	
	
	}


