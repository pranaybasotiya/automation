package Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart 

{
	
	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
							 		
					 driver.manage().window().maximize();
					 
					 
					 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
					 driver.get("https://www.flipkart.com/");
					 
					 
					 
					 String webtitle=driver.getTitle();
					 System.out.println("Your title is->"+webtitle); 
					 
//					WebElement login= driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
//					login.click();
					
					WebElement email= driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
					email.sendKeys("7218729439");
					Thread.sleep(3000);
					
					WebElement password= driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
					password.sendKeys("9371710693");
					Thread.sleep(3000);
					
					WebElement button= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
				    button.click( );
					Thread.sleep(3000);
				    
				    //nav
				    WebElement nav= driver.findElement(By.xpath("//div[text()='Mobiles & Tablets']"));
				    nav. click();
				    Thread.sleep(3000);
				    
					//logout
				   
				    WebElement nav2= driver.findElement(By.xpath("//div[text()='Pranay']"));
				    Actions pranay=new Actions(driver);
				    pranay.doubleClick(nav2).perform();
				    Thread.sleep(3000);
				    
				   //logout
				    WebElement nav3= driver.findElement(By.xpath("//div[text()='Logout']"));
				    nav3.click( );
				    Thread.sleep(3000);
	}

}
