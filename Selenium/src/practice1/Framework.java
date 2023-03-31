package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Framework
{
 @FindBy(xpath="//a[text()='Sign in']")private WebElement signintoPolicybazar;
 
 @FindBy(xpath="(//i[@class=\"icon-bg homeIconsBg car-insurance\"])[2]")private WebElement logintocarinsurance;
public Framework(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }

public void clickonsignin()
{
	signintoPolicybazar.click();
}
public void clickoncarinsurance()
{
	logintocarinsurance.click();
}

}
