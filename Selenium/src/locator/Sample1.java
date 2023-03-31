package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://clapingo.com/learner/session");
	Driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9373419194");
    Driver.findElement(By.xpath("//button[@class='w-full m-2 p-3 border border-neutral-200 flex rounded-md'][2]")).click();
}
}
