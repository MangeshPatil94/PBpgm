package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Poopup {
	
	WebDriver driver;
	public void popup()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\selenium files\\\\chromedriver_win32\\\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/delete_customer.php");
			enterid();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	public void enterid() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("102");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		finals();
//		String text =driver.switchTo().alert().getText();
//		System.out.println(text);
//		//Thread.sleep(2000);
//		//driver.switchTo().alert().dismiss();
//		 driver.switchTo().alert().accept();
//		 String text2= driver.switchTo().alert().getText();
//		System.out.println(text2);
//		driver.switchTo().alert().accept();
	}
	public void finals()
	{
	 try {
		Alert pop = driver.switchTo().alert();
		 String text = pop.getText();
		 System.out.println(text);
		 pop.accept();
		 String text2= pop.getText();
		 System.out.println(text2);
		 pop.accept();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public static void main(String[] args)
	{
		Poopup popap=new Poopup();
		popap.popup();
	}

}
