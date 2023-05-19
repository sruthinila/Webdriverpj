package webdriverproject;

import org.openqa.selenium.chrome.ChromeDriver;

public class Applicationname_test {

	public static void main(String[] args)
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	String actualtitle=driver.getTitle();
	System.out.println("actual title is:"+actualtitle);
	String expectedtitle="Google";
	if(actualtitle.equalsIgnoreCase(expectedtitle))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	}

}
