package acti123;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.Utility;


public class TestClassPrac {
	
	
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("Browser Opened");
	}
	
	@BeforeMethod
	public void loginActiTime()
	{
		System.out.println("Logged In ActiTime");
	}
	
	@Test
	public void test1111()
	{
		
		System.out.println("Test1");
		
		
	}
	
	@Test
	public void test2222()
	{
		
		System.out.println("Test2");
	}
	
	@Test
	public void test3333()
	{
		
		System.out.println("Test3");
	}
	@AfterMethod
	public void logOutActiTime()
	{
		
		System.out.println("LogOut ActiTime");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Browser Closed");
	}

}
