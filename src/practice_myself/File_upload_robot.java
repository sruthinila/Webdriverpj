package practice_myself;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class File_upload_robot
{
	
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() throws Exception 
	{
		
		driver.findElement(By.xpath("//*[@id=\"heroSection-container\"]/div[3]/div[2]/div[2]")).click();
		
		
		WebElement button1=driver.findElement(By.xpath("//*[@id=\"file-upload\"]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", button1);
		Robot rb=new Robot();
		rb.delay(1000);
		StringSelection ss=new StringSelection("C:\\c\\BHAJITH_BHASI_-_Cover_Letter-1 (1)");
		Toolkit.getDefaultToolkit().getSystemClipboard().
		setContents(ss,null );
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.delay(200);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
		
		
	}
	


