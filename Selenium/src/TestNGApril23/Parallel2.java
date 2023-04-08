package TestNGApril23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Parallel2 
{
@Test
public void openBrowser()
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver= new ChromeDriver(options);
	driver.manage().window();
    driver.get("https://www.tutorialspoint.com/");
    }
}
