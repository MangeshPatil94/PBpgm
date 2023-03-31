package Practice;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Aisehi {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//click on "new tab" from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		
		//get child window ID
		Set<String> allIds = driver.getWindowHandles();    //[mainPageID,childWindowID]
		ArrayList<String> al=new ArrayList<String>(allIds); //[mainPageID(0),childWindowID(1)]
		
		//switch to child window
		driver.switchTo().window(al.get(1));      //String child window ID
		
		
		//click on "Training" link from child window
		driver.findElement(By.xpath("//span[text()='Training']")).click();
	
		
		//switch to Main page
		driver.switchTo().window(al.get(0));      //String Main page ID
		
		//click "NewWindow" btn from main page
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		 
		 
		 
	}
	//a[text()='Electronics GST Store']
	//a[text()='Audio']
	//a[text()='Gaming']
}
//driver.get("https://www.flipkart.com/");
//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
// WebElement Rr = driver.findElement(By.xpath("//div[text()='Electronics']"));
//Actions as=new Actions(driver);
//as.moveToElement(Rr).perform();
//Thread.sleep(3000);                       //   /a[text()='Electronics GST Store']
// WebElement gst = driver.findElement(By.xpath("//a[text()='Electronics GST Store']"));
// as.moveToElement(gst).perform();
// Thread.sleep(3000);
// as.click().perform();
// 