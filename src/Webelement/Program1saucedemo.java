package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1saucedemo 

{
	
	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver",
							"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("Open url");
		
		
//		
//		WebElement username=driver.findElement(By.xpath("//input[@class='input_error form_input']"));
//		username.clear();
//		username.sendKeys("standard_user");
//		System.out.println("Entered username");
//		
//		
//		WebElement password=driver.findElement(By.id("password"));
//		password.clear();
//		password.sendKeys("secret_sauce");
//		System.out.println("Entered password");
		
	//****************************************************************88
		//show attribute name
		
		WebElement username=driver.findElement(By.xpath("//input[@class='input_error form_input']"));
		
		String tagName=username.getTagName();  
		System.out.println("tagname of username is->" +tagName);
		
		String idAv=username.getAttribute("id");
		System.out.println("id of username is->" +idAv);
		
		String gettext=username.getText();
		System.out.println("tagname of username is" +gettext);
		
		
		
		
	}

}
