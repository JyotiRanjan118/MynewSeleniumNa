package Frames;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ArrayListOptionSelect {
		
	public static ArrayList<String> listOfRightClickFunction(WebDriver driver,String text,List<WebElement> optionList) {
		
		ArrayList<String> ar=new ArrayList<String>();
		System.out.println(optionList.size());
		
		for(int i=0;i<optionList.size();i++) {
			String names=optionList.get(i).getText();
			ar.add(names);
			
		}
		System.out.println(ar);
		
		ArrayList<String> ar1=new ArrayList<String>();
		for(int i=0;i<optionList.size();i++) {
			String textfunction=optionList.get(i).getText();
			ar1.add(textfunction);
				
			if(text.equals(textfunction)) {
				optionList.get(i).click();
				
				break;
			}
		}
		//ar1.retainAll(ar);
		return ar1;
		
	}
}
