package Company1;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import collections.Arraylist;

public class Switch_to_childWindow 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver= new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();	
    driver.get("https://skpatro.github.io/demo/links/");
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.findElement(By.xpath("//input[@name='NewTab']")).click();
    Set<String> allids = driver.getWindowHandles();
    ArrayList<String> al = new ArrayList<String>(allids);
    String ChildwdID = al.get(1);
    driver.switchTo().window(ChildwdID);
    driver.findElement(By.xpath("//span[text()='Training']")).click();
	
}
}
