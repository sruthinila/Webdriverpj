package webdriverproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmlpgmalert 
{
	ChromeDriver driver=new ChromeDriver();


	@Before
	public void setUp()
	{
		driver.get("file:///C:/Users/SONY/Desktop/alert1.html");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alert1=a.getText();
		if(alert1.equals("Hello!I am an alert box!!"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		
driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("abddc");
//driver.findElement(By.xpath("/html/body/input[4]")).click();

		
	}
	

}
