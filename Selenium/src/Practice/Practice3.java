package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 
{
	WebDriver Driver;
	public void M1() throws InterruptedException
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
			 Driver =new ChromeDriver();
			Driver.get("https://www.google.com/search?q=facebook+sign+up+new+account&rlz=1C1RXQR_enIN1015IN1015&oq=&aqs=chrome.5.0i66i67i308i362i524l8.7490j0j9&sourceid=chrome&ie=UTF-8");
			Driver.manage().window().maximize();
			Driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805964%7Cb%7Cfb%20sign%20up%7C&placement=&creative=550525805964&keyword=fb%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-294779041346%26loc_physical_ms%3D9062111%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI6YnVspmK-wIVRJlmAh1bHwjaEAAYASAAEgIDffD_BwE");
			Driver.navigate().back();
			Thread.sleep(2000);
			Driver.navigate().forward();
			Thread.sleep(2000);
   WebElement qw= Driver.findElement(By.xpath("//input[@type='text']"));//
   qw.sendKeys("name");
   // Driver.findElement(By.xpath("//input[@type='text']"))
			qw.sendKeys(" surname");
			Thread.sleep(4000);
  //  Driver.navigate().refresh();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public static void main(String[] args) 
{
	Practice3 w=new Practice3();
	try {
		w.M1();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
