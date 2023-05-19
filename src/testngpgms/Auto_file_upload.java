package testngpgms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Auto_file_upload 
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
		driver.get("https://www.ilovepdf.com/word_to_pdf");
	}
	@Test
	public void test1() throws IOException
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		Runtime.getRuntime().exec("");
	}
	

}
