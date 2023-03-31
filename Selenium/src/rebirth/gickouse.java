package rebirth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gickouse {
	public static void main(String[] args) 
	{
		//C:\Users\aaaa\OneDrive\Desktop\selenium files\geckodriver-v0.32.2-win32\geckodriver.exe
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\geckodriver-v0.32.2-win64\\geckodriver.exe");
		//C:\Users\aaaa\OneDrive\Desktop\selenium files\geckodriver-v0.32.2-win64\geckodriver.exe	
			WebDriver driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    driver.get("https://www.amazon.in/");
//	    String Title = driver.getTitle();
//	    System.out.println(Title);
//	  //  driver.getCurrentUrl();
//	    System.out.println(driver.getCurrentUrl());
	}

}
