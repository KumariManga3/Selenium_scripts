package dropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//WebDriverManager.chromedriver().setup();
		//driver.get("https://google.com");
		driver.navigate().to("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement w=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		w.click();
		w.sendKeys("testing");
		Thread.sleep(2000);
		w.submit();
		
//		List<WebElement> options=driver.findElements(By.xpath("//ul[@role='listbox']//li[@class='sbct PZPZlf']"));
//		System.out.println(options.size());
//		
////		for(WebElement op:options)
////		{
////			System.out.println(op.getText());
////		}
//		
//		for(WebElement op:options)
//		{
//			if(op.getText().equals("testing"))
//			{
//				op.click();
//				break;
//			}
//		}
//		
////		for(int i=0;i<options.size();i++)
////		{
////			if(options.get(i).getText().equals("testing"))
////			{
////				options.get(i).click();
////				break;
////			}
////				
////		}
//       // driver.quit();
	}

}
