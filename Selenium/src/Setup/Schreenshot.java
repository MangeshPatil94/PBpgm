package Setup;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Schreenshot 
{
public static void main(String[] args)
{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 Object scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 System.out.println(scr);
	 
}
}
