package frameworks;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase02 extends Genericscript
{
	@Test
	public void psw()
	{
		boolean displayed = driver.findElement(By.id("pass")).isDisplayed();
		boolean enabled = driver.findElement(By.id("pass")).isEnabled();
		driver.findElement(By.id("email")).sendKeys("Admin@123");
		System.out.println(displayed+""+enabled);	
		
	}
	

}
