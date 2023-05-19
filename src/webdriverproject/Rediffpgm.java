package webdriverproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffpgm 
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
	  /* String s=driver.getPageSource();
       if(s.contains("register"))
       {
    	   System.out.println("register is present");
       }
       else
       {
    	   System.out.println("register is not  present");
       }
}*/
	//button text validation.....
	 String buttonText = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/"
	 		+ "tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
	 String exp="Check availability";
	 if(exp.equals(buttonText))
		 
{
	        System.out.println("Test Pass");
	        //return true;
	    } 
	 else{
	        System.out.println("Test Failed");
	        //return false;
	    }
	
	
}
}
