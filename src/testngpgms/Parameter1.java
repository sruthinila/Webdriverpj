package testngpgms;



import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 
{
	
	
	@Parameters("a")
	@Test
	public void test1(String s)
	{
	System.out.println("value is:"+s);
	}
}
