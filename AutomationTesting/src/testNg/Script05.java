package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Script05
{
    @Test
	public void signup()
	{
    	System.out.println("signup is successfull");
	}
	@Test(dependsOnMethods = "signup")
	public void login()
	{
		Assert.fail();
		System.out.println("login is successfull");
	}


}
