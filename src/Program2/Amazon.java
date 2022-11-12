package Program2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon 
{
	
	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			 		
			 		driver.manage().window().maximize();
			 		
			 		
			 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 		
			 		
			 		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
			 		
			 		//Phase 1
			 		String webtitle=driver.getTitle();
			 		System.out.println("Your title is->"+webtitle);
			 		
			 		
			 		WebElement email=driver.findElement(By.id("ap_email"));
			 		email.sendKeys("Pranaybasotiya2@gmail.com");
			 		
			 		WebElement button=driver.findElement(By.id("continue"));
			 		button.click( );
			 		
			 		
			 		WebElement password=driver.findElement(By.id("ap_password"));
			 		password.sendKeys("9371710693");
			 		
			 		
			 		WebElement signIn=driver.findElement(By.id("signInSubmit"));
			 		signIn.click( );
			 		
			 		//Phase II
			 		String webtitle2=driver.getTitle();
			 		System.out.println("Your title is->"+webtitle2);
			 		
			 		//Phase III
			 		
			 		
			 		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
			 		searchbox.sendKeys("Iphone");
			 		
			 		System.out.println("Product is search");
			 		Thread.sleep(2000);
			 		
			 		WebElement searchbtn=driver.findElement(By.id("nav-search-submit-button"));
			 		searchbtn.click( );
			 		Thread.sleep(2000);
			 		
			 		

			 		
			 					 		
			 		WebElement detail=driver.findElement(By.linkText("Apple iPhone 12 (128GB) - Purple"));
			 		detail.click( );
			 		System.out.println("Product list present");
			 		Thread.sleep(5000);
			 		
			 		//scroll down
			 		JavascriptExecutor js=(JavascriptExecutor)driver;
			 		//scrolldown
		
			 		js.executeScript("arguments[0].scrollIntoView(true);",detail);
			 		Thread.sleep(9000);
			 		

			 		
			 		//selenium will switched in second window
	          		List<String> allpagead=new ArrayList<String>(driver.getWindowHandles());
	          		System.out.println("All page address"+allpagead);
	          		driver.switchTo().window(allpagead.get(1));
	          		
	          		WebElement cart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
			 		cart.click();
	          		System.out.println("Product is in addtocart");
	          		
	          		
	          		
	          		
	          		
	          		
	          		WebElement logout=driver.findElement(By.linkText("//span[text[]='Account & Lists']"));
			 		Actions act1=new Actions(driver);
			 		act1.doubleClick(logout).perform();
			 		Thread.sleep(3000);
			 		
				    WebElement Logoutbutton2=driver.findElement(By.xpath("//span[text[]='Sign Out']"));
				    act1.doubleClick(Logoutbutton2).perform();
				    
				    
			 		
	}

}
