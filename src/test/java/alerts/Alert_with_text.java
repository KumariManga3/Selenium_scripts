package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_with_text {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.google.com/");
		//driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("hi Kumariiii......");
		alert.accept();
		
        //driver.quit();
	}
}
