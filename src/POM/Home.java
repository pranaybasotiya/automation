package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home 
{
	private WebDriver driver;
	private Select s;
	
	//menu
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menubtn;
	
		public void Clickmenubutton()
		{
			menubtn.click();
		}
		
	//logout
	@FindBy(xpath="//a[@id='logout_sidebar_link']")	
	private	WebElement logout;
	
		public void Clickonlogout()
		{
			logout.click();
		}
		
		
		
	//addtocart
		
		@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
		private	WebElement addproduct;

		public void addtocart()
		{
			addproduct.click();
		}
		
		
		
	//bagproduct
		
		@FindBy(xpath="//span[@class='shopping_cart_badge']")
		private WebElement bagproduct;
		
		 public String bagproduct()
		{
			String actualcount=bagproduct.getText();
			return actualcount;
		}
		
		
		
		//allproduct		
				
		@FindBy(xpath="//button[text()='Add to cart']")
		List<WebElement> AddTocartall;
		public void AddTocartbutton()

{
		
		
			for(WebElement m : AddTocartall)
				
			{
				m.click();
			}
		
		
}	
		
		
	
		//pagefactory
		public Home (WebDriver driver)
		{
			  this.driver=driver;
			  PageFactory.initElements(driver,this);
			  s=new Select(filterdropdown);
		}
		
		
		
		//dropdown
		@FindBy(xpath="//select[@class='product_sort_container']")
		private WebElement filterdropdown;
		
		public void dropdown()
		{
			filterdropdown.click();
			
			s.selectByValue("za");
		}
		
		
		
		
		
		
	
}
