package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosgn {
	WebDriver driver;
	public void Setup()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//C:\Users\aaaa\Downloads\chromedriver_win32\chromedriver.exe
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		 Autosgn setup = new  Autosgn();
		 setup.Setup();
		 setup.autosgn();
		
	}
	public void autosgn() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("m10");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]/li"));
		//String as="RaTio";
		for(WebElement s1:list)
		{
			if(s1.getText().contains("ratio")) 
			{
				s1.click();
				break;
			}	
		}
	}

}
