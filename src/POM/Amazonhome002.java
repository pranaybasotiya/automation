package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazonhome002 

{
	 WebDriver driver;
	
	
	//menu
	@FindBy(xpath="//a[text()='Baby']")
	WebElement home;
	
		public void navbar()
		{
			home.click();
			
		}
		
		//navbar
		@FindBy(xpath="//span[text()='Diaper pants']")
		WebElement Dpants;
		
			public void pants()
			{
				Dpants.click();
				
			}
			
			
			@FindBy(xpath="//a[@id='nav-logo-sprites']")
			WebElement amazon;
			
				public void amazon1()
				{
					amazon.click();
					
				}	
			
		
				
			@FindBy(xpath="//input[@id='twotabsearchtextbox']")
			WebElement searchbox;
			
				public void search()
				{
					searchbox.sendKeys("Samsung galaxy");
				}
				
			
				@FindBy(xpath="//input[@id='nav-search-submit-button']")
				WebElement searchbtn;
				
					public void btn()
					{
						searchbtn.click();
					}
					
					
				@FindBy(xpath="//span[text()='Samsung Galaxy S20 FE 5G (Cloud Mint, 8GB RAM, 128GB Storage)']")	
				WebElement mobilenme;
				
				public void mobnme()
				{
					mobilenme.click();
				}
				
				
				
		
		 //cons declared
		  public Amazonhome002 ( WebDriver driver)
		  {
			this.driver=driver;
			PageFactory.initElements(driver,this);
			
		  }
		
		

		
		
}
