package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class instagram 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");

					WebDriver driver = new ChromeDriver();
				    driver.get("https://www.instagram.com/login/");
					driver.manage().window().maximize();
					 
					Thread.sleep(3000);
					
					 
					
		 WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
		 username.sendKeys("pranaybasotiya2@gmail.com");
		 
		 WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		 password.sendKeys("pranay531997");
		 Thread.sleep(3000);
		 
		 WebElement login=driver.findElement(By.xpath("//div[text()='Log In']"));
		 login.click();
		 Thread.sleep(3000);
		 
		 WebElement logt=driver.findElement(By.xpath("//div[@class='_aaav']"));
		 logt.click();
		 Thread.sleep(3000);
		 
		
		 
//		 WebElement logout=driver.findElement(By.xpath("//div[text()='Log Out']"));
//		 logout.click();
//		 
					
	}
}
