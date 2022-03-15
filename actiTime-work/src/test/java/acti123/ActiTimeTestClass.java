package acti123;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pom.ApplicationHeaderPage;
import pom.LogOut;
import pom.LoginPage;


public class ActiTimeTestClass {
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "D:\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://localhost/login.do");
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.sendUserName(null);
		loginPage.sendPassword(null);
		loginPage.clickOnKeepMeLoginCheckBox();
		loginPage.clickLogin();
		
		ApplicationHeaderPage applicationHeaderPage = new ApplicationHeaderPage(driver);
		
		Thread.sleep(2000);
		applicationHeaderPage.clickTimetrack();
		
		
		
		applicationHeaderPage.clickTask();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String pageName = driver.getTitle();
		System.out.println(pageName);
		
		LogOut logOut = new LogOut(driver);
		logOut.logOutFromActiTime();
		
	}

}
