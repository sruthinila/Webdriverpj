package testngpgms;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepick_pgm 
{

	ChromeDriver driver =new ChromeDriver();
	@BeforeTest
	public void setUp()
	{
		driver.get("https://www.expedia.co.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"wizardMainRegionV2\"]"
				+ "/div/div/div/div/ul/li[2]/a/span")).click();//flights
		driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();//button for calender
		Thread.sleep(800);

		WebElement month=driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]"
				+ "/div[2]/div[2]"
			+ "/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2"));//month locate
				String months=month.getText();
				
				//System.out.println(months);
				if(months.equals("March 2023"))
				{
					System.out.println(months);
					
				}
				else
				{
			driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/"
			+ "div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
				}
				List<WebElement> dates=driver.findElements(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/"
						+ "div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button"));			
				for(WebElement date1:dates)
				{
					String date=date1.getAttribute("data-day");
					//System.out.println(date);
					if(date.equals("18"))
					{
						date1.click();
						System.out.println("date selected");
					}
					
				}
			
				
		
		

	
		
}	
		

}


