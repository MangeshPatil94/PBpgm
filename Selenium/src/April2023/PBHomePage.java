package April2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBHomePage
{
	WebDriver driver1;
@FindBy(xpath="//div[text()='My Account']") private WebElement MyAccount;
@FindBy(xpath="//ul//a//span[text()=' My profile ']") private WebElement MyProfile;
PBHomePage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
driver1=driver;
}

public void OpenMyAccount()
{
Actions at= new Actions(driver1);	
at.moveToElement(MyAccount).perform();
}
public void ClickOnMyProfile()
{
	MyProfile.click();
}

}
