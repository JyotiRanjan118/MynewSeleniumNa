package Session08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Util08 {
		
	WebDriver driver;
	
	public Util08(WebDriver driver) {
		this.driver=driver;
	}
	
	public void intiateBrowser(String broswer) {
		if(broswer.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if (broswer.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
	}
	
	public String enterUrl(String Url) {
		driver.get(Url);
		return Url; 
	}
	
	
	public WebElement getWebElement(By locator) {
		WebElement element=driver.findElement(locator);
		return element;
	}
}
