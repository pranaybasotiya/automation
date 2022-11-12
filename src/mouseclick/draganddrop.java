package mouseclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop 

{
		public static void main(String[] args) 
		
		{
			System.setProperty("webdriver.gecko.driver", 
					 "D:\\selenium\\chromedriver_win32\\geckodriver.exe");

					 WebDriver driver = new FirefoxDriver();
						 		
				     driver.manage().window().maximize();
				     
//				     driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
				     
				     
				     String givenUrl="http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
				     driver.get(givenUrl);
				     String actualurl=driver.getCurrentUrl();
				     
				     
				     if(actualurl.equals(givenUrl))
			
				     {
				    	 System.out.println("url is correct");
				    	 WebElement washington=driver.findElement(By.xpath("//div[@id='box3']"));
				    	 WebElement USA=driver.findElement(By.xpath("//div[@id='box103']"));
				    	 
				    	 
				    	 Actions action=new Actions(driver);
				    	 
				    	 action.dragAndDrop(washington, USA).build().perform();
				    	 System.out.println("Drag and drop action is perform");
				    	 
				//Attribute    	 
				    	 
				    	 String GivAv="visibility:visible";
				    	 String ActAV=washington.getAttribute("style");
				    	 System.out.println(ActAV);
				    	 System.out.println(GivAv);
				    	 
				    	 
				    	 if(ActAV.equals(GivAv)) 
				    	 {
				    		 System.out.println("tc pass");
				    	 }
				    	 
				    	 else
				    	 {
				    		 System.out.println("tc fail");
				    	 }
				    	 
		              }
				    	 
				    	 else
				    	 {
				    		 System.out.println("url is correct");
				    	 }
				    	 
			}
				     
				     
				     
}
