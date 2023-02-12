package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest 
{
	@BeforeTest
	public void loginToTheApplication()
	{
		System.out.println("Login to the application");
	}
	
	@BeforeMethod
	public void connectToDB()
	{
		System.out.println("DB connected");
	}
	
	@Test(priority = 1, description = "This is login test")
	public void loginTest()
	{
		System.out.println("Login is successfull");
	}

	@Test(priority = 2, description = "This is logout test")
	public void logoutTest()
	{
		System.out.println("Logout is successfull");
	}
	
	@AfterMethod
	public void disconnectToDB()
	{
		System.out.println("DB disconnected");
	}
	
	@AfterTest
	public void logoutFromTheApplication()
	{
		System.out.println("Logout from the application");
	}
}
