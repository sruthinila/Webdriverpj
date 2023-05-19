package testngpgms;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven 
{

	ChromeDriver driver;

	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	
	@Test
	public void test1() throws Exception
	{
		FileInputStream f=new FileInputStream("C:\\Users\\SONY\\Desktop\\selenium\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);//excel workbook
		XSSFSheet sh=wb.getSheet("Sheet1");//sheet details
		int rowcount=sh.getLastRowNum();//row count
		for(int i=1;i<=rowcount;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("username:"+username);
			System.out.println("password:"+password);
			driver.get("https://www.facebook.com");
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			//String actualurl=driver.getCurrentUrl();
			
			
		}
		
		
	}
	

}
