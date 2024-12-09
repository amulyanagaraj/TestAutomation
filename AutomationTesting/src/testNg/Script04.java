package testNg;

import org.testng.annotations.Test;

public class Script04 
{
	@Test
	public void Signup()
	{
		System.out.println("signup is successfull");
	}
	@Test
	public void Login()
	{
		System.out.println("login is successfull");
	}
	@Test(enabled = false)
	public void Homepage()
	{
		System.out.println("homepage is successfull");
	}
	@Test
	public void Logout()
	{
		System.out.println("logout is successfull");
	}

}
