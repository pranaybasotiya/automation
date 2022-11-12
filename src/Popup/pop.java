package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		
		System.setProperty("webdriver.chrome.driver", 
		 		"D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		    
		    	WebDriver driver = new ChromeDriver();
		    	driver.manage().window().maximize();
		 		Thread.sleep(3000);
		 		System.out.println("Window is maximize"); 
		 		
		    	
		    	
		 		
		//URL opened
		driver.get("https://demoqa.com/alerts");
		String URL =driver.getCurrentUrl();
		System.out.println("URL opened and URL is- "+URL);
		Thread.sleep(1000);
		
		//clickme1 button
		WebElement ClickMe1=driver.findElement(By.xpath("//button[@id='alertButton']"));
		ClickMe1.click();
		Thread.sleep(2000);
		
		//
		Alert alt=driver.switchTo().alert();
		Thread.sleep(1000);
		String clickme1string=alt.getText();
		System.out.println("Text for clickme1 is- "+ clickme1string);
		alt.accept();
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
		
		
		
		//clickme2
		WebElement ClickMe2=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		ClickMe2.click();
		Thread.sleep(6000);
		
		
		//
		Alert alt2=driver.switchTo().alert();
		String clickme2string= alt2.getText();
		System.out.println("Text for clickme2 is- "+ clickme2string);
		alt2.accept();
		
		
		//clickme3
		WebElement ClickMe3=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		ClickMe3.click();
		Thread.sleep(3000);
		
		
		//
		Alert alt3=driver.switchTo().alert();
		String clickme3string= alt3.getText();
		System.out.println("Text for clickme3 is- "+ clickme3string);
		alt3.accept();
		
		
		//clickme4
		WebElement ClickMe4=driver.findElement(By.xpath("//button[@id='promtButton']"));
		ClickMe4.click();
		Thread.sleep(3000);
		
		
		//
		Alert alt4=driver.switchTo().alert();
		String clickme4string= alt4.getText();
		System.out.println("Text for clickme4 is- "+ clickme4string);
		//alt4.sendKeys("This is last program");
		Thread.sleep(5000);
		alt4.accept();
		Thread.sleep(2000);
		
		//validation
		WebElement result=driver.findElement(By.xpath("//span[text()='On button click, prompt box will appear']"));
		String expected=result.getText();
		//System.out.println("expected is- "+expected);
		String actual="On button click, prompt box will appear";
		
		if(expected.equals(actual))
		{
			System.out.println("TC pass");
		}
		else
		{
			System.out.println("TC fail");
		}
		
		
		
		
		System.out.println("End of Programs");
	}
}
