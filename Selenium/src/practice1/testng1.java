package practice1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Framepractice.APaddnewNO;
import Framepractice.PBMyaccPage;
import Framepractice.PBcontactsDetails;
import Framepractice.PBloginwithmobnoPage;
import Framepractice.PbEnterPwdPage;
import Framepractice.PbsigninPage;

public class testng1 {
	WebDriver driver;
	PbsigninPage signin;
	PBloginwithmobnoPage login;
	PbEnterPwdPage Pwd;
	PBMyaccPage Myacc;
	PBcontactsDetails Contdetail;
	APaddnewNO AddNewNo;
	@BeforeClass
	public void openBrowse() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.get("https://www.policybazaar.com");		
		signin=new PbsigninPage(driver);
		Sn.ClickonSignin();
		login=new PBloginwithmobnoPage(driver);
		login.EnterMobNo();
		login.ClickpnLogin();
		Pwd=new PbEnterPwdPage(driver);
		Pwd.enterPwd();
		Pwd.Clickonlogin();
		Thread.sleep(2000);
        Myacc=new PBMyaccPage(driver);
		Myacc.Myacc();
		Myacc.ClickONmypProfile();
		Contdetail=new PBcontactsDetails(driver);
		Contdetail.ClickonContactdet();
		Contdetail.ClickOnADDno();
		AddNewNo=new APaddnewNO(driver);
		AddNewNo.addnewNO();
	}
	@BeforeMethod 
	public void logintoApp()
	{
		login.ClickpnLogin();
		
		
	}
	
	@Test
	public void verifyloginpage()
	{
		
	}
	@AfterMethod
	public void logoutapp()
	{
		
	}
	
	@AfterClass
	public void closebrowser()
	{
		
	}
		
}


