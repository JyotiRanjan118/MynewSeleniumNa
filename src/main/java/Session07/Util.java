package Session07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util {
		
	WebDriver driver;
	
	public Util(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getElement(By locator) {
		WebElement element=null;
		
		try {
			element=driver.findElement(locator);
		} catch (Exception e) {
			System.out.println("Some exception occured while creating webelement");
			System.out.println(e.getMessage());
		}
		
		return element;
	}
	
	public void doClick(By locator) {
		try {
			getElement(locator).click();
		} catch (Exception e) {
			System.out.println("Some exception occured while creating webelement");
			System.out.println(e.getMessage());
		}
		
	}
	
	public void doSendKeys(By locator,String value) {
		try {
			getElement(locator).sendKeys(value);
		} catch (Exception e) {
			System.out.println("Some exception occured while creating webelement");
			System.out.println(e.getMessage());
		}
		
	}
}
