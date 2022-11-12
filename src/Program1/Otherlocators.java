package Program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Otherlocators 

{
	
	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.gecko.driver", 
		"D:\\selenium\\chromedriver_win32\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
					 		
		driver.manage().window().maximize();
		
	    driver.get("https://www.saucedemo.com/");
	    
	 //1.tagname 
	    
//	     WebElement Username=driver.findElement(By.tagName("input"));
//	     Username.sendKeys("standard_user");
//	     Thread.sleep(3000);
        
	    //same attribute is not supporting
	    
	    //id
//	     WebElement Password=driver.findElement(By.id("password"));
//	     Password.sendKeys("secret_sauce");
//	     Thread.sleep(3000);
	     
	     
	     
	     
	 
	     //2.classname attribute
	     WebElement Password=driver.findElement(By.className("input_error form_input"));
	     Password.sendKeys("secret_sauce");
	     Thread.sleep(3000);
	    
	    
	     
	     //3.name attribute
	    
//	     WebElement username=driver.findElement(By.name("user-name"));
//	     username.sendKeys("standard_user");
//	     
//	     //password-name
//	     WebElement password=driver.findElement(By.name("password"));
//	     password.sendKeys("secret_sauce");
	     
	     
		
	}

}
