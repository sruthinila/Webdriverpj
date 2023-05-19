package pagepackagedatadiven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage 
{
	WebDriver driver;

	By emailfield=By.id("name");//locate emailfield
	By passwordfield=By.id("pass");//locate password field
	By loginbutton=By.name("login");//locating login button
	//initialising the objects
	public Fbloginpage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	//specifying email,password
	public void setValues(String uname,String pwd)
	{
		driver.findElement(emailfield).sendKeys(uname);
		driver.findElement(passwordfield).sendKeys(pwd);
	}
	//clicking on login button
	public void clicklogin()
	{
		driver.findElement(loginbutton).click();
	}

}
