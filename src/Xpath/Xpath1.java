package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath1 

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
			     username.sendKeys("standard_user");
			     
			     //password
			     WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
			     password.sendKeys("secret_sauce");
			     
			     //loginbutton
			     WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
			     loginbutton.click();
	}
}
