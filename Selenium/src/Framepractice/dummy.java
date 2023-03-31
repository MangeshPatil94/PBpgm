package Framepractice;

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
import org.openqa.selenium.interactions.Actions;

public class dummy 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
//		FileInputStream file=new FileInputStream("C:\\Users\\aaaa\\OneDrive\\Desktop\\Excel Practice.xlsx");
//		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		//Desktop\Excel Practice.xlsx
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//click on SignIn btn
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		//enter mob num
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
		
		//click on login with pwd
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		
		//enter pwd
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
		
		//click on SignIn btn
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		Thread.sleep(3000);
		
		//open my acc dropdown option
		WebElement MyAcc = driver.findElement(By.xpath("//div[text()='My Account']"));
		Actions act=new Actions(driver);
		act.moveToElement(MyAcc).perform();
		
		//click on "My Profile" option from dropdown
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		
		//switch to child window
		Set<String> allIds = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allIds);
		driver.switchTo().window(al.get(1));
				
		//get person name
		String actPN = driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
		String expPN=sh.getRow(0).getCell(2).getStringCellValue();
		
		
		if (actPN.equals(expPN)) 
		{
			System.out.println("Pass");
		} 
		else 
		{
			System.out.println("Fail");
        }
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}

