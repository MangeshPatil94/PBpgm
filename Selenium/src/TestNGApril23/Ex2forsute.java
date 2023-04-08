package TestNGApril23;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex2forsute
{
@Test(priority=0,groups="first")
public void TC4()
{
	
Reporter.log("running tc4",true);
}
@Test(priority=-1,groups="second")
public void TC5()
{
	
Reporter.log("running tc5",true);
}
@Test(priority=-2,groups="first")
public void TC6()
{
	
Reporter.log("running tc6",true);
}


}
