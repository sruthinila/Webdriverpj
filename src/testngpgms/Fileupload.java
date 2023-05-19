package testngpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload 
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
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
	
        
	}
	@Test
	public void test1()
	{
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        uploadElement.sendKeys("C:\\Users\\SONY\\Desktop\\alert1.html");
       
        WebElement textb=driver.findElement(By.xpath("//*[@id=\"terms\"]"));
 		Boolean b1=textb.isSelected();
 		if(b1)
 		{
 			System.out.println("checkbox is selected");
 		}
 		else
 		{
 			System.out.println("checkbox is not selected");
 		}
 		textb.click();
 		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}
}
	 

