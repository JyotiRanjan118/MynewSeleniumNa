package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsPopup_02 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> it=handles.iterator();
		
		String parentWindowID=it.next();
		System.out.println("Parent windowID is :"+parentWindowID);		//Parentwindow ID
		
		String childWindowID_03=it.next();
		System.out.println("Child_03 windowID is: "+childWindowID_03);	//Child_03 windowID
		
		driver.switchTo().window(childWindowID_03);
		
		String childwindow_03_title=driver.getTitle();
		System.out.println("Child_03 title is :"+childwindow_03_title);	 //Child_03 windowTitle
		
		driver.close();													 //Close child_03 popup 
		
		driver.switchTo().window(parentWindowID);						//Switch to parent window
		
		driver.findElement(By.linkText("Good PopUp #4")).click();		//Click on POPup_04
		
		Set<String> handles_01=driver.getWindowHandles();
		
		Iterator<String> it_01=handles.iterator();
		
		//Thread.sleep(2000);
		
		String parentwindow01_ID=it_01.next();
		System.out.println("Parent window ID "+parentwindow01_ID);
		
		String childwindowID_04=it_01.next();
		System.out.println("Child_04 windowID is: "+childwindowID_04);	//Child_04 windowID
		
		Thread.sleep(3000);
		driver.switchTo().window(childwindowID_04);						//Switch to childwindowID_04
		
		String childwindows_04_title=driver.getTitle();
		System.out.println("Child_04 title is :"+childwindows_04_title);	//Child_04 title 
		
		Thread.sleep(3000);
		
		driver.close();														//Child_04 close

		driver.switchTo().window(parentwindow01_ID);
		
		String parentWindowTitle=driver.getTitle();
		System.out.println("Parent window title is :"+parentWindowTitle);
		
		//driver.quit();
	}

}
