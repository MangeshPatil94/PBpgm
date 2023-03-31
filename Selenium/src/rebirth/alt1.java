package rebirth;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alt1
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver= new ChromeDriver(options);
//	WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("https://demo.guru99.com/test/delete_customer.php");
    driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("101");
    driver.findElement(By.xpath("//input[@name='submit']")).click();
    Alert alt = driver.switchTo().alert();
    String a = alt.getText();
    System.out.println(a);
    alt.accept();
    String s = alt.getText();
    System.out.println(s);
    alt.dismiss();
    
    
}
}
