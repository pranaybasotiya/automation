package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prg1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver_win32\\chromedriver.exe");


				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				
				
				driver.get("https://chercher.tech/practice/frames");
				System.out.println("Open url");
				
				WebElement frameele=driver.findElement(By.xpath("//iframe[@id='frame2']"));
				driver.switchTo().frame(frameele);
				System.out.println("Switch on iframe");
				
				
				WebElement dropdown=driver.findElement(By.xpath("//select[@id='animals']"));
				dropdown.click();
				
				
				Select s=new Select(dropdown);
				s.selectByValue("avatar");
				
				

				

	}
}
