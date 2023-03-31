package TestNG;


import org.testng.Reporter;
import org.testng.annotations.Test;


public class Keywords 
{
	
	@Test(timeOut=3000)
	public void m1() throws InterruptedException
	{
		Thread.sleep(4000);
		Reporter.log("hi hello",true);
		
	}

		
				
}
