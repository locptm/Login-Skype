package auto;

import auto.steps.serenity.LoginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import net.thucydides.core.annotations.Steps;

public class LoginSkypeSenario {
	
	@Steps 
	LoginSteps loginSteps;
	
	@Given("^user go to page https://login\\.skype\\.com/login$")
	public void user_go_to_page_https_login_skype_com_login() throws Throwable {
	 loginSteps.open_login_page();
	}

	@Given("^enter valid skype name is \"([^\"]*)\" and invalid password is \"([^\"]*)\"$")
	public void enter_valid_skype_name_is_and_invalid_password_is(String email, String pass) throws Throwable {
	   loginSteps.enter_valid_name_invalid_pass(email,pass);
	}

	@When("^user click Signin button$")
	public void user_click_Signin_button() throws Throwable {
	    loginSteps.click();
	}

	@Then("^page show message \"([^\"]*)\"$")
	public void page_show_message(String exp) throws Throwable {
	    Assert.assertEquals(loginSteps.getMsg(), exp);
	}

	@Given("^enter invalid skype name is \"([^\"]*)\" and valid password is \"([^\"]*)\"$")
	public void enter_invalid_skype_name_is_and_valid_password_is(String email, String pass) throws Throwable {
	   loginSteps.enter_invalid_name_valid_pass(email,pass);
	}

	@Given("^enter valid skype name is \"([^\"]*)\" and valid password is \"([^\"]*)\"$")
	public void enter_valid_skype_name_is_and_valid_password_is(String email, String pass) throws Throwable {
		loginSteps.enter_valid_name_valid_pass(email,pass);
	}

	@Then("^page direct to home page with title is \"([^\"]*)\"$")
	public void page_direct_to_home_page_with_title_is(String title) throws Throwable {
		Assert.assertEquals(loginSteps.getTitle(), title);
	}

}
