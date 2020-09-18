package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorText {
		
		public static void main(String[] args) throws InterruptedException {
			
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\JyotiRanjanNath\\eclipse-workspace\\Naveen-Tutorial\\SeleniumNaveen\\driverFiles\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://app.hubspot.com/login");
			//driver.get("https://jn286f:jrnBABU@175@app.hubspot.com/login");
			Thread.sleep(5000);
			/*driver.switchTo().alert().sendKeys("jn286f" + Keys.TAB + "jrnBABU@175");
			driver.switchTo().alert().accept();*/
			
		
			
			driver.findElement(By.id("username")).sendKeys("test@gmail.com");
			driver.findElement(By.id("password")).sendKeys("test@gmail.com");
			
			driver.findElement(By.id("loginBtn")).click();
			
			Thread.sleep(3000);
			
			String errorText=driver.findElement(By.className("private-alert__title")).getText();
			System.out.println(errorText);
			
			
		}
}
