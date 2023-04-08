package April2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBloginPage 
{// Step1 Deceleration
@FindBy (xpath="//a[text()='Sign in']") private WebElement SignIn;

PBloginPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void ClickOnSignInButton()
{
	SignIn.click();
}
}
