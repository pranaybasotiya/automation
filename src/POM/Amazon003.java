package POM;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon003 

{
		
			
			WebDriver driver;
				//addtocart
				
				
			
          		
			@FindBy(xpath="//input[@id='add-to-cart-button']")
      		List<WebElement> AddTocartall;
      		WebElement Addtocart;
      		
      		
      		public void addbtn()
      		{
      			for(WebElement m : AddTocartall)
    				
    			{
    				m.click();
    			}
    		
      		}
          		
          		

       		 //cons declared
       		  public Amazon003  ( WebDriver driver)
       		  {
       			this.driver=driver;
       			PageFactory.initElements(driver,this);
       			
       		  }
      		 
          		
			
		
}
