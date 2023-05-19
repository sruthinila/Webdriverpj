package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Passworderrorpage 
{
	WebDriver driver;
	By forgottenlink=By.xpath(null);
	By forgottenpassword=By.id(null);
	By forgottenpasswordsearch=By.name(null);
	public void linkclick()
	{
		driver.findElement(forgottenlink).click();
	}
	public void passworderrorpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String mobilenumber)
	{
		driver.findElement(forgottenpassword).sendKeys(mobilenumber);
	}
	public void click()
	{
		driver.findElement(forgottenpasswordsearch).click();
	}

}
