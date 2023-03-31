package Starhealthframe;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot 
{
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
	    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest=new File("C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\Sonal's ScreenShot\\Devansh.png");
        FileHandler.copy(src, dest);
	
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)")  ; 
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)")  ; 
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)")  ; 
		Thread.sleep(2000);
		
	}

}
