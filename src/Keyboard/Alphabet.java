package Keyboard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alphabet 

{
		public static void main(String[] args) throws InterruptedException 
		
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
			
			
			Actions act = new Actions(driver);
			
			act.sendKeys("A").perform();
			Thread.sleep(3000);
			
			
			act.sendKeys(Keys.ESCAPE).perform();	
			Thread.sleep(3000);
			
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(3000);
			
			act.sendKeys(Keys.CONTROL).perform();

		}
		
		
}
