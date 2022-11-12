package selectelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectelement 

{
		public static void main(String[] args) throws InterruptedException 
		
		{
			
			
			System.setProperty("webdriver.chrome.driver",
					"D:\\selenium\\chromedriver_win32\\chromedriver.exe");


				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805697%7Cb%7Cfb%27%27%27%27%7C&placement=&creative=550525805697&keyword=fb%27%27%27%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221592%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327681933321%26loc_physical_ms%3D1007786%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjws--ZBhAXEiwAv-RNL6zmdufNyOhOy8DfwV8S9j_d8Hbp6uPmnIV1KuGffz8XrM9_y4gC1BoCzn4QAvD_BwE");
				System.out.println("Open url");
				
				
				WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
				username.sendKeys("Pranaybasotiya2@gmail.com");
				
				
				WebElement surnname=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
				surnname.sendKeys("Basotiya");
				
				WebElement mob=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
				mob.sendKeys("62621762");
				
				
				WebElement pswrd=driver.findElement(By.xpath("//input[@type='password']"));
				pswrd.sendKeys("62621762");
				
				WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
				day.click();
				Select s=new Select(day);
				s.selectByVisibleText("5");
				Thread.sleep(3000);
				
				
				WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
				month.click();
				Select p=new Select(month);
				p.selectByVisibleText("Mar");
				Thread.sleep(3000);
				
				
				WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
				year.click();
				Select h=new Select(year);
				h.selectByValue("1997");
				Thread.sleep(3000);
				
				WebElement gender=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
				boolean result=gender.isSelected();
				System.out.println("Is radio displayed->"+result);
				
				if(result==true)
			     {
			    	 System.out.println("The radio button is pass");
			    	 gender.click();
			    	 System.out.println("testcase is pass");
			     }
			     
			     else
			     {
			    	 System.out.println("The user element is not present");
			    	 System.out.println("testcase is failed");
			     }
				
			
		}
}
