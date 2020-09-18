package Session08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilWebElement extends Util08{
	
	public UtilWebElement(WebDriver driver) {
		super(driver);
		
	}

	public WebElement getWebElement(By locator) {
		WebElement element=driver.findElement(locator);
		return element;
	}
	
	public void doSendKeys(By locator,String value) {
		getWebElement(locator).sendKeys(value);
	}
	
	public void doClick(By locator) {
		getWebElement(locator).click();
	}
	
	public void waitForElement(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public String waitForTitlePresent(String title,int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
		
	}
	
}
