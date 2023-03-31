package Company1;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import collections.Arraylist;

public class MultiSelectableLisbox
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver= new ChromeDriver(options);
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("file:///C:/Users/aaaa/OneDrive/Desktop/multiselectablelistbox.html");
WebElement se = driver.findElement(By.xpath("//select[@multiple=\"true\"]"));

Select set=new Select(se);
System.out.println(set.isMultiple());
set.selectByIndex(0);
set.selectByIndex(1);
set.selectByIndex(3);
List<WebElement> allopt = set.getAllSelectedOptions();
System.out.println(allopt.size());
HashSet hs= new HashSet();
for(WebElement fe:allopt)
{
hs.add(fe.getText());
}
System.out.println("----++---");
System.out.println(hs);
}
}
