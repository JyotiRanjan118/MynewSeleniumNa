package TestNGSession;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class InvocationCountConcept {
		
	
	@Test(invocationCount=2)
	public void CreateUser() {
		System.out.println("Create user test...");
	}
}	
