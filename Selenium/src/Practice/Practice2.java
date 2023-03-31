package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver Driver=new ChromeDriver();
	Driver.get("https://www.speedtest.net/");
	Driver.manage().window().maximize();
	//Thread.sleep(2000);
	Driver.manage().window().minimize();
//	Thread.sleep(2000);
	Driver.manage().window().maximize();
//	Driver.navigate().forward();
//	Driver.navigate().back();
//	Driver.navigate().refresh();
	Driver.findElement(By.xpath("//span[@class='start-text']")).click();
//	
//	Thread.sleep(2000);
//	Driver.navigate().forward();

}
}
//span[@class='start-text']