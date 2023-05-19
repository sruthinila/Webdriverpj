package testngpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mouse_double 
{
	ChromeDriver driver;
	@BeforeTest
	public void test()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void bm()
	{
		driver.get("https://www.softwaretestinghelp.com/wp-content/qa/uploads/2020/06/click_html.png");
	}
	@Test
	public void test1()
	{
		WebElement d=driver.findElement(By.xpath("/html/body/img"));
		Actions act=new Actions(driver); 
		act.doubleClick(d).perform();
		
	}

}
