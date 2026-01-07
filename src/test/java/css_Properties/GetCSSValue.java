package css_Properties;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class GetCSSValue {
		    public static void main(String[] args) {
		        // Set up WebDriver
		    	WebDriver driver=new ChromeDriver();
		        driver.get("https://www.google.com/");
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		        // Locate the element
		        WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div[4]/form/div[1]/div[1]/div[3]/center/input[1]"));

		        // Retrieve CSS properties
		        String color = element.getCssValue("color");
		        String fontSize = element.getCssValue("font-size");
		        String backgroundColor = element.getCssValue("background-color");

		        // Print the values
		        System.out.println("Color: " + color);
		        System.out.println("Font Size: " + fontSize);
		        System.out.println("Background Color: " + backgroundColor);
                
		        FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		        // Close the browser
		        driver.quit();
		    }
		

	}


