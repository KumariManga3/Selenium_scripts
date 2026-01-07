package broken_links;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links {
    public static void main(String [] args) {
    	WebDriver driver = new ChromeDriver ();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("http://www.deadlinkcity.com/");
    	driver.manage().window().maximize();
    	
    	List<WebElement>links=driver.findElements(By.tagName("a"));
    	System.out.println("Total number of links:"+links.size());
    	
    	int noOfBrokenLinks=0;
    	
    	for(WebElement linkElement:links)
    	{
    		String hrefattvalue=linkElement.getAttribute("href");
    		if(hrefattvalue==null || hrefattvalue.isEmpty())
    		{
    			System.out.println("href attribute value is null or empty.so not possible to check");
    			continue;
    		}
    		try
    		{
//    			URL url=new URL(hrefattvalue);
//    			URLConnection urlconnection=url.openConnection();
//    			HttpURLConnection con=(HttpURLConnection)urlconnection;
//    			
    			URL linkURL=new URL(hrefattvalue);
    			HttpURLConnection con=(HttpURLConnection)linkURL.openConnection();
    			con.connect();
    			if(con.getResponseCode()>=400)
    			{
    				System.out.println(hrefattvalue+"===> Broken link");
    				noOfBrokenLinks++;
    			}
    			else
    			{
    				System.out.println(hrefattvalue+"______Not a Broken link_____");
    			}
    		}
    		catch(Exception e)
    		{
    			
    		}
    	}
    	System.out.println("Number of broken links:"+noOfBrokenLinks);
    	
    	driver.quit();
    }
}
