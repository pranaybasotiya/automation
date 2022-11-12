package Program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class otherlocator2 

{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", 
				"D:\\selenium\\chromedriver_win32\\geckodriver.exe");

				WebDriver driver = new FirefoxDriver();
							 		
				driver.manage().window().maximize();
				
			    driver.get("https://www.facebook.com/");
			    
			    // linkText
			    WebElement link=driver.findElement(By.linkText("Forgotten password?"));
		         link.click();
	}

}
