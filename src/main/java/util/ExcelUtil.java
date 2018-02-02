package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import base.TestBase;

public class ExcelUtil extends TestBase{
	
	 File file;
	Workbook wb;
	Sheet sh;
	FileInputStream fis;
	
	
	public void getExcelData(String sheet, int row, int cell) throws Exception{
		
		 file = new File("C:\\Users\\kumars\\workspace\\FreeCRMTest\\src\\main\\java\\"
				+ "data\\FreeCrmTestData.xlsx");
		 fis = new FileInputStream(file);
		
		 wb = WorkbookFactory.create(fis);
		 sh = wb.getSheet(sheet);
		
		String cellValue = sh.getRow(row).getCell(cell).getStringCellValue();
		System.out.println("Title is "+cellValue);
	}
	
	public void getAllSheetData(String sheet) throws Exception
	{
		 file = new File("C:\\Users\\kumars\\workspace\\FreeCRMTest\\src\\main\\java\\"
				+ "data\\FreeCrmTestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		System.out.println("printing all "+sh.getLastRowNum()+" title values");
		
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
		String cellValue = sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println(cellValue);
		
		String cellValue1 = sh.getRow(i).getCell(2).getStringCellValue();
		System.out.println(cellValue1);
		}
	}
	
	
}
