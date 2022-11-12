package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchfromexcel 
{
		public static void main(String[] args) throws IOException 
		
		{
			System.setProperty("webdriver.chrome.driver",
					"D:\\selenium\\chromedriver_win32\\chromedriver.exe");


			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			System.out.println("Open url");
			
			
			String address="D:\\software testing\\2.seleniumprogram\\word file\\fetch.xlsx";
			
			 FileInputStream file = new FileInputStream(address);     
				
				//workbook read	
				XSSFWorkbook book = new XSSFWorkbook(file);
				XSSFSheet sheet = book.getSheet("sheet1");
			 
			 
			 
				//read row
				XSSFRow row = sheet.getRow(0);
		    
				//read cell
				XSSFCell cell = row.getCell(0);
		    
				//mail-ID
				String username=cell.getStringCellValue();
				System.out.println(username);
		    
				WebElement username1=driver.findElement(By.xpath("//input[@id='user-name']"));
				 
				username1.sendKeys(username);
		    
		    
				//password
				XSSFRow row2=sheet.getRow(1);
				XSSFCell cell1=row2.getCell(0);
		    
		    
			    String password=cell1.getStringCellValue();
			    System.out.println(password);
			    
			    WebElement passwordfield=driver.findElement(By.xpath("//input[@id='password']"));
			    passwordfield.sendKeys(password);
			    
		    
		    
		    
		    
		    
		    
			
			
			
			
			
		}
}
