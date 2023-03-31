package Setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\aaaa\\\\\\\\OneDrive\\\\\\\\Desktop\\\\\\\\selenium files\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://zoom.us/signin#/login");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[@for=\"email\"]")).sendKeys("priyanka901126@gmail.com");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("Priyanka@123");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text() = ' Sign In ']")).click();
}
}
