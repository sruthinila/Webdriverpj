package tests;



import org.testng.annotations.Test;

import pages.Fbloginpage;

public class Fblogintest extends Baseclass
{
	
	@Test
	public void test1()
	{
		Fbloginpage ob1=new Fbloginpage(driver);
		ob1.setvalues("ammu@gmail.com", "abcde");
		ob1.login();
		
	}

}
