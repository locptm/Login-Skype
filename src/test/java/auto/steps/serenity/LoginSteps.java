package auto.steps.serenity;

import auto.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	LoginPage loginPage;

	@Step
	public void open_login_page() {
		loginPage.open();
	}
	@Step
	public void enter_valid_name_invalid_pass(String email, String pass) {
		loginPage.enter_valid_name_invalid_pass(email, pass);
	}
	@Step
	public void click() {
		loginPage.click();
	}
	@Step
	public String getMsg() {
		return loginPage.getMsg();
	}
	@Step
	public void enter_invalid_name_valid_pass(String email, String pass) {
		loginPage.enter_invalid_name_valid_pass(email, pass);
	}
	@Step
	public void enter_valid_name_valid_pass(String email, String pass) {
		loginPage.enter_valid_name_valid_pass(email, pass);
	}
	@Step
	public String getTitle() {
		return loginPage.getTitle();
	}

}
