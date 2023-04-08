package April2023;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyaccPage
{
	WebDriver driver1;//div[@class=\\\"textCapitalize sc-ckVGcZ kWpXlQ\\\"]
@FindBy(xpath="//input[@name=\"personName\"]") private WebElement FullName;
PBMyaccPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	driver1=driver;
}

public void SwitchToChildWindow()
{System.out.println("working");
	Set<String> allid = driver1.getWindowHandles();
	ArrayList<String> al= new ArrayList<String>(allid);
driver1.switchTo().window(al.get(1));
}
public void VerifyFullName()
{
	String actres = FullName.getAttribute("value");	
	String expres="Mangesh Patil";
	if(actres.equals(expres))
	{
	System.out.println("tc pass");	
	}
	else 
	{
	System.out.println("tc fail");	
	}
}
}












