package testngpgms;




import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandle
{
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/popup.php");
	}
	
	
	@Test
	public void test1()
	{
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent Window title"+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set<String>allWindowHandles=driver.getWindowHandles();
		for(String handle:allWindowHandles)
		{
			System.out.println(handle);
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				String s=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/h2")).getText();
				System.out.println(s);
				driver.close();
			}
			//driver.switchTo().window(parentWindow);
		}
	}

}
