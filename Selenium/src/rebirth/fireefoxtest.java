package rebirth;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class fireefoxtest
{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\geckodriver-v0.32.2-win64\\geckodriver.exe");                                             
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		File dest=new File("C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\Sonal's ScreenShot\new.jpg");
	    FileHandler.copy(src, dest);
	}
}
