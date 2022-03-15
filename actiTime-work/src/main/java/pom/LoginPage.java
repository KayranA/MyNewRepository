package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath = "//input[@id='username']")
	private WebElement userName ;
	
	@FindBy (xpath = "(//input[@type='password'])[1]")
	private WebElement password ;
	
	@FindBy (xpath = "//input[@type='checkbox']")
	private WebElement checkbox ;
	
	@FindBy (xpath = "//div[text()='Login ']")
	private WebElement logIn ;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserName(String user)
	{
		userName.sendKeys(user);
	}
	public void sendPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickOnKeepMeLoginCheckBox()
	{
		if(  !(checkbox.isSelected()))  
		{
			checkbox.click();
		}
		else
		{
			System.out.println("checkbox is already selected");
		}
	}
	public void clickLogin()
	{
		logIn.click();
	}
	
//	 public void logInToApp()
//	{
//		userName.sendKeys("admin");
//		password.sendKeys("manager");
//		if(  !(checkbox.isSelected()))  
//		{
//			checkbox.click();
//		}
//		else
//		{
//			System.out.println("checkbox is already selected");
//		}
//		logIn.click();
//	}

}
