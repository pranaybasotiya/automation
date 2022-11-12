package Program1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg1 

{
	public static void main(String[] args) throws InterruptedException {
		
	
	            System.setProperty("webdriver.chrome.driver", 
		 		"D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		 		WebDriver driver = new ChromeDriver();
		 		
		 		driver.manage().window().maximize();
		 		driver.get("https://hislopcollege.ac.in/");
//		 		Thread.sleep(12000);
		 		
		 		//browser close
		 		
		 		//driver.close();//close current tab 
		 		
		 		//or
		 		
//		 		driver.quit();//close whole browser
		 		
		 		String weburl=driver.getCurrentUrl();
		 		System.out.println("You url id->"+weburl);
		 		
		 		String webtitle=driver.getTitle();
		 		System.out.println("your title is->"+webtitle);
		 		
		 		
		 		
		 		System.out.println("end of program");
		 		
	}
		 		
}
