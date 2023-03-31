package rebirth;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class warmup
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("https://www.policybazaar.com/");
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   // Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='Sign in']")).click();
   // Thread.sleep(3000);
    driver.findElement(By.xpath("(//input[@id=\"central-login-module-sign-mobile\"])[2]")).sendKeys("9373419194");
    driver.findElement(By.xpath("(//a/span[text()='Sign in with Password'])[2]")).click();//
    driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Mrpatil@123");
    driver.findElement(By.xpath("//span[text()='Sign in']")).click();
}
}
