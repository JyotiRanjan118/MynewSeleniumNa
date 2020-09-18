package TestNGSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import okhttp3.internal.http2.Header;

public class LoginPageTest {
		
	WebDriver driver;
	SoftAssert softAssert;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
		softAssert=new SoftAssert();
	}
	
	@Test(priority=1)
	public void loginPageTest() {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("HubSpot"));
		String title=driver.getTitle();
		System.out.println("page title is: "+title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority=2)
	public void signUpLinkTest() {
		boolean flag=driver.findElement(By.linkText("Sign up")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() {
		driver.findElement(By.id("username")).sendKeys("jrnbabu118@gmail.com");
		driver.findElement(By.id("password")).sendKeys("jrnBABU@118");
		driver.findElement(By.id("loginBtn")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("private-header__title")));
		softAssert.assertTrue(driver.findElement(By.className("private-header__title")).isDisplayed());
		
		String header=driver.findElement(By.className("private-header__title")).getText();
		System.out.println("home page header is: "+header);
		softAssert.assertEquals(header, "Setup Guide","header text is not matched");		//Will pass the TC even wrong validation
		
		String title=driver.getTitle();
		System.out.println("home page title is: "+title);
		softAssert.assertEquals(title, "Account Setup | HubSpot");
		
		softAssert.assertAll();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
