package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script02 
{
	@Test(invocationCount = 2)
	public void Testcase()
	{
		Reporter.log("Hello", true);
	}
	@Test(invocationCount = 0)
	public void Testcase1()
	{
		Reporter.log("Good Morning", true);
	}


}
