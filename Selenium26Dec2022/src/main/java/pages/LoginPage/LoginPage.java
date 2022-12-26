package pages.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;

	@FindBy(css = "input#user-name")
	private WebElement username;

	@FindBy(css = "input#password")
	private WebElement password;

	@FindBy(css = "input[name='login-button']")
	private WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return this.username;
	}

	public WebElement getPassword() {
		return this.password;
	}

	public WebElement getLoginBtn() {
		return this.loginBtn;
	}

}
