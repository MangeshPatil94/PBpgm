package TestNGApril23;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex1forsute
{
@Test(groups="first")
public void TC1()
{
	
Reporter.log("running tc1",true);
}
@Test(groups="second")
public void TC2()
{
	
Reporter.log("running tc2",true);
}
@Test(groups="first")
public void TC3()
{
	
Reporter.log("running tc3",true);
}


}
