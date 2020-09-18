package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JyotiRanjanNath\\eclipse-workspace\\Naveen-Tutorial\\SeleniumNaveen\\driverFiles\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.co.in/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		//Validation point
		if (title.equals("Google")) {
			 System.out.println("Correct Title");
		} else {
			System.out.println("Incorrect title");
		}
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		//driver.quit();
		driver.close();
		
		System.out.println(driver.getTitle());
		
		
		
	}
}
