package rebirth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsEnabled 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver= new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com");
    boolean result = driver.findElement(By.xpath("//button[text()='Log in']")).isEnabled();
    boolean res = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).isEnabled();
  //  driver.close();
    driver.quit();
	System.out.println(result);
	System.out.println(res);
}
}
