package dropDowns;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_DropDown {

	public static void main(String[] args) {	
		WebDriver driver=new ChromeDriver();
	    driver.get("https://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebElement countryDropDown=driver.findElement(By.id("country"));
	    Select s=new Select(countryDropDown);
	    //s.selectByVisibleText("France");
	    //s.selectByValue("france");
	    //s.selectByIndex(4);
	    
	    //Printing all the options available in the dropdown
	    List<WebElement> options=s.getOptions();
	    System.out.println("All the options in a drodown:"+options.size());
	    for(int i=0; i<options.size();i++)
	    {
	    	
	    	System.out.println(options.get(i).getText());
	    }
	    
		/*for(WebElement op:options) 
		{
			System.out.println(op.getText());
		}*/
       driver.quit();
	}

}
