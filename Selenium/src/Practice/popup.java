package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {
	
	WebDriver driver;
	
	public void Popups()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
			 driver =new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://demo.guru99.com/test/delete_customer.php");
			 popup1();
			 popup2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void popup1()
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("101");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
	}
	public void popup2()
	{
	String text=	driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
	}
	public static void main(String[] args) 
	{
		popup check=new popup();
		check.Popups();

	}

}
