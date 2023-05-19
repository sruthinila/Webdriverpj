package testngpgms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Confirmation_dismiss_alert
{
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void bm()
	{
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"confirmBox\"]")).click();
		Alert a=driver.switchTo().alert();
		String s=a.getText();
		System.out.println(s);
		a.dismiss();
		WebElement w=driver.findElement(By.xpath("//*[@id=\"output\"]"));
		String s1=w.getText();
		System.out.println(s1);
	}

}
