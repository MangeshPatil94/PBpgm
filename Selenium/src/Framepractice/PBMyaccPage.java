package Framepractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyaccPage 
{
WebDriver Driver1;
	@FindBy (xpath="//div[text()='My Account']")private WebElement Myacunt;
@FindBy (xpath="//span[text()=' My profile ']")	private WebElement MyProfile;
	public PBMyaccPage(WebDriver driver)
	{
		Driver1=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void Myacc()
	{
		 Actions ac=new Actions(Driver1);
		 ac.moveToElement(Myacunt).perform();
	}
	public void ClickONmypProfile()
	{
		MyProfile.click();
	}
	
	
}
