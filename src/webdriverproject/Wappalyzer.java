package webdriverproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wappalyzer 

{
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void setUp()
	{
		driver.get("https://www.wappalyzer.com");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span"
				)).click();
		driver.findElement(By.xpath("//*[@id=\"list-item-50\"]/div/div[1]")).click();
		//driver.findElement(By.xpath("	driver.findElement(By.xpath(\"//*[@id="
				//+ "\\\"list-item-50\\\"]/div/div[1]\")).click();")).click();
		driver.findElement(By.xpath("//*[@id=\"list-item-50\"]/div/div[1]")).click();
	

}
}
