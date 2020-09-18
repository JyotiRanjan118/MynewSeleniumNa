package Session11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");

		Thread.sleep(5000);
		
		WebElement email=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement loginBtn=driver.findElement(By.id("loginBtn"));
		
		Actions action=new Actions(driver);
		action.sendKeys(email, "jrnbabu118@gmail.com");
		action.sendKeys(password, "jrnBABU@118");
		action.click(loginBtn).build().perform();
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://app.hubspot.com/contacts/7909928/contacts/list/view/all/");
		
		selectContact(driver, "Dibya Nath");
		selectContact(driver, "Jyoti Nath");
		
	}
	
	public static void selectContact(WebDriver driver,String contactName) {
		By locator=By.xpath("//span[text()='"+contactName+"']/ancestor::td/preceding-sibling::td/descendant::span[@class='private-checkbox__inner']");
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		
		driver.findElement(locator).click();
		
	}
	
	

}
