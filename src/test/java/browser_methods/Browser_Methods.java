package browser_methods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Methods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		         driver.get("https://google.com");
				driver.navigate().to("https://google.com");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				System.out.println("Capture Title: "+driver.getTitle() );
               
				String title=driver.getTitle();
                System.out.println(title);
                
                String url=driver.getCurrentUrl();
                System.out.println(url);
                
                System.out.println("Capture url: "+driver.getCurrentUrl());
                
                String pageSource=driver.getPageSource();
                System.out.println(pageSource);
                
                System.out.println("Capture url: "+driver.getPageSource());
                
                
	}

}
