package dropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BootStrap_DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement boot= driver.findElement(By.xpath("//button[@data-toggle='dropdown']"));
		boot.click();
		
		/*select single value
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		Thread.sleep(2000); */
		
		//for all values
     	
		List<WebElement>options=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//label"));
     	System.out.println(options.size());
		
     	/*for(WebElement op:options)
		{
			System.out.println(op.getText());
		}*/
		
		
     	//select multiple options
		for(WebElement op:options)
		{
			String o=op.getText();
			if(o.equals("Java")||o.equals("Python")||o.equals("MySQL"))
			{
				op.click();
			}
		}
       driver.quit();
	}

}
