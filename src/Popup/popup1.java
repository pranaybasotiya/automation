package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup1
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
		 		"D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		    
		    	WebDriver driver = new ChromeDriver();
		    	driver.manage().window().maximize();
		 		Thread.sleep(3000);
		 		System.out.println("Window is maximize"); 
		 		
		    	driver.get("https://demoqa.com/alerts");
		    	System.out.println("Browser is open"); 
		 		System.out.println("URL is valid"); 
		 		
		 		
		 		
		 		
		 		
		 		//click1
		 WebElement clickme1=driver.findElement(By.xpath("//button[@id='alertButton']"));
		 clickme1.click();
		 Thread.sleep(2000);
		 		
		 		
		 //alt1
		 Alert alt1=driver.switchTo().alert();
		 Thread.sleep(1000);
		 String gettext=alt1.getText();
		 System.out.println("The text of Click1 is"+gettext);
		 alt1.accept();
		 		
		 		
		 		
		 		
		 		//click2
		 		WebElement clickme2=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		 		clickme2.click();
		 		Thread.sleep(6000);
		 		
		 		//alt2
		 		Alert alt2=driver.switchTo().alert();
		 		Thread.sleep(6000);
		 		String gettext2=alt2.getText();
				System.out.println("The text of Click1 is"+gettext2);
		 		alt2.accept();
		 		
		 		//click3
		 		WebElement clickme3=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		 		clickme3.click();
		 		Thread.sleep(6000);
		 		
		 		
		 		//alt3
		 		Alert alt3=driver.switchTo().alert();
		 		Thread.sleep(6000);
		 		String gettext3=alt2.getText();
				System.out.println("The text of Click1 is"+gettext3);
		 		alt2.accept();
		 		
		 		
		 		//click4
		 		WebElement ClickMe4=driver.findElement(By.xpath("//button[@id='promtButton']"));
				ClickMe4.click();
				Thread.sleep(3000);
				
				
				//alt4
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
	


		
	

