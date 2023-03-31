package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 
{
public static void main(String[] args) 
{
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\aaaa\\Downloads\\chromedriver_win32\\chromedriver.exe");

	//C:\Users\aaaa\Downloads\chromedriver_win32\chromedriver.exe
	WebDriver Driver=new ChromeDriver();
	Driver.get("https://www.selfanimate.com/pages/custom_template_customisation/845");
	Driver.manage().window().maximize();
	//Driver.close();
    Driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Suchita Biradar");
	Driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Suchitabiradar@gmail.com");
	 Driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("8857828289");
	 Driver.findElement(By.xpath("//div[@class='ytp-cued-thumbnail-overlay-image']")).click();

}
}
