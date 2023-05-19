package practice_myself;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Datadriven1 
{
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
	
		driver.manage().window().maximize();
	}
	@Test
	public void test1() throws Exception
	{
		FileInputStream f=new FileInputStream("C:\\Users\\SONY\\Desktop\\selenium\\fbtest1.xlsx");
		XSSFWorkbook x=new XSSFWorkbook(f); 
		XSSFSheet s=x.getSheet("Sheet1");
		int rowcount=s.getLastRowNum();
		for(int i=1;i<=rowcount;i++)
		{
			String username=s.getRow(i).getCell(0).getStringCellValue();
			String password=s.getRow(i).getCell(1).getStringCellValue();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
		}
		
		
	}
	

}
