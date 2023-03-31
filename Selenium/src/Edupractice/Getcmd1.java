package Edupractice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcmd1 {

	WebDriver driver;
	public void getbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	 
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 usemethod();
	}
	
	public void  usemethod()
	{
		try {
			driver.get("https://www.youtube.com/");
			String title= driver.getTitle();
			System.out.println(title);
			
			driver.findElement(By.linkText("Music")).click();
			String url=driver.getCurrentUrl();
			System.out.println(url);
			amazon();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void amazon() throws InterruptedException
	{
		try {
			//driver.get("https://www.amazon.in");
			driver.navigate().to("https://www.amazon.in");
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(4000);
			driver.navigate().forward();
			Thread.sleep(1000);
			driver.navigate().refresh();
			driver.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args)
	{
		Getcmd1 r=new Getcmd1();
		r.getbrowser();
		//r.usemethod();
		// driver.close();

	}

}
