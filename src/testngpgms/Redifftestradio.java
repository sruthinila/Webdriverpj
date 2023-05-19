package testngpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Redifftestradio 
{
	ChromeDriver driver=new ChromeDriver();
	@BeforeTest
	public void setUp()
	{
		
		driver.get("https://register.rediff.com/register/"
	            + "register.php?FormName=user_details");
		
	}
	@Test()
	public void test1()
	{
		/*String str = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).getAttribute("checked");
		if (str.equalsIgnoreCase("true"))
		{
		    System.out.println("Radiobutton selected");
		}*/
		WebElement  rd=driver.findElement(By.id("Register"));
		Boolean b=rd.isEnabled();
		if (b)
		{
		    System.out.println("create my account button is enabled");
		}
		else
		{
			  System.out.println("create my account button is not  enabled");	
		}
		
		//String str1 = driver.FindElement(By.xpath("")).Displayed;
		//Assert.IsTrue(logoPresent);


		
	}
	@Test()
	public void test2()
	{
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		Boolean b1=logo.isDisplayed();
		if(b1)
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is  not present");
		}
	}

}
