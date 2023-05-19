package webdriverproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffxpathpgm 
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
            	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"))
            	.sendKeys("Sruthy");
            	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/"
            			+ "tbody/tr[7]/td[3]/input[1]")).sendKeys("sruthinila93@gmail.com");
            	//driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]"
            			//+ "/tbody/tr[7]/td[3]/input[2]")).click();
            	WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/"
            			+ "tbody/tr[22]/td[3]/select[1]"));
            	Select s=new Select(day);
            	s.selectByValue("03");
            	WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/"
            			+ "tbody/tr[22]/td[3]/select[2]"));
            	Select s1=new Select(month);
            	s1.selectByValue("07");
            	WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/"
            			+ "tbody/tr[22]/td[3]/select[3]"));
            	Select s2=new Select(year);
            	s2.selectByValue("2012");
            	
            }

}
