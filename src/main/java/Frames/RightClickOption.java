package Frames;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickOption {
	
	public static void main(String[] args) {
		
		BrowserSetUP.setUpBrowser("chrome", "http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebDriver driver=BrowserSetUP.driver;
		
		WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action=new Actions(driver);
		
		action.contextClick(rightClickMe).build().perform();
		
		List<WebElement> functionlist=driver.findElements(By.xpath("//ul/li[contains(@class,'context-menu-icon')]"));
		
		ArrayList<String> optionList=ArrayListOptionSelect.listOfRightClickFunction(driver, "Copy", functionlist);
		System.out.println("Size of the option list: "+optionList.size());
		System.out.println(optionList);
	}
}
