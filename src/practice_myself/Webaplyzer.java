package practice_myself;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Webaplyzer
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.wappalyzer.com");
			
	}
	@Test
	public void test1()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.
				xpath("//*[@id=\"app\"]/div/"
				+ "main/div/div[1]/header/div/div/div/div[2]/button[2]/span")).click();	
	driver.findElement(By.xpath("//*[@id=\"list-item-50\"]/div/div[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"app\"]/"
	+ "div/main/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/a/div/div/div[2]/span")).click();
driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]"
		+ "/div[1]/div[2]/div[3]/div/div/a/span")).click();
driver.navigate().refresh();
driver.navigate().back();

driver.findElement(By.xpath("//input[@placeholder='Find a technology']")).click();

driver.findElement(By.xpath("//input[@placeholder='E.g. ecommerce or Shopify']")).sendKeys("java",Keys.ENTER);
//driver.navigate().back();

	}

}
