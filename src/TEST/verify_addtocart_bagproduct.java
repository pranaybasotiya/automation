package TEST;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Home;
import POM.LoginPOMClass;

public class verify_addtocart_bagproduct 

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
			System.out.println("Open url");
			System.out.println("Went on loginpage");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			
			
			//login activity
			LoginPOMClass lp = new LoginPOMClass(driver);
			lp.sendUsername();//call from public
			System.out.println("Username is entered");
			
			lp.sendpassword();//call from public
			System.out.println("Password is entered");
			
			lp.sendbtn();//call from public
			System.out.println("Clicked on login Button");
			
			//homepage
			System.out.println("Went on HomePage");
			
			
			
		//addtocart	
			Home  hp = new Home(driver);
			hp.addtocart();
			System.out.println("Bag product is selected");
			
			
			
			//validation
			System.out.println("Apply validation");
			String exepectedproductcount="1";
			String actualProduct=hp.bagproduct();
			
			if(exepectedproductcount.equals(actualProduct))
			{
				System.out.println("Bag product test case is pass");
			}
			else
			{
				System.out.println("Bag product  test case is fail");
			}
			
			 driver.quit();
			 System.out.println("Browser is closed");
			
	}
	

}
