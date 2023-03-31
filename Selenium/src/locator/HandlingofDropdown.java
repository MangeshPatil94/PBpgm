package locator;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandlingofDropdown {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
//	driver.get("https://www.flipkart.com/");
//	//Thread.sleep(3000);
//	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//	
//	WebElement more = driver.findElement(By.xpath("//div[@class='exehdJ']"));
//	Actions act=new Actions(driver);
//	act.moveToElement(more).perform();
//	driver.findElement(By.xpath("//div[text()='Advertise']")).click();
	
	
	
	
//	driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
//	WebElement month = driver.findElement(By.xpath("//select[@aria-label=\"Month\"]"));
//	Select sl=new Select(month);
//	sl.selectByVisibleText("May");
//	WebElement a = sl.getFirstSelectedOption();
//	
//	System.out.println(a.getText());
//	List<WebElement> alloptions = sl.getOptions();
//
//	for(WebElement as:alloptions)
//	{	
//		String options = as.getText();
//		System.out.println(options);	
//	}
	
	FileInputStream files=new FileInputStream("C:\\\\\\\\frame\\\\\\\\Excel Practice.xlsx");

    WorkbookFactory.create(files).getSheet("pblogin").getRow(i).getCell(3).getDateCellValue();

	
	
	
	

	 
	
	
	
	
	
	
	
	}

}
