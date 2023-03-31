package policybazarpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alllinks
{
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.policybazaar.com/");
	
	boolean result = driver.findElement(By.xpath("//i[@class='homeIconsBg icon-bg-new investment']")).isDisplayed();
    System.out.println(result);
    
    List<WebElement> alllinks = driver.findElements(By.tagName("a"));
    for(WebElement a:alllinks) {
  // System.out.println(a.getText());
   String asString = a.getText();
  System.out.println(asString.replace("                                                                                                                            ","")); 
   
   
    }
}
}
