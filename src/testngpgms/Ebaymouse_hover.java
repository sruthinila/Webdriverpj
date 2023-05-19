package testngpgms;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebaymouse_hover 
{
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void before()
	{
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	
        
	}
	@Test
	public void test()
	{
		
		  Actions actions = new Actions(driver);
		
		  WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
			actions.moveToElement(menuOption).perform();
			driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/"
					+ "li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
	}

}
