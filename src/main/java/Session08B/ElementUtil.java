package Session08B;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	
	WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
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
	
	public void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
		
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
		
	}
	
	//Wait Util
	public void waitForElementPresent(By locator,int timeout) {
		//WebElement element=getElement(locator);
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		//return element;
	}
	
	public void waitForElementToBeVisible(By locator,int timeout) {
		WebElement element=getElement(locator);
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public String waitForTitleToBePresent(String title,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	
	public WebElement waitForvisibilityLocated(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return getElement(locator);
	}
	
	public String waitForUrl(String url,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.urlContains(url));
		return driver.getCurrentUrl();
	}
	
	public void clickWhenReady(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		getElement(locator).click();
	}
	
	public boolean waitForAlertToBePresent(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.alertIsPresent());
		return true;
	}
	
	public List<WebElement> visibilityofAllElements(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		List<WebElement> element=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		return element;
	}
	
	public List<WebElement> visibilityofAllElements(List<WebElement> element,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
		return element;
	}
}
