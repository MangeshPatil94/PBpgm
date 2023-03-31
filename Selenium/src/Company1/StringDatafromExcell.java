package Company1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StringDatafromExcell 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException  {

	FileInputStream file=new FileInputStream("C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\excell fro practice.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("rebirth");
	CellType ns = sh.getRow(3).getCell(2).getCellType();
	System.out.println(ns);
    System.out.println(sh.getLastRowNum());
    System.out.println(sh.getRow(1).getLastCellNum());
    
//	for(int i=0;i<=sh.getLastRowNum();i++)
//	{
//		for(int j=0;j<sh.getRow(i).getLastCellNum();j++)
//		{
//			System.out.print(sh.getRow(i).getCell(j).getStringCellValue()+", ");
//		}
//		System.out.println();
//	}
	
	
	
	
	
//	FileInputStream file= new FileInputStream("C:\\\\Users\\\\aaaa\\\\OneDrive\\\\Desktop\\\\excell fro practice.xlsx");
//	Cell ex = WorkbookFactory.create(file).getSheet("rebirth").getRow(0).getCell(2);
	//String value = ex.getStringCellValue();
//	System.out.println(ex.getStringCellValue());
	//System.out.println(ex.getNumericCellValue());
	
	
	
	
	
	
//		FileInputStream file=new FileInputStream("C:\\Users\\aaaa\\OneDrive\\Desktop\\excell fro practice.xlsx");
//	double value = WorkbookFactory.create(file).getSheet("rebirth").getRow(0).getCell(2).getNumericCellValue();
//System.out.println(value);
}
}
