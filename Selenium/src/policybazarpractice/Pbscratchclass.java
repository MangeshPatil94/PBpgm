package policybazarpractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pbscratchclass  
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
	FileInputStream file=new FileInputStream("C:\\\\frame\\\\Excel Practice.xlsx");
	Sheet Sh = WorkbookFactory.create(file).getSheet("pblogin");
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//policybazar url
	driver.get("https://www.policybazaar.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//click on sign in page
	driver.findElement(By.xpath("(//a[text()='Sign in'])[1]")).click();
	//enter mobile number
    driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys(Sh.getRow(0).getCell(0).getStringCellValue()); 
    //click on sign in with password
    driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
    //enter Password
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Sh.getRow(0).getCell(1).getStringCellValue());
    //click on sign in button
    driver.findElement(By.xpath("//a[@class='cl-btn sr-btn-primary']")).click();
    //mouse over renew your policy 
//    WebElement lifeREnew = driver.findElement(By.xpath("(//a[@href='javascript:void(0)'])[2]"));
   WebElement myacc = driver.findElement(By.xpath("//li/a/div[@class='userprofile']"));
    Actions at=new Actions(driver);
    Thread.sleep(2000);
 //  at.moveToElement(lifeREnew).perform();
//    driver.findElement(By.xpath("(//span[@itemprop='name'])[56]")).click();
	
	at.moveToElement(myacc).perform();
	driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
}
}

