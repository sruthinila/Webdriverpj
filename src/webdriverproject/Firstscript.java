package webdriverproject;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		String s=driver.getTitle();
		String expectation="Google";
		if(s.equalsIgnoreCase(expectation))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
