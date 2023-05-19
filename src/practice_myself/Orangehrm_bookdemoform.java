package practice_myself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Orangehrm_bookdemoform 
{

	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/hris-hr-software-demo/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() throws Exception
	{
		driver.findElement(By.name("FullName")).sendKeys("Sruthi Karthikeyan");
		driver.findElement(By.name("Email")).sendKeys("sruthinila93@gmail.com");
	    WebElement dd=driver.findElement(By.id("Form_getForm_Country"));
	    Select dd1=new Select(dd);
	    dd1.selectByVisibleText("Angola");
		driver.findElement(By.id("Form_getForm_Contact")).sendKeys("9947691445");
		//Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")));
		driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("//*[@id=\"Form_getForm_action_submitForm\"]")).click();
		
		
		
		
	}	
	}


