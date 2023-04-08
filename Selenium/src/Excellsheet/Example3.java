package Excellsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example3 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream file = new FileInputStream("C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\excell fro practice.xlsx");
 WorkbookFactory.create(file).getSheet("data2").getRow(0).getCell(0).getStringCellValue();
 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
 String mobno = sh.getRow(0).getCell(0).getStringCellValue();
 System.out.println(mobno);
}
}
