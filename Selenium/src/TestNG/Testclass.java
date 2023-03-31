package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class Testclass 
{
	@Test
public void TC1()
{
	//System.out.println("running test case1");
	Reporter.log("---running test case 2---",true);
}
	
	@Test
public void TC2()
{
	//System.out.println("running test case2");
	Reporter.log("---running test case 2---",true);
}
	
	@Test(dependsOnMethods = "TC2")
public void TC3()
{
	//System.out.println("running test case3");
	Reporter.log("---running test case 2---",true);
}
}
