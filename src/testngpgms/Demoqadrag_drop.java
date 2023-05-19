package testngpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demoqadrag_drop 
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
		driver.get("https://demoqa.com/droppable");
	}
	@Test
	public void test1()
	{
		WebElement from=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement to=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		//WebElement d=driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		//firstname.sendKeys("arun");
		Actions act=new Actions(driver);
		//act.keyDown( firstname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		//act.keyDown( firstname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		//act.keyDown( rid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.dragAndDrop(from, to).build().perform();
		act.perform();
		String text=to.getText();
		String exp="Dropped!";
		if(text.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("failed");
		}

	
}
	
	
}