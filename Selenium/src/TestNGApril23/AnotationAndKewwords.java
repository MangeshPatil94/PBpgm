package TestNGApril23;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnotationAndKewwords 
{
	@BeforeClass
	public void m1()
	{
		Reporter.log("before class",true);
	}
   @BeforeMethod()
   public void m2()
    {
	Reporter.log("before method",true);
    }

	@Test(invocationCount=2,priority=1,groups="first")
	public void m3T1()
	{
		Reporter.log("hi Well come",true);
	}
	@Test(enabled=true,groups="second",priority=3)
	public void m3T2()
	{
		Reporter.log("hi Well come",true);
	}
	@Test(dependsOnMethods="m3T2",groups="second",priority=2)
	public void m3T3()
	{
		Reporter.log("hi Well come",true);
	}
	@Test(invocationCount=2,groups="first",priority=4)
	public void m3T4()
	{
		Reporter.log("hi Well come",true);
	}
	@AfterMethod
	public void m22()
	{
		Reporter.log("After method",true);
	}
	@AfterClass
	public void m33()
	{
		Reporter.log("After Class",true);
	}
	
}
