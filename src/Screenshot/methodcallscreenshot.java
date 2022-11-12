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

public class methodcallscreenshot 

{
	static WebDriver driver; 
	 
	public static void getscreenshot(String name) throws IOException
	{
		 //Screenshot
	     TakesScreenshot ts= (TakesScreenshot)driver;
	     File sourcefile= ts.getScreenshotAs(OutputType.FILE);
	     File destfile = new File("D:\\software testing\\2.seleniumprogram\\"+name+".jpg");
	     FileHandler.copy(sourcefile, destfile);
	     
	}
	public static void main(String[] args) throws IOException
	
	{
		System.setProperty("webdriver.gecko.driver", 
				"D:\\selenium\\chromedriver_win32\\geckodriver.exe");

						driver=  new FirefoxDriver();
							 		
					    driver.manage().window().maximize();
					     
					     driver.get("https://www.saucedemo.com/");
					     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					     
					     getscreenshot("Login1");//screenshot
					    
					     
					        //username
						     WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
						     username.sendKeys("standard_user");
						     
						     //password
						     WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
						     password.sendKeys("secret_sauce");
						     
						     //loginbutton
						     WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
						     loginbutton.click();
						     getscreenshot("Login2");
	}
}
