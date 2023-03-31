package Excellsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex2rowvalue
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\excell fro practice.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("data2");
	int size = sh.getRow(0).getLastCellNum()-1;
	System.out.println(size);
	for(int i=0;i<=size;i++)
	{
		String value = sh.getRow(0).getCell().getStringCellValue();
	System.out.println(value+" ");
	}
}
}
