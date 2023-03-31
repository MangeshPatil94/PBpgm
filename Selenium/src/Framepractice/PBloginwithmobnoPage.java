package Framepractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBloginwithmobnoPage 
{
@FindBy(xpath="(//input[@type='number'])[2]")private WebElement MobileNo;
@FindBy(xpath="(//a[@id='central-loggin-with-pwd'])[2]")private WebElement LoginButon;

public PBloginwithmobnoPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void EnterMobNo()
{
MobileNo.sendKeys("9373419194");
}
	
public void ClickpnLogin()
{
	LoginButon.click();
}
}
