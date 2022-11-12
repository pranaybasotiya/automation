package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program1 
{
	public static void main(String[] args) throws IOException 
	{
		
		//file location
		String address="D:\\software testing\\2.seleniumprogram\\word file\\Automation.xlsx";
		
		
	FileInputStream file = new FileInputStream(address);     //accept the exception
		
		//workbook read	
		XSSFWorkbook book = new XSSFWorkbook(file); //accept the exception
		
		//read the sheet
	    XSSFSheet sheet = book.getSheet("Pranay");
		
		//read the row
	    XSSFRow row = sheet.getRow(0);
	   
		
		//read the columns/cell
	    XSSFCell cell = row.getCell(0);
	   
	    
		
	    //read the data
	    String username =cell.getStringCellValue();
		System.out.println(username);

	}
	
	
	
}
