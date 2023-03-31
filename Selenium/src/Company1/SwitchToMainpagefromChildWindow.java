package Company1;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchToMainpagefromChildWindow 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver= new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();	
    driver.get("https://skpatro.github.io/demo/links/");
    
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//click on "new tab" from main page
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	Set<String> alid = driver.getWindowHandles();
	ArrayList<String> al = new ArrayList<String>(alid);
	String id = al.get(1);
	driver.switchTo().window(id);
	driver.findElement(By.xpath("//span[text()='Training']")).click();
	String s = al.get(0);
	driver.switchTo().window(s);
	driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	
	
	
	
}
}
