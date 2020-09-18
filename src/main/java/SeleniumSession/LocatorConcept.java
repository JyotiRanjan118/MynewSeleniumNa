package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JyotiRanjanNath\\eclipse-workspace\\Naveen-Tutorial\\SeleniumNaveen\\driverFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//jrnBABU@118
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		/*WebElement email=driver.findElement(By.id("username"));
		email.sendKeys("jrnbabu118@gmail.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("jrnBABU@118");*/
		
		//2.name
		//driver.findElement(By.name("email")).sendKeys("jrnbabu118@gmail.com");
		
		//3.Xpath
		/*driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jrnbabu118@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("jrnBABU@118");*/
		
		//4. Css selector
		/*driver.findElement(By.cssSelector("#username")).sendKeys("jrnbabu118@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("jrnBABU@118");
		*/
		//5. class name
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("jrnbabu118@gmail.com");		//
		//driver.findElement(By.className("form-control private-form__control login-password m-bottom-3")).sendKeys("jrnBABU@118");
		
		driver.findElement(By.className("login-email")).sendKeys("jrnbabu118@gmail.com");
		driver.findElement(By.className("login-password")).sendKeys("jrnBABU@118");
		
		//6.link text: only used for links
		driver.findElement(By.linkText("Sign up")).click();
		
		//7 .partiallinktext
		driver.findElement(By.partialLinkText("Sign")).click();
		
		//driver.findElement(By.id("loginBtn")).click();
		
		
	}
}
