package mouseclick;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseCl 

{
		public static void main(String[] args) throws InterruptedException 
		
		{
			System.setProperty("webdriver.gecko.driver", 
					 "D:\\selenium\\chromedriver_win32\\geckodriver.exe");

					 WebDriver driver = new FirefoxDriver();
						 		
				     driver.manage().window().maximize();
				     
				     driver.get("https://www.saucedemo.com/");
				     
				     

				     //email
				     WebElement Username=driver.findElement(By.id("user-name"));
				     Username.sendKeys("standard_user");
				     Thread.sleep(3000);
				      
				     
				    //Password
				     WebElement Password=driver.findElement(By.id("password"));
				     Password.sendKeys("secret_sauce");	
				     Thread.sleep(3000);
				     
				    //button
				     //login button
				     WebElement Loginbutton=driver.findElement(By.id("login-button"));
				     
				     Actions act=new Actions(driver);
				     act.click(Loginbutton).perform();
				     System.out.println();
		}
		
}
