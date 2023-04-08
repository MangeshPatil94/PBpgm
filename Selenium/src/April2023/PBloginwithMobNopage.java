package April2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBloginwithMobNopage 
{
@FindBy(xpath="(//input[@type='number'])[2]") private WebElement MobNo;
@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement LogInWithPwd;
PBloginwithMobNopage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void EnterMobNo(String s) throws InterruptedException
{
	//Thread.sleep(2000);
	//MobNo.sendKeys("9373419194");
	MobNo.sendKeys(s);
}
public void ClickOnLogInWithPwd()
{
	LogInWithPwd.click();
}
}
