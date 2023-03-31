package Frameworkpractice3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBloginTest 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\aaaa\\OneDrive\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().deleteAllCookies();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   driver.get("https://www.policybazaar.com/");	
   
   PBloginPage login=new PBloginPage(driver);
   login.ClickonSignin();
   
   PBloginwithMobnoPage Mobno=new PBloginwithMobnoPage(driver);
   Mobno.enterMobileNO();
   Mobno.clickonLogInwithPwd();
   
   PBloginwithpasswdPage Pwd=new PBloginwithpasswdPage(driver);
   Pwd.enyerPwd();
   Pwd.clickonSignin();
   
   PBhomePage home=new PBhomePage(driver);
   home.openMyacountOption();
   home.clickonMyProfile();
   
   
   PbMyAccPage myacc=new PbMyAccPage(driver);
   myacc.SwitchToChildWindow();
   myacc.verifyFullName();
   
   //Thread.sleep(2000);
   //driver.quit();
}
}
