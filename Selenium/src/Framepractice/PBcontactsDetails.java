package Framepractice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBcontactsDetails 
{
	WebDriver Driver1;
 @FindBy(xpath="//div[text()='Contact details']")private WebElement ContactDetails;
@FindBy(xpath="//a[text()='Add new number']") private WebElement AddNewNO;
 
public PBcontactsDetails(WebDriver driver)
{
	Driver1=driver;
	PageFactory.initElements(driver,this);
}
public void ClickonContactdet()
{
	Set<String> wd = Driver1.getWindowHandles();
ArrayList<String> al=new ArrayList<String>(wd);
Driver1.switchTo().window(al.get(1));
	ContactDetails.click();
}
public void ClickOnADDno()
{
	AddNewNO.click();
}

}

