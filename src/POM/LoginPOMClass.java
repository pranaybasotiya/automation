package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPOMClass 

{
	
		//Webdriver
		WebDriver driver;
	//	private Actions act;
		 
		 //username
		 @FindBy(xpath="//input[@id='user-name']")
		WebElement username; 
		 
		 public void sendUsername()
		 {
			 username.sendKeys("standard_user");
		 }
		 
		 
		 //password
		 @FindBy(xpath="//input[@id='password']")
		WebElement password;
		 
		 public void sendpassword()
		 {
			 password.sendKeys("secret_sauce");
		 }
		 
		 
		 //loginbutton
		 @FindBy(xpath="//input[@id='login-button']")
		 WebElement loginbtn;
		 
		 public void sendbtn()
		 {
			 loginbtn.click();
		 }
		 
//		 public void sendbtn()
//		 {
//			
//			 act.click(loginbtn).perform();
//		 }
		 
		 
		 //cons declared
		  public LoginPOMClass( WebDriver driver)
		  {
			this.driver=driver;
			PageFactory.initElements(driver,this);
			//act = new Actions(driver);
		  }
	
}
