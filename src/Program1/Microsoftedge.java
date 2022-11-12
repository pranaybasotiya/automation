package Program1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Microsoftedge

{
	public static void main(String[] args) throws InterruptedException 
    
    {
    	 System.setProperty("webdriver.gecko.driver", 
 		"D:\\selenium\\chromedriver_win32\\geckodriver.exe");

 		WebDriver driver = new FirefoxDriver();
 		
 		driver.manage().window().maximize();
 		
 		
 		
 		
 		//case.1
 		driver.get("https://www.Facebook.com/");
 		Thread.sleep(3000);
 		
 		
 		//case.2
 		driver.navigate().to("https://www.selenium.dev/");
 		Thread.sleep(3000);
 		
 		driver.navigate().back();//fb
 		Thread.sleep(3000);
 		
 		driver.navigate().forward();//selenium
 		Thread.sleep(3000);
 		
 		driver.navigate().refresh();//selenium
 		
 		System.out.println("End to program");
 		
 		
 	 
 		
 		

	}
}
