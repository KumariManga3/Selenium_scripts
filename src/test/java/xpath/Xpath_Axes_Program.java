package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Axes_Program {
    static WebDriver driver;
	
        public static void main(String[] args) {
	
    	driver =new ChromeDriver();
	    driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	    driver.manage().window().maximize();
	        
	    //SELF
	    String self=driver.findElement(By.xpath("//div[@class='mbs _52lq _9bp_ fsl fwb fcb']/self::div")).getText();
	    System.out.println("Registration Form:"+self);
	    
	    //CHILD-Find the signup button from the registration form present in the facebook application
	    String child=driver.findElement(By.xpath("//div[@id='reg_form_box']/child::div[11]/button")).getText();
	    System.out.println("child:"+child);
	    //div[@class="_1lch"]/child::button
	    //div[@id='reg_form_box']/child::div[11]/button
	   
	   //PARENT-Locate firstname field from SignUp button in facebook
	   String firstName=driver.findElement(By.xpath("//button[@id='u_0_n_YH']/parent::*/parent::*/child::div[1]/div/div[1]/div")).getText();
	   System.out.println("First Name:"+firstName);
	   //button[@id="u_0_n_Bq"]/parent::div/parent::*/child::div[1]/div/div[1]
	    
	    
	    
	    driver.close();
	}

}
