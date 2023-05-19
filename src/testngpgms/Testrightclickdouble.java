package testngpgms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testrightclickdouble
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
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void test1() 
	{
		WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act=new Actions(driver); 
		act.contextClick(right).perform();	
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
		driver.switchTo().alert().accept();
		WebElement dclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(dclick).perform();
		Alert n=driver.switchTo().alert();
		String s1=n.getText();
		System.out.println(s1);
		
		
		
				
				
				
		
	
		
		//String alert1=a.getText();
		//System.out.println(alert1);
		
		
		
	}
	
	
	

}
