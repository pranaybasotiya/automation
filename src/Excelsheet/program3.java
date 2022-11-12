package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program3 

{
	public static void main(String[] args) throws IOException 
	{
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
//
//
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/");
//		System.out.println("Open url");
		
		
		String address="D:\\software testing\\2.seleniumprogram\\word file\\fetch.xlsx";
		
		FileInputStream file = new FileInputStream(address);   
		
		XSSFWorkbook book = new XSSFWorkbook(file); 
		
		String username = book.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(username);
		
		String password=book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(password);
		
		
		

	}
}
