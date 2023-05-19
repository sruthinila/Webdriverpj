package basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass 
{
	public WebDriver driver;
	@BeforeClass
	public void precondition()
	{
		driver=new ChromeDriver();//initialise the chrome driver
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void postcondition()
	{
		driver.quit();//to close the browser
	}

}
