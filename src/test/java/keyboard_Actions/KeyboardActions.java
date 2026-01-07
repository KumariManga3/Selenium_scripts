package keyboard_Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("text1")).sendKeys("Hi Kumari manga welcome........");
		
		//Actions act= new Actions(driver);
		
		Robot r= new Robot();

			// Press and hold Ctrl
			r.keyPress(KeyEvent.VK_CONTROL);

			// Press C
			r.keyPress(KeyEvent.VK_C);

			// Release C
			r.keyRelease(KeyEvent.VK_C);

			// Release Ctrl
			r.keyRelease(KeyEvent.VK_CONTROL);

		
//		//ctrl+A - select the text
//		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
//		
//		//ctrl+C - copy the text in to clipboard
//		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
//		
//		//TAB - shift to 2nd box
//		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
//		
//		//ctrl+V - paste the text
//		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

	}

}
