package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithOutSelect extends DropDownUtil {
		
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String day="//select[@id='day']/option";
		String month="//select[@id='month']/option";
		String year="//select[@id='year']/option";
		
		
		DropDownUtil.selectDropDownValueWithoutSelect(driver, day, "3");
		DropDownUtil.selectDropDownValueWithoutSelect(driver, month, "Oct");
		DropDownUtil.selectDropDownValueWithoutSelect(driver, year, "2013");
		
	}
}
