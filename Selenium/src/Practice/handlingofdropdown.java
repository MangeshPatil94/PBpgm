package Practice;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class handlingofdropdown {

	public handlingofdropdown() {
		
	}

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement morele = driver.findElement(By.xpath("//div[@class='exehdJ']"));
		Actions act= new Actions(driver);
		act.moveToElement(morele).perform();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='Advertise']")).click();
	}

}
