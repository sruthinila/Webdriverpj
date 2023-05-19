package practice_myself;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Screenshot_amazonelement 
{
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void test() throws Exception
	{
		WebElement w=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
		File src=w.getScreenshotAs(OutputType.FILE);
		File target=new File(".//Screenshot//s2.png");
		FileHandler.copy(src, target);
	}
	

}
