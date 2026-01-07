package webTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	driver= new ChromeDriver();
	driver.get("https://practice.expandtesting.com/dynamic-table");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
 /* for printing entire table  
  * WebElement table=driver.findElement(By.className("table-responsive"));
    List<WebElement> rows=table.findElements(By.tagName("tr"));
    for(int i=0;i<rows.size();i++)
    {
     
     System.out.println(rows.get(i).getText());
    }*/
    
    //for printing particular columns
    WebElement table=driver.findElement(By.className("table-responsive"));
    List<WebElement> rows=table.findElements(By.tagName("tr"));
    for(int i=1;i<rows.size();i++)
    {
     List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
     String name=cols.get(0).getText();
     String network=cols.get(4).getText();
     if(name.equalsIgnoreCase("chrome"))
     {
    	 System.out.println("Network:"+network);
     }
	}
    /*for(int j=0;j<cols.size();j++)
    {
   	 System.out.println(cols.get(0).getText());
   	/* if(j==0||j==1)
   	 {
   		 System.out.println(cols.get(j).getText()+"\t");
   	 }*/

     //}*/
    driver.quit();
}}
