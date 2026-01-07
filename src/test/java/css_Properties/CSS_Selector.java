package css_Properties;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {
    
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	/*tag id*/
	driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");	
	driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
	
	/*tag class*/
	driver.findElement(By.cssSelector("input.search-box-test")).sendKeys("T-shirts");
	driver.findElement(By.cssSelector(".search-box-test")).sendKeys("T-shirts");
	
	/*tag attribute*/
	driver.findElement(By.cssSelector("input[placeholder='search store']")).sendKeys("T-shirts");
	driver.findElement(By.cssSelector("[placeholder='search store']")).sendKeys("T-shirts");
	 
	/*tag class attribute*/
	driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirts");
	
	
	//for swiping 
/*	driver.findElement(By.cssSelector("input[name=\"search\"]")).sendKeys("Tshirts");
	List<WebElement> swiperButton=driver.findElements(By.cssSelector(".swiper-button-next"));
    swiperButton.get(0);
	WebElement swiper1=driver.findElement(By.cssSelector(".swiper-pager"));
	WebElement nextButton1=swiper1.findElement(By.className("swiper-button-prev"));
	nextButton1.click();
	Thread.sleep(2000);
	WebElement swiper2=driver.findElement(By.cssSelector(".swiper-pager"));
	WebElement nextButton2=swiper1.findElement(By.className("swiper-button-next"));
	nextButton2.click();
*/
	}

}