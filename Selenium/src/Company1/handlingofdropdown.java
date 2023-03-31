package Company1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class handlingofdropdown
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver= new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();	
    driver.get("https://www.flipkart.com/");
  //click on close btn
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
  	//Step1: Idendify dropdown element
  	WebElement moreEle = driver.findElement(By.xpath("//div[text()='More']"));
  	Actions at= new Actions(driver);
  	at.moveToElement(moreEle).perform();
	Thread.sleep(3000);
	
	//click on advertise link
	driver.findElement(By.xpath("//div[text()='Advertise']")).click();
  		
  		
  		
  		
}
}
