package practice_myself;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Title_webpage 
{
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1()
	{
		String title1=driver.getTitle();
		//System.out.println(title1);
		String exptitle="Facebook";
		if(title1.equalsIgnoreCase(exptitle))
		{
			System.out.println("title matched is:"+title1);
			
		}
		else
		{
			System.out.println("title is not matched");
		}
		driver.quit();
	}
	

}
