package Framepractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class APaddnewNO 
{
@FindBy(xpath="(//input[@type='text'])[3]")private WebElement ADDnewno;

public APaddnewNO(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void addnewNO()
{
	ADDnewno.sendKeys("8855879524");
}
}
