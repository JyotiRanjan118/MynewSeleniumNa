package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GettextfieldValue {
		
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JyotiRanjanNath\\eclipse-workspace\\Naveen-Tutorial\\SeleniumNaveen\\driverFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("test@gmail.com");
		
		String value=driver.findElement(By.id("login1")).getAttribute("value");
		System.out.println(value);
	}
}
