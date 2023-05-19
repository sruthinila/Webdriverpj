package webdriverproject;

import org.openqa.selenium.chrome.ChromeDriver;

public class pageSourcepgm
{

	public static void main(String[] args)
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	String s=driver.getPageSource();
	if(s.contains("Gmail"))
	{
		System.out.println("text is present");
	}
	else
	{
		System.out.println("text is not present");
	}
}

}
