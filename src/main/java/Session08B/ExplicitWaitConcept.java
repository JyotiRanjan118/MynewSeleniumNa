package Session08B;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		ElementUtil util=new ElementUtil(driver);
		
		driver.get("https://app.hubspot.com/login");
		
		By signUp=By.linkText("Sign up");
		util.clickWhenReady(signUp, 6);
		
		/*String title=util.waitForTitleToBePresent("Login", 10);
		System.out.println(title);
		
		By username=By.id("username");
		By password=By.id("password");
		By login=By.id("loginBtn");
		
		util.waitForElementPresent(username, 10);
		
		util.doSendKeys(username, "jrnbabu118@gmail.com");
		util.doSendKeys(password, "jrnBABU@118");
		//util.doClick(login);
*/		

	}

}
