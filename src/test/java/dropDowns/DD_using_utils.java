package dropDowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.Reusability_Methods;

public class DD_using_utils {
WebDriver driver;
	    @Test
	    public void verifyCountryOptionInDropdown() {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        // Step 1: Go to a page with a <select> dropdown
	        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

	        // Step 2: Locate the <select> element
	        WebElement dropdown = driver.findElement(By.xpath("//select[@class=\"form-select\"]"));
	   
	       
	        // Step 3: Use your reusable method to check if "Two" exists
	        boolean isTwoVisible = Reusability_Methods.isOptionVisible(dropdown, "Two");

	        if (isTwoVisible) {
	            System.out.println("✅ Option 'Two' is visible in the dropdown!");
	        } else {
	            System.out.println("❌ Option 'Two' is NOT visible in the dropdown!");
	        }
           
	        // Step 4: Assert to validate test
	        Assert.assertTrue(isTwoVisible, "'Two' should be present in the dropdown");
	        
	        System.out.println("________________________________________________________");
	        WebElement datalistDropdown = driver.findElement(By.id("my-options"));
	        boolean isSeattleVisible = Reusability_Methods.isValueVisibleInDatalist(datalistDropdown, "seattle");

	        if (isSeattleVisible) {
	            System.out.println("✅ Option 'seattle' is visible in the dropdown!");
	        } else {
	            System.out.println("❌ Option 'seattle' is NOT visible in the dropdown!");
	        }

	        // Step 4: Assert to validate test
	        Assert.assertTrue(isSeattleVisible, "'seattle' should be present in the dropdown");

	        driver.quit();
	    }
	}


