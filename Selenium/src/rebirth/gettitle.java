package rebirth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class gettitle 
{
	public static void main(String[] args) 
	{
		//C:\Users\aaaa\OneDrive\Desktop\selenium files\geckodriver-v0.32.2-win32\geckodriver.exe
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver= new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    driver.get("https://www.amazon.in/");
	    String Title = driver.getTitle();
	    System.out.println(Title);
	  //  driver.getCurrentUrl();
	    System.out.println(driver.getCurrentUrl());
	}
}
