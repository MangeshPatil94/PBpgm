package Company1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectablelistbox
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver= new ChromeDriver(options);
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://www.facebook.com/");
//click on create new acc link
driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
Thread.sleep(7000);
WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
Select s=new Select(month);
s.selectByIndex(9);
//Thread.sleep(2000);
//driver.close();
}
}
