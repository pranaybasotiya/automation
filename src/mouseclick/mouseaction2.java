package mouseclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseaction2 

{
		public static void main(String[] args) 
		
		{
			System.setProperty("webdriver.gecko.driver", 
					 "D:\\selenium\\chromedriver_win32\\geckodriver.exe");

					 WebDriver driver = new FirefoxDriver();
					 System.out.println("Browser is opened ");
						 		
				     driver.manage().window().maximize();
				     System.out.println("Browser is maximized ");
				     
				     driver.get("https://demoqa.com/buttons");
				     System.out.println("Url is opened ");
				     
				//phase.1     
				     WebElement dbclick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
				     Actions pranay=new Actions(driver);
				     pranay.doubleClick(dbclick).perform();
				    
				     
				     
				     String expectedresult="You have done a double click";
				     WebElement msg=driver.findElement(By.xpath("//p[@id='doubleClickMessage']"));
				     String actualresult=msg.getText();
				    
				     
				     if(expectedresult.equals(actualresult))
				     {
				    	 System.out.println("Your text case is pass");
				     }
				     else
				     {
				    	 System.out.println("Your text case is fail");
				     }
				     
				//phase.2
				     
				     WebElement rightclick=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
				     Actions pranay2=new Actions(driver);
				     pranay2.contextClick(rightclick).perform();
				     
				     
				     String expectedresult2="You have done a right click";
				     WebElement msg2=driver.findElement(By.xpath("//p[@id='rightClickMessage']"));
				     String actualresult2=msg2.getText();
				     
				     if(expectedresult2.equals(actualresult2))
				     {
				    	 System.out.println("Tasecase is pass");
				     }
				     
				     else
				     {
				    	 System.out.println("Tasecase is fail");
				     }
				     
		}
}
