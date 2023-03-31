package rebirth;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multieselectable 
{
	public static void main(String[] args) throws InterruptedException
	{
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
	driver.get("file:///C:/Users/aaaa/OneDrive/Desktop/multiselectablelistbox.html");
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    WebElement order = driver.findElement(By.xpath("//select[@multiple='true']"));
	
	Select s= new Select(order);
	boolean result = s.isMultiple();

	if (result==true)
	{
		System.out.println("the given list box is multiselectable");
	}
	else
	{
		{
			System.out.println("the given list box isn't multiselectable");
		}
	}
	System.out.println(result);
	s.selectByIndex(0);
	s.selectByVisibleText("veritas");
	s.selectByVisibleText("bank of america");
	Thread.sleep(2000);
	s.deselectByIndex(1);
   String text = s.getFirstSelectedOption().getText();
	System.out.println(text);
	List<WebElement> allopt = s.getAllSelectedOptions();
	System.out.println(allopt.size());
	for(WebElement d:allopt)
	{
		System.out.println(d.getText());
		
	}
}
}