package TEST;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Amazonhome002;
import POM.loginamazon_001;

public class Amazon002 

{	
	@Test
	public void Amazon002()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");


			WebDriver driver=new ChromeDriver();
			System.out.println("Browser is opened");
			
			driver.manage().window().maximize();
			System.out.println("Browser is maximized");
			
			driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
			System.out.println("Open url");
			System.out.println("Went on loginpage");
			
			String webtitle=driver.getTitle();
			System.out.println("Your title is->"+webtitle);
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			
			
			//constructor
			//login
			loginamazon_001 lp = new loginamazon_001(driver);
			lp.sendUsername();//call from public
			System.out.println("Username is entered");
			
			lp.sendbtn();//call from public
			System.out.println("Clicked on login Button");
			
			lp.password();//call from public
			System.out.println("Password is entered");
			
			lp.SignIn();//call from public
			System.out.println("Sign in successfully");
			
			
			System.out.println("Went on HomePage");
			
			
			//Homepage
			Amazonhome002 hp = new Amazonhome002(driver);
			hp.navbar();
			System.out.println("Click on babycare");
			
			hp.pants();
			System.out.println("click on diaper pants");
			
			hp.amazon1();
			System.out.println("Click on amazon logo");
			
			System.out.println("Went to the homepage");
			
			
			hp.search();
			System.out.println("Searching mobile");
			
			hp.btn();
			System.out.println("Click on search button");
			
			hp.mobnme();
			System.out.println("Click on mobile link");
			
			
			
			
			
			
			
			
			
			
			
			
}
}
