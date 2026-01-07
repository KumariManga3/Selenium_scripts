package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	
	driver=new ChromeDriver();
	driver.get("https://www.espncricinfo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.findElement(By.xpath("//span[contains(text(),'ICC player rankings')]")).click();
	Thread.sleep(3000);;
	WebElement table=driver.findElement(By.xpath("//h2[text()='Test Batters Rankings']/ancestor::div[contains(@class,'ds-rounded-xl')]//table"));
	Thread.sleep(3000);
	List<WebElement>rows=table.findElements(By.tagName("tr"));
	for(int i=1;i<rows.size();i++)
	{
		//System.out.println(rows.get(i).getText());
		List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
		
		String name=cols.get(1).getText();
		String country=cols.get(2).getText();
		if(country.equalsIgnoreCase("india"))
		{
			System.out.println("Name:"+name);
		}
		
	}
	driver.quit();
	}
    
}
