package DropDown;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTest {
		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			WebElement day=driver.findElement(By.id("day"));
			WebElement month=driver.findElement(By.id("month"));
			WebElement year=driver.findElement(By.id("year"));
			
			
			Select select=new Select(day);
			System.out.println(select.isMultiple());
			
			DropDownUtil.selectValueFromDropdownByText(day, "10");
			DropDownUtil.selectValueFromDropdownByText(month, "Oct");
			DropDownUtil.selectValueFromDropdownByText(year, "1992");
			
			ArrayList<String> days=DropDownUtil.getDropDownValues(day);
			System.out.println(days);
			
			ArrayList<String> months=DropDownUtil.getDropDownValues(month);
			System.out.println(months);
			
			
			
			
			
			
		}
}
