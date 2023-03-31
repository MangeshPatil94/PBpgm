package Framepractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PbsigninPage 
{
@FindBy(xpath="(//a[text()='Sign In'])[1]") private WebElement signin;

public PbsigninPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void ClickonSignin()
{
signin.click();
}
}
