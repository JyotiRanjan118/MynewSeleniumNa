package Session08C;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		By emailID=By.id("username");
		
		By password=By.id("password");
		By login=By.id("loginBtn");
		getElementWithWait(driver,emailID,10).sendKeys("jrnbabu118@gmail.com");
		driver.findElement(password).sendKeys("jrnBABU@118");
		driver.findElement(login).click();
	}
	
	public static WebElement getElementWithWait(WebDriver driver,By locator,int timeout) {
		WebElement element=null;
		for(int i=0; i<timeout; i++) {
			try {
				element=driver.findElement(locator);
				break;
			} catch (Exception e) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e2) {
					
				}
			}
		}
		return element;
	}

}
