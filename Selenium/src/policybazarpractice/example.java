package policybazarpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example 
{
	public static void main(String[] args) throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
		   	 
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com");
			
			boolean result = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
			System.out.println(result);
			
			if (result==true)
			{
				System.out.println("element found");
			} 
			else
			{
				System.out.println("Element not found");
			}
			
	  }
}

