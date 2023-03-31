package Company1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class mouseRightClick
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver= new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("http://demo.guru99.com/test/simple_context_menu.html");
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
    Actions at= new Actions(driver);
   // at.moveToElement(ele).perform();
   at.contextClick(ele).perform();
    
    
    
    
}
}
