package selenium12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxsingleselect {
	WebDriver driver;

	public void Setup()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			crtacc();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void crtacc() throws InterruptedException
	{
		 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		  Thread.sleep(3000);
		  WebElement day = Driver.findElement(By.xpath("//select[@id='day']"));
		  Select s=new Select(day);
//		  s.selectByVisibleText("18");
//		  s.selectByValue("18");
		  s.selectByIndex(17);
		  WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		  Select m=new Select(month);
	//	  m.selectByIndex(9);
		  m.selectByVisibleText("Oct");
		  WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
		  Select y=new Select(year);
		  y.selectByValue("2010");
		 	  
	}//a[text()='Create New Account']
	public static void main(String[] args) 
	{
		Listboxsingleselect fb=new Listboxsingleselect();
		fb.Setup();
		

	}

}
