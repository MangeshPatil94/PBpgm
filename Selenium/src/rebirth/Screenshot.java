package rebirth;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot 
{
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com/");
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(src);
    File dest=new File("C:\\Users\\aaaa\\OneDrive\\Desktop\\Screenshot\\sample7.jpg");
    System.out.println(dest);
    FileHandler.copy(src,dest);
   
}
}
