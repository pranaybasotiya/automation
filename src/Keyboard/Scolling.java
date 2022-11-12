package Keyboard;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scolling 

{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened ");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximized ");
		
		driver.get("https://vctcpune.com/");
		System.out.println("Url is Correct ");
		
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//scrollup
		js.executeScript("window.scrollBy(0,1000)");
		
		//findelement
		
		js.executeScript("window.scrollBy(0,1000)");
		
		
		Thread.sleep(3000);
		
		//scrolldown
		js.executeScript("window.scrollBy(0,-2000)");
		
		

	}
}
