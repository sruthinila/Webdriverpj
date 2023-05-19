package testngpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;





public class Reportgen 
{
WebDriver driver;
String baseurl="https://www.facebook.com";
ExtentHtmlReporter reporter;
ExtentTest test;
ExtentReports extent;
@BeforeTest
public void bt() 
{
	reporter=new ExtentHtmlReporter("./Reports/myreport1.html");
	reporter.config().setDocumentTitle("Automationreoport");
	reporter.config().setReportName("functional Test");
	reporter.config().setTheme(Theme.DARK);
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("hostname","localhost");
	extent.setSystemInfo("os","windows10");
	extent.setSystemInfo("testername","abc");
	extent.setSystemInfo("browsername","chrome");
	driver=new ChromeDriver();
	
}
@BeforeMethod
public void bm()
{
	driver.get(baseurl);
}

@Test
public void fbtitleverification()
{
	test=extent.createTest("Fbtitleverifiction");
	String Exp="facebook";
	String actual=driver.getTitle();
	Assert.assertEquals(Exp, actual);
	
   
	
}
@Test
public void fbbuttontest()
{
	test=extent.createTest("Fbbuttontest");
	String buttontext=driver.
	findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/"
			+ "div[1]/div[2]/div[2]/form[1]/div[1]/div[3]/button[1]"))
	.getText();
	Assert.assertEquals(buttontext, "register");
}
@Test
public void fblogotest() throws Exception
{
	test=extent.createTest("Fblogotest");
	boolean b=driver.
findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]"))
.isDisplayed();
	Assert.assertTrue(b);
	
}
@AfterTest
public void end()
{
	extent.flush();
}
@AfterMethod()
public void browserclose(ITestResult result)
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
	test.log(Status.FAIL,"testcase failed is"+result.getName());	
	test.log(Status.FAIL,"testcase failed is"+result.getThrowable());

	}
	else if(result.getStatus()==ITestResult.SKIP)
	{
		test.log(Status.FAIL,"skipped testcase is"+result.getName());
	}
	else if(result.getStatus()==ITestResult.SUCCESS)
	{
		test.log(Status.PASS,"testcase passed is"+result.getName());
	}
	
	
}
}
