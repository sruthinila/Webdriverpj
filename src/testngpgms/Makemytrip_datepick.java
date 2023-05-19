package testngpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Makemytrip_datepick 
{
	ChromeDriver driver =new ChromeDriver();
	@BeforeTest
	public void setUp()
	{
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() throws Exception
	{
		driver.findElement(By.xpath("//*[@class='fsw_inputBox dates inactiveWidget ']/label/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/span")).click();
		
		
		
			Thread.sleep(800);
			WebElement month=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/"
					+ "div/div/div/div[2]/div/div[2]/div[1]/div[1]/div"));
			String months=month.getText();
			
			//System.out.println(months);
			if(months.equals("March 2023"))
			{
				System.out.println(months);
			}
			else
			{
			            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]"
			            		+ "/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
			}
			
		
		}
		
	}
	


