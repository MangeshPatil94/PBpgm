package Framepractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDF1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
	FileInputStream pb =new FileInputStream("C:\\\\frame\\\\Excel Practice.xlsx");
    String Sheet = WorkbookFactory.create(pb).getSheet("pblogin").getRow(0).getCell(1).getStringCellValue();
	System.out.println(Sheet);
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	Thread.sleep(2000);
	driver.get("https://www.policybazaar.com");
	}
}
