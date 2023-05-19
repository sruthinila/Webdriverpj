package testngpgms;

import org.testng.annotations.Test;

public class Test_ng_groping 
{
	
	@Test(groups= {"smoke","sanity"})
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(groups= {"smoke"})
	public void Test2()
	{
		System.out.println("test2");
	}
	@Test(groups= {"regression"})
	public void Test3()
	{
		System.out.println("test3");
	}
	@Test(groups= {"regression"})
	public void Test4()
	{
		System.out.println("test4");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
