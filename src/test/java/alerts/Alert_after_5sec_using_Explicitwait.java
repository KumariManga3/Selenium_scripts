package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_after_5sec_using_Explicitwait {
	public static void main(String [] args) {
	WebDriver driver= new ChromeDriver();
	//driver.get("https://www.google.com/");
	driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/alerts.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//button[@onclick='myMessage()']")).click();
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	Alert alert=wait.until(ExpectedConditions.alertIsPresent());
	System.out.println(alert.getText());
	alert.accept();
    //driver.quit();
}
}


