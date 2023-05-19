package practice_myself;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Datepick_4_redbus 
{
	 WebDriver driver;
	   @BeforeClass
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
		   String month="May";
		   String day="10";
		   driver.findElement(By.xpath("//*[@class='fl search-box date-box gtm-onwardCalendar']")).click();
		  while(true)
		  {
			String monthyear=driver.findElement(By.xpath("//*[@class='monthTitle']")).getText();
			String arr[]=monthyear.split(" ");
			String mo=arr[0];
			String yr=arr[1];
			if(mo.equalsIgnoreCase(month)&&yr.equals(year))
			{
				break;
			}
			else
			{
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
			}
			
			// System.out.println(monthyear);
		  }
		List<WebElement>alldays=  driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr/td"));
		for(WebElement day1:alldays)
		{
			String dd=day1.getText();
			if(dd.equals("25"))
				
				
			{
				System.out.println(dd);
				day1.click();
				break;
				
			}
			
			
			
			
		}
		   }
	   
		   

}
