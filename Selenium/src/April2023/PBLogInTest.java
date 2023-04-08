package April2023;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PBLogInTest
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
	
	PBloginPage login= new PBloginPage(driver);
	login.ClickOnSignInButton();
	PBloginwithMobNopage mobno= new PBloginwithMobNopage(driver);
	String mob = sh.getRow(0).getCell(0).getStringCellValue();
	mobno.EnterMobNo(mob);
	mobno.ClickOnLogInWithPwd();
	PBLoginwithPwdPage pwd= new PBLoginwithPwdPage(driver);
	String passwd = sh.getRow(0).getCell(1).getStringCellValue();
	pwd.EnterPwd(passwd);
	pwd.ClickonSignInButton();
	PBHomePage homepage=new PBHomePage(driver);
	Thread.sleep(2000);
	homepage.OpenMyAccount();
	homepage.ClickOnMyProfile();
	PBMyaccPage myacc=new PBMyaccPage(driver);
	myacc.SwitchToChildWindow();
	myacc.VerifyFullName();	
}
}
