package keyboard_Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardActions_with_sendkeys {
	public static void main(String[]args) {
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://text-compare.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	 WebElement textbox=driver.findElement(By.name("text1"));
	 
	 textbox.click();
	 textbox.sendKeys("Hi Kumari manga welcome........");
	 
	 textbox.sendKeys(Keys.CONTROL+"a");
	 
	 textbox.sendKeys(Keys.CONTROL+"c");
	 
	 textbox.sendKeys(Keys.TAB);
	 
	 textbox.sendKeys(Keys.CONTROL+"v");
	// textbox.sendKeys("Hi Kumari manga welcome........");
	//driver.quit();
}
}