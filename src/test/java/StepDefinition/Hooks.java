package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
   
	@Before("@Netbank")
	public void netBanking() {
		
		System.out.println(",,,,,,,,,,,,,,,,,,");
		System.out.println(" get data from Netbanking data base");
	}
	@After
	public void clearData() {
		System.out.println(";;;;;;;;;;;;");
		System.out.println("");
	}
	
	@Before("@Creditbank")
	public void creditBanking() {
		System.out.println("''''''''''''''''''");
		System.out.println("get data from the creditbank data base");
		
	}
	
}
