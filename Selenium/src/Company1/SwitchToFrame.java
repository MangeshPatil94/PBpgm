package Company1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchToFrame 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver= new ChromeDriver(options);
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
driver.switchTo().frame("iframeResult");

driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
driver.switchTo().parentFrame();
driver.findElement(By.xpath("//a[@id=\"tryhome\"]")).click();
}
}
