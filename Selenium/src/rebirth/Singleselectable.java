package rebirth;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Singleselectable 
{
	public static void main(String[] args) throws InterruptedException
	{
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com/");
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//click on create new acc link
    Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
	WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
	Select s= new Select(month);
	s.selectByIndex(4);
	Thread.sleep(2000);
	s.selectByVisibleText("Oct");
	
}
}