package PracticeSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeSel {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement email=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement loginBtn=driver.findElement(By.id("loginBtn"));
		
		Actions action=new Actions(driver);
		action.sendKeys(email,"jrnbabu118@gmail.com");
		action.sendKeys(password,"jrnBABU@118");
		action.click(loginBtn).build().perform();
		
		String headerValue=driver.findElement(By.xpath("//h1[contains(@class,'private-header')]")).getText();
		System.out.println(headerValue);
		
		
	}
	
}
