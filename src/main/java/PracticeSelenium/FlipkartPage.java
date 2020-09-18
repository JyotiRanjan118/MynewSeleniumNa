package PracticeSelenium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartPage {
	WebDriver driver;
	@Test
	public void SearchProduct() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		String url = "https://www.flipkart.com";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		WebElement searchbx = driver.findElement(By.xpath("//input[@name ='q' and @type='text']"));
		
		searchbx.sendKeys("Iphone");
		
		//Clicked on Search button
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		
		//Check if search Results is displayed-VALIDATION 1
		Thread.sleep(4000);
		/*WebElement txtbx_search_result_text = driver.findElement(By.xpath("//span[text()='Showing 1 – 40 of 203 results for \"']"));
		Assert.assertEquals(txtbx_search_result_text.isDisplayed(), true);*/
		
		List<WebElement> list_of_products = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		List<WebElement> list_of_products_price = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
		
		String product_name;
		String product_price;
		int int_product_price;
		
		HashMap<Integer, String> map_final_products = new HashMap<Integer,String>();
		
		for(int i=0;i<list_of_products.size();i++) {
			product_name=list_of_products.get(i).getText();
			product_price = list_of_products_price.get(i).getText();
			product_price=product_price.replaceAll("[^0-9]","");
			
			int_product_price =Integer.parseInt(product_price);
			map_final_products.put(int_product_price, product_name);
		}
		
		System.out.println("Product Name and price fetched from UI and saved in HashMap as: "+map_final_products.toString());
		
		//Get all the keys from Hash Map
		Set<Integer> allkeys=map_final_products.keySet();
		ArrayList<Integer> array_list_values_product_prices=new ArrayList<Integer>(allkeys);
		
		//Sort the Prices in Array List using Collections class
		//this will sort in ascending order lowest at the top and highest at the bottom
		Collections.sort(array_list_values_product_prices);
		
		//Highest Product is
		int high_price=array_list_values_product_prices.get(array_list_values_product_prices.size()-1);
		
		//Low price is
		int low_price=array_list_values_product_prices.get(0);
		
		System.out.println("Low Product Price is: " + low_price + " Product name is: " + map_final_products.get(low_price));
		System.out.println("High Product Price is: " + high_price + " Product name is: " + map_final_products.get(high_price));
		
		
	}
		
}
