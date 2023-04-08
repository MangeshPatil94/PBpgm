package April2023;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import collections.Arraylist;

public class ExampleWithoutDDF
{
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
{
	FileInputStream file = new FileInputStream("C:\\\\\\\\Users\\\\\\\\aaaa\\\\\\\\OneDrive\\\\\\\\Desktop\\\\\\\\excell fro practice.xlsx");
	 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");//
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
ChromeOptions options=new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
WebDriver driver= new ChromeDriver(options);
driver.manage().window().maximize();
driver.get("https://www.policybazaar.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//click on sign in button
driver.findElement(By.xpath("//a[text()='Sign in']")).click();
//enter mobile number
String mobno = sh.getRow(0).getCell(0).getStringCellValue();
driver.findElement(By.xpath("(//input[@type=\"number\"])[2]")).sendKeys(mobno);//(//input[@type=\\\"number\\\"])[2]
driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
//enter password
String pwd = sh.getRow(0).getCell(1).getStringCellValue();
driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(pwd);
driver.findElement(By.xpath("//span[@id=\"login-in-with-password-span\"]")).click();
WebElement myacc = driver.findElement(By.xpath("//div[text()='My Account']"));
Thread.sleep(3000);
Actions at=new Actions(driver);
at.moveToElement(myacc).perform();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.findElement(By.xpath("//ul//a//span[text()=' My profile ']")).click();
Set<String> allids = driver.getWindowHandles();
ArrayList<String> al=new ArrayList<String>(allids);
driver.switchTo().window(al.get(1));
String actres = driver.findElement(By.xpath("//div[@class=\"textCapitalize sc-ckVGcZ kWpXlQ\"]")).getText();
String expres ="Mangesh Patill";
if(actres.equals(expres))
{
System.out.println("tc pass");	
}
else 
{
System.out.println("tc fail");	
}
}
}
