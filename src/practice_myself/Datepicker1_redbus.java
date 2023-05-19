package practice_myself;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker1_redbus
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{    
		 driver=new ChromeDriver();
	     driver.get("https://www.redbus.in/");	
	     driver.manage().window().maximize();
	}
	@Test
	public void test1()
	{
		String year="2023";
		String month="Apr";
		String date="13";//defining variables for year,month,date;
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/span")).click();//opens the date picker
		while(true)
		{
			String monthyear=driver.findElement(By.xpath("//*[@class='monthTitle']")).getText();
			//System.out.println(monthyear);
			String arr[]=monthyear.split(" ");
			String mon=arr[0];
			String yr=arr[1];
			if(mon.equalsIgnoreCase(month)&&yr.equals(year))
			{
				break;
			}
			else
			{
				driver.findElement
				(By.xpath("//button[@id='']")).click();
			}
		}
		List<WebElement>dates1=	driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr/td"));
		for(WebElement date1:dates1)
		{
			String dt=date1.getText();
			if(dt.equals(date))
			{
				//System.out.println(dt);
				date1.click();
				break;
			}
		}
		
		
	
	
	

}
}
