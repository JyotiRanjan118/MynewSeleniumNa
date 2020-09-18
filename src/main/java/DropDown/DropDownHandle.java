package DropDown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {
		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			WebElement day=driver.findElement(By.id("day"));
			WebElement month=driver.findElement(By.id("month"));
			WebElement year=driver.findElement(By.id("year"));
			
			/*Select select=new Select(day);
			select.selectByVisibleText("10");
			
			Select select1=new Select(month);
			select1.selectByVisibleText("May");
			
			Select select2=new Select(year);
			select2.selectByVisibleText("1992");*/
			
			/*selectValueFromDropdownByText(day, "10");
			selectValueFromDropdownByText(month, "Oct");
			selectValueFromDropdownByText(year, "1992");*/
			
			selectValuefromDropdownByIndex(day,10);
			selectValuefromDropdownByIndex(month, 10);
			selectValuefromDropdownByIndex(year, 9);
			
			getDropDownValues(day);
			getDropDownValues(month);
			getDropDownValues(year);
			
			
		}
		
		/**
		 * This method is used to select the value from dropdown on the basis of given text
		 * @param element
		 * @param value
		 */
		
		public static void selectValueFromDropdownByText(WebElement element,String value) {
			Select select=new Select(element);
			select.selectByVisibleText(value);
			
		}
		
		/**
		 * This method is used to select the value from dropdown on the basis of given index
		 * @param element
		 * @param index
		 */
		
		public static void selectValuefromDropdownByIndex(WebElement element,int index) {
			Select select=new Select(element);
			select.selectByIndex(index);
		}
		
		public static ArrayList<String> getDropDownValues(WebElement element) {
			System.out.println("--------------------------------------");
			Select select=new Select(element);
			
			List<WebElement> dropList=select.getOptions();
			
			System.out.println("Total no of values in the dropdown :"+dropList.size());
			ArrayList<String> ar=new ArrayList<String>();
			
			
			for(int i=0;i<dropList.size();i++) {
				String text=dropList.get(i).getText();
				ar.add(text);
				
				
			}
			return ar;
		}
}
