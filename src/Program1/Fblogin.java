package Program1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fblogin

{
	
	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");


			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			 		
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.saucedemo.com/");
	     
	     //email
	     WebElement Username=driver.findElement(By.id("user-name"));
	     Username.sendKeys("standard_user");
	     Thread.sleep(3000);
	      
	     
	    //Password
	     WebElement Password=driver.findElement(By.id("password"));
	     Password.sendKeys("secret_sauce");	
	     Thread.sleep(3000);
	     
	     //login button
	     WebElement Loginbutton=driver.findElement(By.id("login-button"));
	     Loginbutton.click();
	     Thread.sleep(3000);
	     
	     
	     //filter
//	     WebElement filter=driver.findElement(By.className("product_sort_container"));
//	     filter.click();
//	     
//	     WebElement link=driver.findElement(By.linkText("Price (high to low)"));
//         link.click();
         
         //addtocrt
        List<WebElement> addtocart=driver.findElements(By.xpath("//button[text()='Add to cart']"));
        WebElement ele1=addtocart.get(0);
        
        for (int i=0;i<=addtocart.size();i++)
        {
        	addtocart.get(i).click();
        }
         
	     
	     //Logoutbutton
//	     WebElement Logoutbutton=driver.findElement(By.id("react-burger-menu-btn"));
//	     Logoutbutton.click();
//	     Thread.sleep(3000);
//	     
//	     WebElement Logoutbutton2=driver.findElement(By.id("logout_sidebar_link"));
//	     Logoutbutton2.click();
//	     Thread.sleep(3000);
//	     
	     
	  
	     
	     
	}

}
