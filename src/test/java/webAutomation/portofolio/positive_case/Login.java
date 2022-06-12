package webAutomation.portofolio.positive_case;

import org.testng.Assert;
import org.testng.annotations.Test;

import webAutomation.portofolio.BaseWebTest;
import webAutomation.portofolio.HomePage;
import webAutomation.portofolio.LoginPage;
import webAutomation.portofolio.RegisterPage;
import webAutomation.portofolio.Utils;

public class Login extends BaseWebTest {
	
	@Test
	public void login_user() {
		HomePage homePage = new HomePage(driver, explicitWait);
		LoginPage loginPage = new LoginPage(driver, explicitWait);
		
		String email = "testf542i@mail.com";
		String password = "Kwipywehgiw61";
		
		homePage.clickButton();
		homePage.clickLogin();
		loginPage.inputEmail(email);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();
		Utils.hardWait(2);
		
		
		String actualText = loginPage.getTextRegis();
		String expectedText = "My Account";

		Assert.assertTrue(actualText.contains(expectedText));
	}

}
