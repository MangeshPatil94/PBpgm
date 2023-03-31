package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\updated chrome\\chromedriver_linux64.zip");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/drag_drop.html");	
    WebElement src = driver.findElement(By.xpath("(//a[@ class='button button-orange'])[2]"));
    WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
    Actions Pilot=new Actions(driver);
    Pilot.dragAndDrop(src, dest).perform();
}
}
