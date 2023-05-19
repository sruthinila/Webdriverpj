package practice_myself;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Screenshot_element 
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void test1() throws Exception
	{
		WebElement w1=driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));
		File src=w1.getScreenshotAs(OutputType.FILE);
		File targt=new File(".\\Screenshot\\i2.png");
		FileUtils.copyFile(src, targt);
	}
}
