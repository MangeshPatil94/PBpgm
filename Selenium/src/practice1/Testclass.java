package practice1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Testclass 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
   
    driver.get("https://www.policybazaar.com");
    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    Framework login=new Framework(driver);
    login.clickonsignin();
    login.clickoncarinsurance();
}
}
