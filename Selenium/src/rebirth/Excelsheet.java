package rebirth;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream file = new FileInputStream("C:\\Users\\aaaa\\OneDrive\\Desktop\\excell fro practice.xlsx");	
String value = WorkbookFactory.create(file).getSheet("data2").getRow(0).getCell(0).getStringCellValue();
System.out.println(value);
}
}
