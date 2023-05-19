package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createpage 
{
	WebDriver driver;
	By createpagelink=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By getstarted=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");
	
	public  Createpage (WebDriver driver)
	{
		this.driver=driver;
	}
	public void click1()
	{
		driver.findElement(createpagelink).click();
		
	}
	public void getstart()
	{
		driver.findElement(getstarted).click();
	}
}

