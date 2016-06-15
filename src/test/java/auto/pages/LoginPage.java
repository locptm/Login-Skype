package auto.pages;

import org.mockito.internal.matchers.Find;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://login.skype.com/")
public class LoginPage extends PageObject{

	@FindBy(id="username")
	WebElement skypeFeild;
	
	@FindBy(id="password")
	WebElement passFeild;
	
	@FindBy(id="signIn")
	WebElement signBtn;
	
	@FindBy(css="div.messageBox.message_error > span")
	WebElement msg;
	
	
	public void enter_valid_name_invalid_pass(String email, String pass) {
		skypeFeild.sendKeys(email);
		passFeild.sendKeys(pass);
	}


	public void click() {
		signBtn.click();
	}


	public String getMsg() {
		return msg.getText();
	}


	public void enter_invalid_name_valid_pass(String email, String pass) {
		skypeFeild.sendKeys(email);
		passFeild.sendKeys(pass);
	}


	public void enter_valid_name_valid_pass(String email, String pass) {
		skypeFeild.sendKeys(email);
		passFeild.sendKeys(pass);
	}

}
