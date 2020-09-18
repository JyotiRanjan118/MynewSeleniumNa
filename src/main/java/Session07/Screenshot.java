package Session07;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		takePageScreenshot(driver, "loginPage");
		
		WebElement email=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement loginBtn=driver.findElement(By.id("loginBtn"));
		
		email.sendKeys("jrnbabu118@gmail.com");
		password.sendKeys("jrnBABU@119");				//incorrect password
		loginBtn.click();
		
		takeElementScreenshot(email, "emailID");
		takeElementScreenshot(password, "password");
		//takeElementScreenshot(loginBtn, "loginBtn");
		
		takePageScreenshot(driver,"loginPageError");
		
		driver.quit();
		
	}
	
	
	public static void takePageScreenshot(WebDriver driver,String Filename) {
		
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./Screenshot/"+Filename+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void takeElementScreenshot(WebElement element,String Filename) {
		File srcFile=((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./Screenshot/"+Filename+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
