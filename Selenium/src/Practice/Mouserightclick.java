package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouserightclick {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement clicme = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act =new Actions(driver);
//		act.moveToElement(clicme).perform();
//		act.contextClick().perform();
//		act.moveToElement(clicme).contextClick().build().perform();
		act.contextClick(clicme).perform();
	}

}
