package booleanxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bollean 
{
		public static void main(String[] args)
		
		{
			System.setProperty("webdriver.gecko.driver", 
					 "D:\\selenium\\chromedriver_win32\\geckodriver.exe");

					 WebDriver driver = new FirefoxDriver();
						 		
				     driver.manage().window().maximize();
				     
				     driver.get("https://www.saucedemo.com/");
				     
				     //username
				     WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
				     boolean result=username.isDisplayed();
				     System.out.println("Is username displayed->"+result);
				     
				     if(result==true)
				     {
				    	 System.out.println("The username element is pass");
				    	 username.sendKeys("standard_user");
				    	 System.out.println("testcase is pass");
				     }
				     
				     else
				     {
				    	 System.out.println("The user element is not present");
				    	 System.out.println("testcase is failed");
				     }
				     
				     
				     
				     
		}
}
