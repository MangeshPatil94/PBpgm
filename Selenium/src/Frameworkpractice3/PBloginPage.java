package Frameworkpractice3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBloginPage 
{
	//deceleration 
@FindBy(xpath="//a[@class='sign-in']") private WebElement Signin;

//initilization 
public PBloginPage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}
//usage
public void ClickonSignin()
{
	Signin.click();
}
}
