package htmlUnitDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Html_Unit_Driver {

	public static void main(String[] args) 
	{
	    WebDriver driver= new ChromeDriver();
		//WebDriver driver=new  HtmlUnitDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("The url of the website: "+driver.getCurrentUrl());
		//System.out.println("The Page Source: "+driver.getPageSource());
		System.out.println("Title : "+driver.getTitle());
		
		driver.findElement(By.cssSelector(".gLFyf")).sendKeys("country");
	}

}

   //   #APjFqb     //*[@id="APjFqb"]