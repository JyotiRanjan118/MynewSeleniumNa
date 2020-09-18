package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadpopUp {
		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
			
			driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\JyotiRanjanNath\\Pictures\\Screenshots\\ILC SS.png");
			
			
		}
}
