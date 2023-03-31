package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseprightclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement clickme = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act= new Actions(driver);
		//element ko move kiya
//        act.moveToElement(clickme).perform();
//        //right click operation perform karna hai
//        act.contextClick().perform();
		//act.moveToElement(clickme).contextClick().build().perform();
		act.contextClick(clickme).perform();
	}

}
