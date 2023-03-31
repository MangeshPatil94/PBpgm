package TestNgPractice1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Example2EmalableReport 
{
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("browsr opened",true);
	}
	@BeforeMethod
	public void loginapp()
	{
	Reporter.log("open appln",true)	;
	}
   @Test
   public void TC1()
   {	
   Reporter.log("running verify profile name",true);
   }

   @Test
   public void TC2()
   {	
   Reporter.log("running verify profile id",true);
   }
   
   @AfterMethod
	public void logoutapp()
	{
	Reporter.log("close appln",true)	;
	}
   @AfterClass
	public void closeBrowser()
	{
		Reporter.log("browsr closed",true);
	}
}