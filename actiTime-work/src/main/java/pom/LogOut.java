package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {

	@FindBy (xpath = "//a[@id='logoutLink']")
	private WebElement logout;
	
	public LogOut(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logOutFromActiTime()
	{
		logout.click();
	}
	
}
