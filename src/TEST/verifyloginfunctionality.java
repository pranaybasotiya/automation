package TEST;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.LoginPOMClass;

public class verifyloginfunctionality 
{
public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Open url");
		
		
		
		//constructor
		LoginPOMClass lp = new LoginPOMClass(driver);
		lp.sendUsername();//call from public
		System.out.println("Username is entered");
		
		lp.sendpassword();//call from public
		System.out.println("Password is entered");
		
		lp.sendbtn();//call from public
		System.out.println("Clicked on login Button");
		
		
		System.out.println("Went on HomePage");
		
       
		
		//validation
		System.out.println("Apply validation");		
		String expectedTitle = "Swag Labs";   //BA/dev		
		String actaulTitle =driver.getTitle();	
		System.out.println("your title is->"+actaulTitle);
		
		if(expectedTitle.equals(actaulTitle))
		{
			System.out.println("Login Test is passed");
		}
		else
		{
			System.out.println("Login Test is failed");
		}
		
		//driver.quit();

		

	}
}

