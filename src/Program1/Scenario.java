package Program1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario 

{
	
	public static void main(String[] args) 
	
	{
		 System.setProperty("webdriver.chrome.driver", 
	 		"D:\\selenium\\chromedriver_win32\\chromedriver.exe");

	    	 
	    	WebDriver driver = new ChromeDriver();
	 		
	 		String url="https://hislopcollege.ac.in/";
	 		driver.get(url);
	 		
	 		driver.manage().window().maximize();
	 		String actualurl=driver.getCurrentUrl();
	 		
	 		if(url.equals(url))
	 		{
	 			System.out.println("Testcase is pass");
	 		}
	 		
	 		else
	 		{
	 			System.out.println("Test case is fail");
	 		}
	}

}
