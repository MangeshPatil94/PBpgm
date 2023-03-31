package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleselectedlistbox
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
    WebDriver Driver =new ChromeDriver();
    Driver.get("https://www.facebook.com/");
    Thread.sleep(3000);
    Driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
    WebElement month = Driver.findElement(By.xpath("//select[@name='birthday_month']"));
//    Select s=new Select(month);
//    //s.selectByIndex(3);
//    s.selectByVisibleText("oct");
//	
}
}
