package Frameworkpractice3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBloginwithpasswdPage
{

	@FindBy(xpath="//input[@type='password']")private WebElement PassWd;
	@FindBy(xpath="//a[@id='login-in-with-password']") private WebElement Signin;
	
	public PBloginwithpasswdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enyerPwd()
	{
		PassWd.sendKeys("Mrpatil@123");
	}
	
	public void clickonSignin()
	{
		Signin.click();	
	}
}
