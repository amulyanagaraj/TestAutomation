package frameworks;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase01 extends Genericscript
{
	@Test
	public void usn()
	{
	boolean displayed = driver.findElement(By.id("email")).isDisplayed();
	
	boolean enabled = driver.findElement(By.id("email")).isEnabled();
	driver.findElement(By.id("email")).sendKeys("Admin");
		
		
	
	System.out.println(displayed+""+enabled);
	}
	
	
	

}
