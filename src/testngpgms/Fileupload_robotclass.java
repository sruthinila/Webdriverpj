package testngpgms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fileupload_robotclass
{
	ChromeDriver  driver =new ChromeDriver();
	@Test
	public void test() throws Exception
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		fileuploadpgm("C:\\Users\\SONY\\Desktop\\Doc1.docx");
		
	}
	@Test
	public void fileuploadpgm (String p) throws AWTException
	{
		StringSelection strSelection =new 	StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().
		setContents(strSelection,null );
		Robot robot=new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(200);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
	
	

}
