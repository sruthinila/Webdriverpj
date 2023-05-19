package webdriverproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonxpath 
{
ChromeDriver driver=new ChromeDriver();


@Before
public void setUp()
{
	driver.get("https://www.amazon.in");
}
@Test
public void test()
{
driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("phone");
driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("ammu@123");
driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
driver.navigate().back();
driver.navigate().back();

}
}
