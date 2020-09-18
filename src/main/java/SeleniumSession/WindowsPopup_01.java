package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsPopup_01 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		driver.findElement(By.linkText("Good PopUp #4")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> it=handles.iterator();
		
		String parentWindowID=it.next();
		System.out.println("Parent windowID is :"+parentWindowID);
		
		String childWindowID_03=it.next();
		System.out.println("Child_03 windowID is: "+childWindowID_03);
		
		String childWindowID_04=it.next();
		System.out.println("Child_04 windowID is: "+childWindowID_04);
		
		driver.switchTo().window(childWindowID_03);
		
		String childwindow_03_title=driver.getTitle();
		System.out.println("Child_03 title is :"+childwindow_03_title);		//child_03 title
		
		driver.close(); 							//closing of childwindow_03
		
		driver.switchTo().window(childWindowID_04);							//Switch to child_04
		
		String childwindows_04_title=driver.getTitle();
		System.out.println("Child_04 title is :"+childwindows_04_title);	//child_04 title
		
		driver.close();								//closing of childwindow_04
		
		driver.switchTo().window(parentWindowID);
		
		String parentWindowTitle=driver.getTitle();
		System.out.println("Parent window title is :"+parentWindowTitle);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}
}
