package dropDowns;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Dropdown {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver =new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); for selenium 3
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		 Thread.sleep(1000);
		 //click on the dropdown
		 driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']")).click();
		 Thread.sleep(1000);
		 
		 //selecting value from the dropdown
		// driver.findElement(By.xpath("//div[normalize-space()='Full-Time Permanent']")).click();
	
		  
		 //count no of options in the dropdown
		 
		 List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		 System.out.println("Number of Options:"+options.size());
		 
		 for(WebElement op:options)
		 {
			 System.out.println(op.getText());
		 }
		
		 Thread.sleep(1000);
		 driver.quit();
	}

}
