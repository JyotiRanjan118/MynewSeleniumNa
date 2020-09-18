package Session07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPAge {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		By emailID=By.id("username");
		By password	=By.id("password");
		By loginbtn=By.id("loginBtn");
		
		Util util=new Util(driver);
		
		util.doSendKeys(emailID,"jrnbabu118@gmail.com");
		util.doSendKeys(password, "jrnBABU@119");			//Correct(jrnBABU@118)
		util.doClick(loginbtn);
	}
	
}
