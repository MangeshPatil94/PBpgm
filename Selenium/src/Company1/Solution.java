package Company1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Solution
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver= new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();

	driver.get("https://realtyassistant.in/properties");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement Location = driver.findElement(By.xpath("//select[@name='city']"));
			
			Select s=new Select(Location);
			s.selectByVisibleText("Noida");
			//select[@name='property_category']
			
			
			WebElement PropertyCategory= driver.findElement(By.xpath("//select[@name='property_category']"));
			
			Select V=new Select(PropertyCategory);

			V.selectByIndex(4);
			

			WebElement ProjectStatus= driver.findElement(By.xpath("//select[@name='project_status']"));
			Select a=new Select(ProjectStatus);
			a.selectByVisibleText("New Launch");
		

			
			WebElement sub = driver.findElement(By.xpath("//form//div//input[@value=\"Search\"]"));
			Actions at=new Actions(driver);
			at.moveToElement(sub).click().perform();
				
}
}
