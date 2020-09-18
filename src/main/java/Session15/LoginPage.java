package Session15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://classic.crmpro.com/");
			
			By email=By.name("username");
			
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(email));
			
			WebElement username=driver.findElement(email);
			WebElement pwd=driver.findElement(By.name("password"));
			//WebElement loginBtn=driver.findElement(By.id("loginBtn"));
			
			Xlsutil reader=new Xlsutil("./ExcelFolder/LoginExcel.xlsx");
			String sheetname="loginHubspot";
			
			int rowCount=reader.getRowCount(sheetname);
			
			for(int rowNum=2;rowNum<=rowCount;rowNum++) {
				String loginID=reader.getCellData(sheetname,"username", rowNum);
				String password=reader.getCellData(sheetname, "password", rowNum);
				
				System.out.println(loginID+"  "+password);
				
				username.clear();
				username.sendKeys(loginID);
				pwd.clear();
				pwd.sendKeys(password);
				
			}
		}
}
