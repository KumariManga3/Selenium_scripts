package assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assert_Title {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(driver.getTitle());
        //assert the title
        String expectedTitle=driver.getTitle();
        String actualTitle="GeeksforGeeks | Your All-in-One Learning Portal";
        //1
        Assert.assertEquals(actualTitle, expectedTitle);
        
        //2
        if(actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title Matched");
        } else {
            System.out.println("Title didn't match");
        }
        
        driver.quit();
	}

}
