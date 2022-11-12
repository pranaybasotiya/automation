package Program1;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	 System.setProperty("webdriver.chrome.driver", 
 		 		"D:\\selenium\\chromedriver_win32\\chromedriver.exe");

    	 
    	
 		WebDriver driver = new ChromeDriver();
 		
 		driver.manage().window().maximize();
 		driver.get("https://hislopcollege.ac.in/");
 		Thread.sleep(3000);
 		
 		
// 		Dimension b=new Dimension(300,100);
// 		driver.manage().window().setSize(b);
// 		
 		
 		Point a=new Point(300,200);
 		driver.manage().window().setPosition(a);
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
	}
}
