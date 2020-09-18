package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureTextField {
		
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://register.rediff.com/commonreg/index.php");
		
		List<WebElement> listInput=driver.findElements(By.xpath("//input[@type='text']"));
		
		System.out.println(listInput.size());
		
		for(int i=0;i<listInput.size();i++) {
			listInput.get(i).sendKeys("Naveen");
			
		}
	}
}
