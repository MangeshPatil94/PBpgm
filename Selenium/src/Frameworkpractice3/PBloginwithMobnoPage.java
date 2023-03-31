package Frameworkpractice3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBloginwithMobnoPage 
{

	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]")private WebElement EnterMobNo;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement LoginWithPwd;
	public PBloginwithMobnoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterMobileNO()
	{
		EnterMobNo.sendKeys("9373419194");
	}
	
	public void clickonLogInwithPwd()
	{
		LoginWithPwd.click();
	}
}
