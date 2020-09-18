package Session10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//htmltag[@prop1='value']			//Syntax
		//input[@id='username']
		
		//htmltag[@prop1='value' and @prop2='value']		//Syntax
		//input[@id='username' and @type='email']	
		
		//input[@class='form-control private-form__control login-email']]
		
		//contains in xpath
		//.........................
		//htmltag[contains(@prop,'value')]							//Syntax
		
		//input[contains(@class,'login-email')]
		//input[contains(@id,'username')]
		//input[@id='username' and contains(@class,'login-email')]
		//input[@id='username' and contains(@class,'')]
		
		
		//contains used for dynamic id
	//  <input id='test_123'>
	//  <input id='test_232'>
	//  <input id='test_143'>
	//  <input id='test_153'>
		
	//	//input[contains(@class,'form-control')][1]	
	//	//input[contains(@class,'form-control')][2]
		
	//	(//input[contains(@class,'form-control')])[position()=1]
	//	(//input[contains(@class,'form-control')])[position()=2]
		
	//	(//input[contains(@class,'form-control')])[last()]				last element
		
	//	(//i18n-string)[1]												text field
		
		//text() in xpath:
		
	//	//h5[text()="That email address doesn't exist."]                The error text message
	
		
		//span[contains(text(),'Show Password')]
		
	//	//span[contains(text(),'Show Password')]
		
		
		//Starts-with
		//span[starts-with(@class,'account')]
		
		
		Thread.sleep(5000);
		
		WebElement email=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement loginBtn=driver.findElement(By.id("loginBtn"));
		
		Actions action=new Actions(driver);
		action.sendKeys(email, "jrnbabu118@gmail.com");
		action.sendKeys(password, "jrnBABU@118");
		action.click(loginBtn).build().perform();
		
		String headerValue=driver.findElement(By.xpath("//h1[contains(@class,'private-header')]")).getText();
		System.out.println(headerValue);
		System.out.println(driver.findElement(By.xpath("//i18n-string[text()='Thanks for choosing HubSpot']")).isDisplayed());
		
		
		//span[starts-with(@class,'account')]
		
	//	//div/input   ---Immediate child = 2
		
	//	//div//input ---indirect child = 3
		
		
		
				
		
		
		
		
		
		
		
	}

}
