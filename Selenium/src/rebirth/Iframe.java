package rebirth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
    driver.switchTo().frame("iframeResult");
    driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
    driver.switchTo().parentFrame();
    driver.findElement(By.xpath("//a[@id=\"tryhome\"]")).click();
}
}
