package Frameworkpractice3;

import java.util.ArrayList;
import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PbMyAccPage 
{

@FindBy(xpath="//input[@name='personName']")private WebElement fullName;
WebDriver driver1;
public PbMyAccPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	driver1=driver;
}

public void SwitchToChildWindow()
{
	Set<String> allwindow = driver1.getWindowHandles();
	ArrayList<String> al=new ArrayList<String>(allwindow);
    driver1.switchTo().window(al.get(1));
}

public void verifyFullName()
{
	 String actPN = fullName.getAttribute("value");
	   
	   String expPN="Mangesh Patil";
	  
	   if(actPN.equals(expPN))
	   {
		   System.out.println("pass"); 
	   }
	   else
	   {
		   System.out.println("fail");
	   }
}

}
