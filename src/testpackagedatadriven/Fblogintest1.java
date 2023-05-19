package testpackagedatadriven;

import org.testng.annotations.Test;

import basepackage.Baseclass;
import pagepackagedatadiven.Fbloginpage;
//import pagepackagedatadiven.Fbloginpage;
import utilitiesdatadriven.Excelutils;

public class Fblogintest1 extends Baseclass
{
    @Test
	public void verifylogin()
	{
    	Fbloginpage ob1=new Fbloginpage(driver);
    	//READING THE DATA FROM EXCEL FILE BY THE SPECIFIED PATH............
    	String xl="E:\\SoftwareTesting\\Dataexcel.xlsx";
    	String Sheet="Sheet1";
    	int rowCount=Excelutils.getRowCount(xl, Sheet);
    	for(int i=1;i<=rowCount;i++)
    	{
    		String Username=Excelutils.getCellValue(xl, Sheet, i, 0);
    		System.out.println("username:"+Username);
    		String password=Excelutils.getCellValue(xl, Sheet,i,1);
    		System.out.println("Password:"+password);
    		//passing Username,password as parameters................................
    		ob1.setValues(Username, password);
    		//submitting the data by clicking on login button
    		ob1.clicklogin();
       /*    String expectedurl="//*[@id=\"u_0_5_ZX\"]"; 
           String actualurl=driver.getCurrentUrl();
           if(actualurl.equals(expectedurl))
           {
        	  System.out.println("pass"); 
           }
           else
           {
        	   System.out.println("fail");
           }
    		*/
    	}
	}
}
