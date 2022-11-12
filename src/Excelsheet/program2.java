package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class program2 

{
	public static void main(String[] args) throws IOException 
	{
		//file location
		String address="D:\\software testing\\2.seleniumprogram\\word file\\Automation.xlsx";
		
		
	    FileInputStream file = new FileInputStream(address);     
		
		//workbook read	
		XSSFWorkbook book = new XSSFWorkbook(file); 
		
		//read the sheet
	    XSSFSheet sheet = book.getSheet("Pranay");
		
		//name
	    XSSFRow row = sheet.getRow(0);
	    XSSFCell cell = row.getCell(0);
	    String username =cell.getStringCellValue();
		System.out.println(username);
	
	    
	   //college
	    
		    XSSFRow row1 = sheet.getRow(1);
		    XSSFCell cell2 = row1.getCell(0);
		    String college =cell2.getStringCellValue();
			System.out.println(college);
			
		//Age 
			
		    XSSFRow row2 = sheet.getRow(2);
		    XSSFCell cell3 = row2.getCell(0);
		    String age =cell3.getStringCellValue();
			System.out.println(age);
		
	    
	    
	}
}
