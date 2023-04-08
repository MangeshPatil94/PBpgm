package April2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginwithPwdPage
{
	@FindBy(xpath="//input[@type='password']") private WebElement Pwd;
	@FindBy(xpath="//span[@id='login-in-with-password-span']") private WebElement SignIn;
	PBLoginwithPwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void EnterPwd(String s)
	{
		//Pwd.sendKeys("Mrpatil@123");
		Pwd.sendKeys(s);
	}
public void ClickonSignInButton()
{
	SignIn.click();
}
}
