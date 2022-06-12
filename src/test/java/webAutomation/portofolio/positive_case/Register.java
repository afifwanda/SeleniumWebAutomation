package webAutomation.portofolio.positive_case;

import org.testng.Assert;
import org.testng.annotations.Test;

import webAutomation.portofolio.BaseWebTest;
import webAutomation.portofolio.HomePage;
import webAutomation.portofolio.LoginPage;
import webAutomation.portofolio.RegisterPage;
import webAutomation.portofolio.Utils;

public class Register extends BaseWebTest {
	
	@Test
	public void register_user() {
		HomePage homePage = new HomePage(driver, explicitWait);
		RegisterPage registerPage = new RegisterPage(driver, explicitWait);
		LoginPage PasswordPage = new LoginPage(driver,explicitWait);
		
		String fName = "joseph";
		String lName = "marlon";
		String email = Utils.mailRandomGenerator(Long.parseLong("199"), Long.parseLong("999"));
		String password = "Kwipywehgiw61";
		String cPassword = "Kwipywehgiw61";
		String phone = "536764762";
		
		homePage.clickButton();
		homePage.clickRegister();
		registerPage.inputFname(fName);
		registerPage.inputLname(lName);
		registerPage.inputEmail(email);
		registerPage.inputPhone(phone);
		registerPage.inputPassword(password);
		registerPage.inputConfirmPass(cPassword);
		registerPage.clickRadio();
		registerPage.clickRegisterButton();
		Utils.hardWait(2);
		
		
		String actualText = registerPage.getTextRegis();
		String expectedText = "Congratulations! Your new account has been successfully created!";

		Assert.assertTrue(actualText.contains(expectedText));
	}
}
