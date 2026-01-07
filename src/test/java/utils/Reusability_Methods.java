package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Reusability_Methods {
        //this is for select tag name
	    public static boolean isOptionVisible(WebElement selectElement, String optionText) {
	        Select select = new Select(selectElement);
	        List<WebElement> options = select.getOptions();
	        for (WebElement opt : options) {
	            if (opt.getText().trim().equalsIgnoreCase(optionText.trim())) {
	                return true;
	            }
	        }
	        return false;
	    }

	  
	    public static void selectByVisibleText(WebElement selectElement, String optionText) {
	    	 Select select = new Select(selectElement);
		        select.selectByVisibleText(optionText);
		        System.out.println("Selected option index: " + optionText);
	    }

	    
	    public static void selectByValue(WebElement selectElement, String value) {
	    	 Select select = new Select(selectElement);
		        select.selectByValue(value);
		        System.out.println("Selected option index: " + value);
	    }

	   
	    public static void selectByIndex(WebElement selectElement, int index) {
	        Select select = new Select(selectElement);
	        select.selectByIndex(index);
	        System.out.println("Selected option index: " + index);
	    }
	    //this is for data list tag name
	    public static boolean isValueVisibleInDatalist(WebElement datalistElement, String valueText) {
	        List<WebElement> options = datalistElement.findElements(By.tagName("option"));
	        for (WebElement opt : options) {
	            String val = opt.getAttribute("value").trim();
	            if (val.equalsIgnoreCase(valueText.trim())) {
	                
	                return true;
	            }
	        }
	 
	        return false;
	    }

	}


