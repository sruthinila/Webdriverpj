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

public class Screenshot_webelement1 
{
WebDriver driver;
@BeforeClass
public void setup()
{
	driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	
	
}
@Test
public void test1() throws Exception
{
	WebElement search=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
	 File src1=search.getScreenshotAs(OutputType.FILE); 
	 File target=new File(".//Screenshot//s1.png");
	 FileHandler.copy(src1,target);

}
}
