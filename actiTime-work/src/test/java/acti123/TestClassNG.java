package acti123;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Browser;
import pom.ApplicationHeaderPage;
import pom.LogOut;
import pom.LoginPage;
import utils.Utility;

public class TestClassNG {
	
	private WebDriver driver;
	private ApplicationHeaderPage applicationHeaderPage;
	private LogOut logOut;
	private LoginPage loginPage;
	String testID;
	
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@BeforeTest    
	
	@Parameters("browser")
	public void openBrowser(String browserName)
	{
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
//		if(browserName.equals("Chrome"))
//		{
//		driver = Browser.launchChromeBrowser();
//		}
		if(browserName.equals("FireFox"))
		{
		driver = Browser.launchFirefoxBrowser();
		}
		if(browserName.equals("Edge"))
		{
		driver = Browser.launchMSEdgeBrowser();
		}
		
	}
	
	@BeforeClass
	public void objectOfMethods()
	{
		loginPage = new LoginPage(driver);
		applicationHeaderPage = new ApplicationHeaderPage(driver);
		logOut = new LogOut(driver);
	}
	
	@BeforeMethod
	public void logInToActiTime() throws EncryptedDocumentException, IOException
	{
		driver.get("http://localhost/login.do");
		System.out.println("Logged In");
		
		 String user = Utility.fetchDataFromExcelSheet("Sheet1", 1, 0);
		 String password = Utility.fetchDataFromExcelSheet("Sheet1", 1, 1);
		
		loginPage.sendUserName(user);
		loginPage.sendPassword(password);
		loginPage.clickOnKeepMeLoginCheckBox();
		loginPage.clickLogin();
				
	}
	
	@Test
	public void verifyTime()
	{
		testID = "1101";
		applicationHeaderPage.clickTimetrack();
		String url = driver.getCurrentUrl();
		
		System.out.println("Verified Time:"+url);
		Boolean result = url.equals("http://localhost/user/submit_tt.do");
		
		System.out.println(result);
		
//		SoftAssert s = new SoftAssert();
//		s.assertTrue(result);
		Assert.assertTrue(result);
//		Assert.assertEquals(url, "//localhost/user/submit_tt.do");

		
	}
	@Test
	public void verifyTask()
	{
		testID = "1102";
		applicationHeaderPage.clickTask();
		String url1 = driver.getCurrentUrl();
		System.out.println("Verified Task:"+url1);
		Assert.fail();
		
	}
	
	@AfterMethod
	public void logOutfromActiTime(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE == result.getStatus())
		{
			Utility.captureScreenshot(driver, testID);
		}
		System.out.println("Logged Out");
		
		logOut.logOutFromActiTime();
		
		
	}
	
	@AfterClass
	public void clearPOMObject()
	{
		loginPage = null;
		applicationHeaderPage = null;
		logOut = null;
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("Browser closed");
		driver.quit();
		driver=null;
	}
	
	
}
