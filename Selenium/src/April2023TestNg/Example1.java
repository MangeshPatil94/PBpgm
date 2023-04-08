package April2023TestNg;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example1
{WebDriver driver;
	@BeforeMethod
public void openbrowser()
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	 driver= new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.policybazaar.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
}
	@Test(priority=1)
	public void ClickonSignIn()
	{
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	}
	@Test(priority=2)
	public void EntermobileNo() throws EncryptedDocumentException, IOException
	{
		Reporter.log("pass",true);
		}
}
