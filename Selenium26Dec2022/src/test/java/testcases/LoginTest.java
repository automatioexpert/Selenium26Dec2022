package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import base.TestBase;
import pages.LoginPage.LoginPage;

public class LoginTest extends TestBase {

	public LoginPage login;

	@BeforeClass
	public void beforeClassSetUp() {
		login = new LoginPage(driver);

	}

	@Test
	public void loginTest() {
		login.getUsername().sendKeys("standard_user");
		login.getPassword().sendKeys("secret_sauce");
		login.getLoginBtn().click();
		System.out.println("Login Test Passed");
		Assert.assertTrue(false);
	}

}
