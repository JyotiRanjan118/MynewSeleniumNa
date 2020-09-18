package Session08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hubSpotLoginPage {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		UtilWebElement util=new UtilWebElement(driver);
		
		String title=util.waitForTitlePresent("HubSpot", 10);
		System.out.println(title);
		
		By emailID=By.id("username");
		By password	=By.id("password");
		By loginbtn=By.id("loginBtn");
		
		util.waitForElement(emailID,20);
		
		WebElement email=driver.findElement(emailID);
		email.sendKeys("jrnbabu118@gmail.com");
		
		WebElement passwrd=driver.findElement(password);
		WebElement loginBtn=driver.findElement(loginbtn);
		
		passwrd.sendKeys("jrnBABU@118");
		loginBtn.click();
		
		
		
		
		
		
	}
	
}
