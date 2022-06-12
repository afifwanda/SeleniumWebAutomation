package webAutomation.portofolio.negative_case;

import org.testng.Assert;
import org.testng.annotations.Test;

import webAutomation.portofolio.BaseWebTest;
import webAutomation.portofolio.HomePage;
import webAutomation.portofolio.LoginPage;
import webAutomation.portofolio.RegisterPage;
import webAutomation.portofolio.Utils;

public class Login extends BaseWebTest {
	
	@Test
	public void login_user_with_wrong_password() {
		HomePage homePage = new HomePage(driver, explicitWait);
		LoginPage loginPage = new LoginPage(driver, explicitWait);
		
		String email = "testf542i@mail.com";
		String password = "Kwipywegiw61";
		
		homePage.clickButton();
		homePage.clickLogin();
		loginPage.inputEmail(email);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();
		Utils.hardWait(2);
		
		
		String actualText = loginPage.getWarning();
		String expectedText = "Warning: No match for E-Mail Address and/or Password.";

		Assert.assertTrue(actualText.contains(expectedText));
	}
	
	@Test
	public void login_user_with_unregistered_user() {
		HomePage homePage = new HomePage(driver, explicitWait);
		LoginPage loginPage = new LoginPage(driver, explicitWait);
		
		String email = "testirooosa@gmail.com";
		String password = "Kwipywegiw61";
		
		homePage.clickButton();
		homePage.clickLogin();
		loginPage.inputEmail(email);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();
		Utils.hardWait(2);
		
		
		String actualText = loginPage.getWarning();
		String expectedText = "Warning: No match for E-Mail Address and/or Password.";
		
		System.out.println(actualText);

		Assert.assertTrue(actualText.contains(expectedText));
	}
	
	@Test
	public void login_user_with_exceed_login_number_attempt() {
		HomePage homePage = new HomePage(driver, explicitWait);
		LoginPage loginPage = new LoginPage(driver, explicitWait);
		
		String email = "testirosoosaa1@gmail.com";
		String password = "Kwipywegiw61";
		
		int i = 1;
		
		while(i < 5){
		homePage.clickButton();
		homePage.clickLogin();
		loginPage.inputEmail(email);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();
		Utils.hardWait(2);
		i++;
		}
		
		
		String actualText = loginPage.getWarning();
		String expectedText = "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.";
		
		System.out.println(actualText);

		Assert.assertTrue(actualText.contains(expectedText));
	}

}
