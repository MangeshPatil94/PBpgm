package Framepractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBtest 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	Thread.sleep(2000);
	driver.get("https://www.policybazaar.com");	
	
	PbsigninPage Sn=new PbsigninPage(driver);
	Sn.ClickonSignin();
	PBloginwithmobnoPage Lm=new PBloginwithmobnoPage(driver);
	Lm.EnterMobNo();
	Lm.ClickpnLogin();
	PbEnterPwdPage Ep=new PbEnterPwdPage(driver);
	Ep.enterPwd();
	Ep.Clickonlogin();
	Thread.sleep(2000);
	PBMyaccPage MA=new PBMyaccPage(driver);
	MA.Myacc();
	MA.ClickONmypProfile();
	PBcontactsDetails cd=new PBcontactsDetails(driver);
	cd.ClickonContactdet();
	cd.ClickOnADDno();
	APaddnewNO aw=new APaddnewNO(driver);
	aw.addnewNO();
	
	
}
}
