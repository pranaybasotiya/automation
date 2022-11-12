package Twiter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter 
{
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", 
					"D:\\selenium\\chromedriver_win32\\chromedriver.exe");

						WebDriver driver = new ChromeDriver();
						driver.manage().window().maximize();
					    driver.get("https://twitter.com/?logout=1664448602964");
					    Thread.sleep(3000);
						
					
											 
						 WebElement btnContinue=driver.findElement(By.xpath("//span[text()='Sign in']"));
						 btnContinue.click();
						 Thread.sleep(3000);
						  
						 WebElement username=driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1pi2tsx r-1wtj0ep r-u8s1d r-13qz1uu']"));
						 username.click();
						 Thread.sleep(3000);
						
		}
}
