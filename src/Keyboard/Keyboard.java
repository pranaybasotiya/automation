package Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard 
{
		public static void main(String[] args) 
		
		{
			System.setProperty("webdriver.chrome.driver",
					"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			System.out.println("Browser is opened ");
			
			driver.manage().window().maximize();
			System.out.println("Browser is maximized ");
			
			String givenUrl="https://the-internet.herokuapp.com/key_presses";
			driver.get(givenUrl);
		    String actualurl=driver.getCurrentUrl();
			System.out.println("Url is opened ");
			
			
			Actions act1=new Actions(driver);
			act1.sendKeys("A").perform();
			

			if(actualurl.equals(givenUrl))
			{
		    	 System.out.println("Your text case is pass");
		     }
		     else
		     {
		    	 System.out.println("Your text case is fail");
		     }
			
			
			   WebElement usernam=driver.findElement(By.xpath("//p[@id='result']"));
			   String gettext=usernam.getText();
			   System.out.println(gettext);
			
			
			
		}
}
