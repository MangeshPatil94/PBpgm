package TestNgPractice1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Compatability 
{
@Test
public void m1(String chrome)
{
	if(browse.equals(chrome))
	{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	}
}
}
