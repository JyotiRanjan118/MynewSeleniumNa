package Session11;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EspnCricketScore {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/19333/scorecard/1188625/west-indies-vs-india-2nd-odi-india-in-west-indies-2019");
		driver.manage().window().maximize();
		
		ArrayList<String> scorecard=displayScoreCard(driver, "RG Sharma");
		System.out.println(scorecard);
		
		ArrayList<String> scorecard1=displayScoreCard(driver, "S Dhawan");
		System.out.println(scorecard1);
	}
	
	public static ArrayList<String> displayScoreCard(WebDriver driver,String name) {
		List<WebElement> list=driver.findElements(By.xpath("//a[text()='"+name+"']/parent::td/following-sibling::td[@class='text-left']/following-sibling::td"));
		System.out.println(list.size());
		
		System.out.println(name+" scorecard");
		System.out.println("--------------------------");
		ArrayList<String> ar=new ArrayList<String>();
		
		for(int i=0;i<list.size()-1;i++) {
			String socreCard=list.get(i).getText();
			//System.out.println(socreCard);
			ar.add(socreCard);
			
		}
		return ar;
	}
}
