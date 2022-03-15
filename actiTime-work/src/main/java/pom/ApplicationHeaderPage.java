package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeaderPage {
	
	@FindBy (xpath = "(//img[@src='/img/default/pixel.gif?hash=274618146'])[3]")
	private WebElement timeTrack ;
	
	@FindBy (xpath = "(//img[@src='/img/default/pixel.gif?hash=274618146'])[7]")
	private WebElement tasks ;
	
	@FindBy (xpath = "(//img[@src='/img/default/pixel.gif?hash=274618146'])[9]")
	private WebElement reports ;
	
	@FindBy (xpath = "(//img[@src='/img/default/pixel.gif?hash=274618146'])[11]")
	private WebElement users ;
	
	@FindBy (xpath = "(//img[@src='/img/default/pixel.gif?hash=274618146'])[13]")
	private WebElement workSchedule ;

	public ApplicationHeaderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickTimetrack()
	{
		timeTrack.click();
	}
	public void clickTask()
	{
		tasks.click();
		
	}
}
