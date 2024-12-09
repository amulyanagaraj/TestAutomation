package facebookTesting;

import org.testng.annotations.Test;

public class Testcase01 extends BasePage
{
	@Test
	public void login() throws InterruptedException
	{
		LoginPage1 lp= new LoginPage1(driver);
		lp.Enterusn();
		lp.Enterpsw();
		driver.navigate().refresh();
		Thread.sleep(2000);
		lp.Enterusn();
		lp.Enterpsw();
	}
	

}
