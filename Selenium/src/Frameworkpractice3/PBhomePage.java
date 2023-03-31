package Frameworkpractice3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBhomePage
{
@FindBy(xpath="//div[@class='userprofile']") private WebElement MyAcc;
@FindBy(xpath="//span[text()=' My profile ']")private WebElement MyProfile;
WebDriver driver1;
public PBhomePage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
driver1=driver;
}

public void openMyacountOption() throws InterruptedException
{
	Actions act=new Actions(driver1);
	Thread.sleep(2000);
    act.moveToElement(MyAcc).perform();
}
public void clickonMyProfile() 
{
	MyProfile.click();
}
}
