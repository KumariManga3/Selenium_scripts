package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dismiss_Alert {
  
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.xpath("//button[@onclick='showAlert()']")).click();
		WebElement element=driver.findElement(By.xpath("//button[@onclick='showAlert()']"));
		element.click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		alert.dismiss();
		Thread.sleep(2000);
		System.out.println("Alert not Found");
        //driver.quit();
	}

}

