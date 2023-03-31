package Practice;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childpopup {
	
	WebDriver driver;
	public void pop()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		pop1();
	}
	
	public void pop1()
	{
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		String n= driver.getTitle();
	    System.out.println(n);
	     
	   Set<String> pop = driver.getWindowHandles();
	     ArrayList <String>al= new ArrayList<String>(pop);
	     driver.switchTo().window(al.get(1));
	     driver.findElement(By.className("menu-text")).click();
	    String m= driver.getTitle();
	    System.out.println(m);
	 //    driver.quit();
//	    String q = al.get(0);
//	    String w=al.get(1);
//	    System.out.println(q);
//	    System.out.println(w);     
	     
	}
	
	public static void main(String[] args) 
	{
		childpopup child1=new childpopup();
		child1.pop();
		

	}

}
