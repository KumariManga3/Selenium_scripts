package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
   @BeforeClass
   public void setup() 
   {
	  driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
   }
   @Test
    void test() throws InterruptedException, IOException 
   {
	    WebElement w=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		w.click();
		w.sendKeys("iphone 17");
		Thread.sleep(2000);
		w.submit();
		//w.sendKeys(Keys.ENTER);
		
	     String mainPage=driver.getWindowHandle();
		//System.out.println("Main Page Url:"+mainPage);
		
		driver.findElement(By.xpath("//div[normalize-space()='Apple iPhone 17 (Lavender, 256 GB)']")).click();
		//  //div[normalize-space()='Apple iPhone 17 (Lavender, 256 GB)']
		//  //div[contains(text(),'Apple iPhone 15 (Black, 128 GB)')]
		Set<String> secondPage=driver.getWindowHandles();
		for(String page:secondPage)
		{
		if(!mainPage.equals(page))
		{
			driver.switchTo().window(page);
			break;
		}
		}
		//System.out.println("Second Page Url:"+driver.getCurrentUrl());
		//driver.findElement(By.xpath("//li//button[contains(@class,'QqFHMw vslbG+ In9uk2')]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2' and text()='Add to cart']")));
		//  //button[contains(text(),'Add to cart')]
		addToCartButton.click();
		
		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File(".//screenshots//my.png"));
   }
   @BeforeClass
   public void tearDown()
   {
	  // driver.close();
   }
}
