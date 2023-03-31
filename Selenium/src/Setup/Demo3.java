package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
    WebDriver Driver=new ChromeDriver();
    Driver.get("https://web.whatsapp.com/");
    Driver.manage().window().maximize();
    Driver.navigate().forward();
    Thread.sleep(300);
    Driver.navigate().back();
    Thread.sleep(30000);
    Driver.close();
}
}
