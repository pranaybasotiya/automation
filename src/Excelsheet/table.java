package Excelsheet;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table 

{
		public static void main(String[] args) 
		{
			
			System.setProperty("webdriver.chrome.driver",
					"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			System.out.println("Browser is opened ");
			
			driver.manage().window().maximize();
			System.out.println("Browser is maximized ");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					
			driver.get("https://vctcpune.com/selenium/practice.html");
			System.out.println("Url is opened ");
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("window.scrollBy(0,1005)");
			
			//multi data
			List<WebElement> columnHeaders= driver.findElements(By.xpath("//table//tbody//tr//th"));
			
			int numberOfColumns=columnHeaders.size();
			System.out.println("numberOfColumns is->"+numberOfColumns);
			
			for(int i=0;i<numberOfColumns;i++)
			{
				String columnHeadersTitle=columnHeaders.get(i).getText();
			    System.out.println(columnHeadersTitle);
			}
			
			//cell data
			List<WebElement> cellData =driver.findElements(By.xpath("//table//tbody//tr//td"));
			
			int totalNumberOfCells =cellData.size();
			System.out.println("totalNumberOfCells are->"+totalNumberOfCells);
			
			for(int i=0; i<totalNumberOfCells;i++)
			{
				String cellDataResult = cellData.get(i).getText();
			    System.out.println(cellDataResult);
			}
			
		}
}
