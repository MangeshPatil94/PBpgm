package Framepractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame2
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	Thread.sleep(2000);
	driver.get("https://www.policybazaar.com");	
	driver.findElement(By.xpath("//a[@class='sign-in']")).click();
	driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("9373419194");
	driver.findElement(By.xpath("(//a[@id='central-loggin-with-pwd'])[2]")).click();
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mrpatil@123");
	driver.findElement(By.xpath("//span[@id=\"login-in-with-password-span\"]")).click();
	Thread.sleep(2000);
	WebElement myAcc = driver.findElement(By.xpath("//div[text()='My Account']"));
    Actions ac=new Actions(driver);
    ac.moveToElement(myAcc).perform();
    driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
    Set<String> wd = driver.getWindowHandles();
    ArrayList<String> al=new ArrayList(wd);
    driver.switchTo().window(al.get(1));
    driver.findElement(By.xpath("//div[text()='Contact details']")).click();
    driver.findElement(By.xpath("//a[text()='Add new number']")).click();
    driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("885589524");
    
    
    
    
    
    
    
    
}
}
