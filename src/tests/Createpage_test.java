package tests;


import org.testng.annotations.Test;

import pages.Createpage;


public class Createpage_test extends Baseclass
{
	
	@Test
	public void test1()
	{
		Createpage ob2=new Createpage(driver);
	
		ob2.click1();
		ob2.getstart();
		
		
	}

}
