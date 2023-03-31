package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
        WebDriver Priya= new ChromeDriver();
        Priya.get("https://www.reddit.com/");
        Thread.sleep(5000);
       Priya.close();
       Priya.quit();
        Priya.get("https://www.flipkart.com/");
       String w= Priya.getCurrentUrl();
       System.out.println(w);
      String q=  Priya.getTitle();
      System.out.println(q);
      
	}
}
