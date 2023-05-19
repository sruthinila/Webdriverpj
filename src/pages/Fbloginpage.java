package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage 
{
	WebDriver driver;
	By fbemail=By.id("email");//repository
	By fbpassword=By.id("pass");//repository
	By fblogin=By.name("login");//repository
	


public Fbloginpage(WebDriver driver)//constructor name same as classname,constructor is used to initialise the class variable and here the variable is driver 
{
	this.driver=driver;//driver value initialised to class variable
}
public void setvalues(String email,String password)
{
	driver.findElement(fbemail).sendKeys(email);
	driver.findElement(fbpassword).sendKeys(password);
	
	
}
public void login()
{
	driver.findElement(fblogin).click();
}
}

