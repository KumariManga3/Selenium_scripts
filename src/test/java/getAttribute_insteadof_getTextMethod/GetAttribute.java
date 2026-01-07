package getAttribute_insteadof_getTextMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
     static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php?utm_source=chatgpt.com");
	    driver.manage().window().maximize();
	    //By using "innerText"
	    WebElement formName=driver.findElement(By.xpath("//h1[text()='Selenium - Automation Practice Form']"));
	    String message=formName.getAttribute("innerText");
	    System.out.println(message);
	    
	    //By using "textContent"
	    WebElement formName1=driver.findElement(By.xpath("//h1[text()='Selenium - Automation Practice Form']"));
	    String message1=formName.getAttribute("textContent");
	    System.out.println(message1);
	   
	    
	    //By using JavaScriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String text = (String) js.executeScript(
        	    "return document.evaluate(\"//h1[text()='Selenium - Automation Practice Form']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.textContent;"
        	);
        System.out.println(text);
  
        driver.quit();

	}
	

}
