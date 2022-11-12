package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Program1 
{
	public static void main(String[] args) throws IOException 
	
	{
		System.setProperty("webdriver.gecko.driver", 
				"D:\\selenium\\chromedriver_win32\\geckodriver.exe");

						 WebDriver driver = new FirefoxDriver();
							 		
					     driver.manage().window().maximize();
					     
					     driver.get("https://www.saucedemo.com/");
					     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					     
					     
					     //Screenshot
					     TakesScreenshot ts= (TakesScreenshot)driver;
					     File sourcefile= ts.getScreenshotAs(OutputType.FILE);
					     File destfile = new File("D:\\software testing\\2.seleniumprogram\\pranay.jpg");
					     FileHandler.copy(sourcefile, destfile);
					     
					     
					     
					     
					     
					     
					     
					     
					     //username
					     WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
					     username.sendKeys("standard_user");
					     
					     //password
					     WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
					     password.sendKeys("secret_sauce");
					     
					     //loginbutton
					     WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
					     loginbutton.click();
	}
	
}
