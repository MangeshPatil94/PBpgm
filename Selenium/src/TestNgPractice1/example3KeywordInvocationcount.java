package TestNgPractice1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example3KeywordInvocationcount 
{

	@Test(priority=2,invocationCount = 2)
	public void Tc1()
	{
		Reporter.log("runnig tc1",true);
	}
	
	@Test(priority=1,enabled = true)
	public void Tc2()
	{
		Reporter.log("runnig tc2",true);
	}
	
}
