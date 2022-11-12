package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Numeric 
{
	public static void main(String[] args) throws IOException 
	{
		String address ="D:\\software testing\\2.seleniumprogram\\word file\\fetch.xlsx";
		
		
		FileInputStream file = new FileInputStream(address);
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		double numeric=book.getSheet("numeric").getRow(0).getCell(0).getNumericCellValue();
		System.out.println(numeric);
		
		int maindata= (int)numeric;
		System.out.println(maindata);
		
		
		
		
	}
}
