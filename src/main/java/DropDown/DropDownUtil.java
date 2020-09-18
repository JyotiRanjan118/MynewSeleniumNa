package DropDown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownUtil {
	
	public static void faceBookStart() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	}
		
	/**
	 * This method is used to select the value from dropdown on the basis of given text
	 * @param element
	 * @param value
	 */
	
	public static void selectValueFromDropdownByText(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByVisibleText(value);
		
	}
	
	/**
	 * This method is used to select the value from dropdown on the basis of given index
	 * @param element
	 * @param index
	 */
	
	public static void selectValuefromDropdownByIndex(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public static ArrayList<String> getDropDownValues(WebElement element) {
		System.out.println("--------------------------------------");
		Select select=new Select(element);
		
		List<WebElement> dropList=select.getOptions();
		
		System.out.println("Total no of values in the dropdown :"+dropList.size());
		ArrayList<String> ar=new ArrayList<String>();
		
		
		for(int i=0;i<dropList.size();i++) {
			String text=dropList.get(i).getText();
			ar.add(text);
			
			
		}
		return ar;
	}
	
	/**
	 * This method is used to click values from dropdown without select class 
	 * @param driver
	 * @param locator
	 * @param value
	 */
	
	public static void selectDropDownValueWithoutSelect(WebDriver driver,String locator,String value) {
		List<WebElement> dropList=driver.findElements(By.xpath(locator));
		
		System.out.println(dropList.size());
		
		
		for(int i=0;i<dropList.size();i++) {
			String text=dropList.get(i).getText();
			System.out.println(text);
			
			if(text.equals(value)) {
				dropList.get(i).click();
				break;
			}
		}
	}
}
