package SeleniumNaveenCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(); //launch chrome
		driver.get("http://www.google.com"); //launch url
		
		driver.navigate().to("https://www.rediff.com/");
		
		String title = driver.getTitle();//get the page title
		System.out.println("page title is : " + title);
		
		
		
		
		
	}

}
