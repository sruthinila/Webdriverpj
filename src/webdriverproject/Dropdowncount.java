package webdriverproject;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowncount 
{
	
	
	
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void setUp()
	{
		driver.get("https://register.rediff.com/register/"
	            + "register.php?FormName=user_details");
		
	}
	@Test
	public void test()
	{
		Select dropDown=new  Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")));
		 List <WebElement> elementCount=  dropDown.getOptions();
		 System.out.println("number of items :"+elementCount.size());
		
	}


}
