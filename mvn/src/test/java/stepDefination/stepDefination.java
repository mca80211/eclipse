package stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class stepDefination {
	
	@Given("^User is on NetBanking landing page$")
	public void user_is_on_NetBanking_landing_page() throws Throwable {
		
		System.out.println("User Navigated to Net Banking landing Page");
	}
	

	/*@When("^User login into application with username and password$")
	public void user_Login_to_application() throws Throwable {
		
		System.out.println("User logged into application succussfully");
	}*/
	

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		
		System.out.println("User able to see home page");
		
	}
	@When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_username_and_password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User logged into application with username/Password: "+ arg1 + "/"+arg2);
	}

	@Then("^Cards displayed \"([^\"]*)\"$")
	public void cards_displayed(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Were user cards Displayed=" + arg1);
	}

}
