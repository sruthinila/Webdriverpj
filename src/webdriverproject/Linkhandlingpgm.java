package webdriverproject;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Linkhandlingpgm 
{
	
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void setUp()
	{
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	


	}
	@Test
	public void Test()
	{
		//driver.findElement(By.linkText("See all deals")).click();
	//HOW TO CAPTURE ALL THE LINKS......
		//driver.findElements(By.tagName("a"));//to get all the links
		List<WebElement> l=driver.findElements(By.tagName("a")); //store them to a array list as web element type
		  
		//l.size(); give the number of links present
		//System.out.println("no of links is:"+l.size());
		//TO PRINT LINK.IN CONSOLE..................................................
		
		//l.get().getText(); TO PRINT TEXT OF THE LINK
		//l,get().getAttribute("href");//TO PRINT EACH LINK
		//USING FOR LOOP................
		/*for(int i=0;i<l.size();i++)
		{
			//System.out.println(l.get(i).getText());
			System.out.println(l.get(i).getAttribute("href"));
		}*/
		//USING FOREACH LOOP.....
		for(WebElement link:l)
		{
			//System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}
		
		
		
		
		
		
		
		
		
		
	}

}
