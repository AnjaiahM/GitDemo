package StepDefinition;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_Step {
	@Given("User is on Net bank login page")
	public void user_is_on_net_bank_login_page() {
	    System.out.println("User is landing on login page");
	}
//	@When("User enter username {string} and password {string}")
//	public void user_enter_user_name_and_password(String un,String pwd) {
//	    System.out.println("User enter credentials ::");
//	    System.out.println("User name "+un);
//	    System.out.println("password "+pwd);
//	}
	
	//data driven
	@When("^User enter username (.+) and password (.+)$")
	public void user_enter_user_name_and_password(String un,String pwd) {
	    System.out.println("User enter credentials ::");
	    System.out.println("User name "+un);
	    System.out.println("password "+pwd);
	}
	@Then("User uccessfully navigate to the home page")
	public void user_uccessfully_navigate_to_the_home_page() {
	    System.out.println("User langin on Home Page");
	}
	
	
	//parameterization
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
	    System.out.println("User opens registration page");
	}
	@When("User enter details in regisyration page")
	public void user_enter_details_in_regisyration_page(List<Object> o) {
	    System.out.println(o.get(0));
	    System.out.println(o.get(1));
	    System.out.println(o.get(2));
	    System.out.println(o.get(3));
	    System.out.println(o.get(4));
	    System.out.println(o.get(5));
	}
	@Then("User successfully registered")
	public void user_successfully_registered() {
	    System.out.println("User successfully registered with given details");
	}
	
	@Then("Set the entries from the data base")
	public void getEntries() {
		System.out.println(".................");
		System.out.println("User get the entries");
	}
	@When("User enter launches browser from config file")
	public void launchBrowser() {
		System.out.println("user launch browser");
		//Assert.assertTrue(false);
	}
	@When("user get the URL")
	public void getUrl() {
		System.out.println("user opens URL");
	}
}
