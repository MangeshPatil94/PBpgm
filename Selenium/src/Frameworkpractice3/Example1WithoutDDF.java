package Frameworkpractice3;

import java.io.FileInputStream;

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
import org.openqa.selenium.interactions.Actions;

public class Example1WithoutDDF 
{
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
{
   FileInputStream file = new FileInputStream("C:\\frame\\Excel Practice.xlsx");
  Sheet Sh = WorkbookFactory.create(file).getSheet("pblogin");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().deleteAllCookies();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   driver.get("https://www.policybazaar.com/");
   
   //click on sign baton
   driver.findElement(By.xpath("//a[@class=\"sign-in\"]")).click();
   
   //enter mobile No
   driver.findElement(By.xpath("(//input[@id=\"central-login-module-sign-mobile\"])[2]")).sendKeys(Sh.getRow(0).getCell(0).getStringCellValue());
   //click on login baton
   driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click(); 
   //click on sign in baton
   driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(Sh.getRow(0).getCell(1).getStringCellValue());
   //click on sign in baton
   driver.findElement(By.xpath("//a[@id='login-in-with-password']")).click();
   //open my acc dropdown option
   WebElement Myacc = driver.findElement(By.xpath("//div[@class=\"userprofile\"]"));
   Actions ac= new Actions(driver);
   Thread.sleep(2000);
   ac.moveToElement(Myacc).perform();//  //span[text()=' My profile ']
   //click on my profile from dropdown

   driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
   //switch to child window
   Set<String> allwindow = driver.getWindowHandles();
   ArrayList<String> al=new ArrayList<String>(allwindow);
   driver.switchTo().window(al.get(1));
   //get person name  
   String actPN = driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
   
   String expPN="Mangesh Patil";
  
   if(actPN.equals(expPN))
   {
	   System.out.println("pass"); 
   }
   else
   {
	   System.out.println("fail");
   }
   
}
}
