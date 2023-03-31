package Framepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PbEnterPwdPage 
{
@FindBy (xpath="//input[@type='password']") private WebElement EnterPWD;
@FindBy(xpath="//span[text()='Sign in']") private WebElement loginWithPwd;

public PbEnterPwdPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void enterPwd()
{
	EnterPWD.sendKeys("Mrpatil@123");
}

public void Clickonlogin()
{
	loginWithPwd.click();
}

}
