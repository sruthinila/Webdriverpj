package testngpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mouserightclick
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
	WebElement right=driver.findElement(By.xpath("/html[1]/body[1]/span[1]"));
	Actions act=new Actions(driver); 
	act.contextClick(right).perform();
	driver.findElement(By.xpath("//body/br[1]")).click();
	
}

}
