package Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class copypaste 

{
	
	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened ");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximized ");
		
		
		driver.get("https://text-compare.com/");
		System.out.println("Url is correct");
		Thread.sleep(3000);
		
		
		Actions textarea1 = new Actions(driver);
		
		WebElement textbox1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		textbox1.sendKeys("pranay");
		Thread.sleep(3000);
		System.out.println("Pranay");
		
		textarea1.keyDown(Keys.CONTROL);
		textarea1.sendKeys("A");
		textarea1.keyUp(Keys.CONTROL);
		System.out.println("Name is selected");
		Thread.sleep(3000);
		
		
		
		textarea1.keyDown(Keys.CONTROL);
		textarea1.sendKeys("c");
		textarea1.keyUp(Keys.CONTROL);
		System.out.println("Name is copied");
		
		textarea1.perform();
	
		Thread.sleep(3000);
		
		//control v
		Actions textarea2 = new Actions(driver);
		WebElement textbox2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		textbox2.click();
		
		System.out.println("Textbox 2");
		textarea2 .keyDown(Keys.CONTROL);
		textarea2 .sendKeys("v");
		textarea2 .keyUp(Keys.CONTROL);
		System.out.println("Paste in textbox2");
		textarea2 .perform();
		
        //button
		WebElement btn=driver.findElement(By.xpath("//div[@class='compareButtonText']"));
		System.out.println("CLick on compare button");
		btn.click();
		Thread.sleep(3000);
		

		//confirmation msg
		
		WebElement confrmsg=driver.findElement(By.xpath("//span[text()='The two texts are identical!']"));
		boolean confirmation= confrmsg.isDisplayed();
		Thread.sleep(3000);
		
		if(confirmation==true)
		{
			System.out.println("test case is pass");
		}
		
		else
		{
			System.out.println("test case is failed");
		}
		
	}

	
		
	}


