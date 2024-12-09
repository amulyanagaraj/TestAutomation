package testNg;


import org.testng.annotations.Test;

public class Script03 
{
	@Test(priority = 0)
	public void Signup()
	{
		System.out.println("signup is successfull");
	}
	@Test(priority = 1)
	public void Login()
	{
		System.out.println("login is successfull");
	}
	@Test(priority = 2)
	public void Homepage()
	{
		System.out.println("homepage is successfull");
	}
	@Test(priority = 3)
	public void Logout()
	{
		System.out.println("logout is successfull");
	}


}
