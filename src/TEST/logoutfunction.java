package TEST;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Home;
import POM.LoginPOMClass;

public class logoutfunction 
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
			
			
			
			
			//Loginactivity from pom
			LoginPOMClass lp =new LoginPOMClass(driver);
			lp.sendUsername();	
			System.out.println("Username is entered");
			lp.sendpassword();
			System.out.println("Password is entered");
			lp.sendbtn();
			System.out.println("Clicked on login button");
			
			//homepage
			
			System.out.println("Went to home page");
			
			
			Home pb =new Home(driver);
			pb.Clickmenubutton();
			System.out.println("Click on menu button");
			pb.Clickonlogout();
			System.out.println("Click onLogout button");
			
			
			System.out.println("Went to login page");
			
			//Validation
			System.out.println("apply validation");
			String expectedtitle ="Swag Labs";
			String Actualtitle=driver.getTitle();
			if(expectedtitle.equals(Actualtitle))
			{
				System.out.println("Logout test is pass");
			}
			
			else
				
			{
				System.out.println("Logout test is fail");
			
			}
			
	}
}
