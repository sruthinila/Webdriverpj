package webdriverproject;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wapapp 
{

	ChromeDriver driver=new ChromeDriver();
	@Before
	public void before()
	{
		driver.get("https://www.wappalyzer.com/");
	}
	@org.junit.Test
	public void Test()
	{
		driver.findElement(By.xpath("//*[@class=\"d-none d-md-block flex-grow-1 "
				+ "flex-shrink-0 text-right col\"]/button[2]/span")).click();
		//driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"list-item-50\"]/div[1]")).click();
		
		
		driver.navigate().to("https://www.wappalyzer.com/");
		
		//driver.findElement(By.xpath("//*[@id=\"add-ons\"]/div[2]/div/div[1]/a")).click();
		//driver.navigate().back();
		//driver.findElement(By.xpath("//*[@id=\"list-item-50\"]/div[1]")).click();
		//driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"input-169\"]")).sendKeys("java");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div[1]/div/div/"
				+ "div/div/div/div/div/div[1]/div[2]/div/span/svg")).click();
		
		
		
	}
	
	
	
	
	
}
