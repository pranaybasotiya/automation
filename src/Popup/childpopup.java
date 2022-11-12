package Popup;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childpopup 
{
	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", 
		 		"D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		    
		    	WebDriver driver = new ChromeDriver();
		    	driver.manage().window().maximize();
		 		Thread.sleep(3000);
		 		System.out.println("Window is maximize");
                driver.get("https://vctcpune.com/#");
                
                //URL
                String URL =driver.getCurrentUrl();
          		System.out.println("URL opened and URL is- "+URL);
          		
          		//Title
          		String title=driver.getTitle();
          		System.out.println("Title is- "+title);
          		
          		//address
//          		String address=driver.getWindowHandle();
//          		System.out.println("Mainpage Address is- "+address);
//          		Thread.sleep(1000);
          		
          		
          		
          		
          		
          		//Parent page
		 		WebElement startseleniumpractice= driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'][1])"));
		 		startseleniumpractice.click();
		 		Thread.sleep(1000);
		 		
          		
          		//multiple address
          	    //	Set<String> allpagead=driver.getWindowHandles();
		 		//selenium will switched in second window
          		List<String> allpagead=new ArrayList<String>(driver.getWindowHandles());
          		System.out.println("All page address"+allpagead);
          		
          		//switch on child pge
          		driver.switchTo().window(allpagead.get(1));
		 		

          	    //childclass
		 		WebElement Textbox=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		 		Textbox.sendKeys("Pranay");
          		
		 		
	}
}
