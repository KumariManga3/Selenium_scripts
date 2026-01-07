package broken_images;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Images {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		
      verifyBrokenImagesUsingSelenium();
	}
	
	public static void verifyBrokenImagesUsingSelenium() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.theworldsworstwebsiteever.com/");
		Thread.sleep(2000);
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		for(WebElement image:images)
		{
			String imagesrc=image.getAttribute("src");
			try 
			{
				URL url=new URL(imagesrc);
				URLConnection urlconnection=url.openConnection();
				HttpURLConnection httpurlconnection=(HttpURLConnection)urlconnection;
				httpurlconnection.connect();
				
				if(httpurlconnection.getResponseCode()==200)
				{
					System.out.println(imagesrc+"---"+httpurlconnection.getResponseCode()+"---"+httpurlconnection.getResponseMessage());
				}
				else
				{
					System.out.println(imagesrc+"---"+httpurlconnection.getResponseCode()+"---"+httpurlconnection.getResponseMessage());
				}
				httpurlconnection.disconnect();
			}
			catch(Exception e)
			{
				System.out.println(imagesrc);
			}
		}
		driver.quit();
	}
    
}
