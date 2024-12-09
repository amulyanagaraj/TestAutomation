package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script01
{
	@Test
	public void Testcase()
	{
		Reporter.log("Hello", true);
	}
	@Test
	public void Testcase1()
	{
		Reporter.log("Good Morning", true);
	}

}
