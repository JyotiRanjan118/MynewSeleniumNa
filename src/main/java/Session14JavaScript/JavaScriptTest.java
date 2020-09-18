package Session14JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		//JavaScriptUtil.generalAlert(driver, "this is my code");
		
		System.out.println(JavaScriptUtil.getTitleByJs(driver));
		
		WebElement loginform=driver.findElement(By.id("hs-login"));
		
		JavaScriptUtil.drawBorder(loginform, driver);
		
		WebElement email=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement loginBtn=driver.findElement(By.id("loginBtn"));
		JavaScriptUtil.flash(email, driver);
		JavaScriptUtil.flash(password, driver);
		JavaScriptUtil.flash(loginBtn, driver);
		
		System.out.println(JavaScriptUtil.getPageInnerText(driver));
	}

}
