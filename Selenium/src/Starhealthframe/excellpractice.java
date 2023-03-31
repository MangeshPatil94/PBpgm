package Starhealthframe;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sun.reflect.misc.FieldUtil;




public class excellpractice
{


private static final String FileUtil = null;

public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file = new FileInputStream("C:\\frame\\Excel Practice.xlsx");
	Sheet exl = WorkbookFactory.create(file).getSheet("pblogin");
	String data = exl.getRow(0).getCell(2).getStringCellValue();
	System.out.println(data);
	String data1 = exl.getRow(0).getCell(0).getStringCellValue();
	System.out.println(data1);
	
	
}
}
