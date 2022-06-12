package webAutomation.portofolio.negative_case;

import org.testng.Assert;
import org.testng.annotations.Test;

import webAutomation.portofolio.BaseWebTest;
import webAutomation.portofolio.HomePage;
import webAutomation.portofolio.LoginPage;
import webAutomation.portofolio.RegisterPage;
import webAutomation.portofolio.Utils;

public class Register extends BaseWebTest {
	
	
	@Test
	public void register_user_with_different_confirm_password() {
		HomePage homePage = new HomePage(driver, explicitWait);
		RegisterPage registerPage = new RegisterPage(driver, explicitWait);
		LoginPage PasswordPage = new LoginPage(driver,explicitWait);
		
		String fName = "joseph";
		String lName = "marlon";
		String email = Utils.mailRandomGenerator(Long.parseLong("199"), Long.parseLong("999"));
		String password = "KKwipywehgiw61";
		String cPassword = "KKwipywehgiw61";
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
		String expectedText = "Password confirmation does not match password!";

		Assert.assertTrue(actualText.contains(expectedText));
	}
	
	@Test
	public void register_user_with_registered_mail() {
		HomePage homePage = new HomePage(driver, explicitWait);
		RegisterPage registerPage = new RegisterPage(driver, explicitWait);
		LoginPage PasswordPage = new LoginPage(driver,explicitWait);
		
		String fName = "joseph";
		String lName = "marlon";
		String email = "test@test.com";
		String password = "KKwipywehgiw61";
		String cPassword = "KKwipywehgiw61";
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
		String expectedText = "If you already have an account with us, please login at the login page.";

		Assert.assertTrue(actualText.contains(expectedText));
	}
	
	@Test
	public void register_user_without_input_first_name() {
		HomePage homePage = new HomePage(driver, explicitWait);
		RegisterPage registerPage = new RegisterPage(driver, explicitWait);
		LoginPage PasswordPage = new LoginPage(driver,explicitWait);
		
		String fName = "123";
		String lName = "marlon";
		String email = Utils.mailRandomGenerator(Long.parseLong("199"), Long.parseLong("999"));
		String password = "KKwipywehgiw61";
		String cPassword = "KKwipywehgiw61";
		String phone = "536764762";
		
		homePage.clickButton();
		homePage.clickRegister();
		registerPage.inputLname(lName);
		registerPage.inputEmail(email);
		registerPage.inputPhone(phone);
		registerPage.inputPassword(password);
		registerPage.inputConfirmPass(cPassword);
		registerPage.clickRadio();
		registerPage.clickRegisterButton();
		Utils.hardWait(2);
	
		
		String actualText = registerPage.getTextRegis();
		String expectedText = "First Name must be between 1 and 32 characters!";

		Assert.assertTrue(actualText.contains(expectedText));
	}
	
	@Test
	public void register_user_with_exceed_character_maximum_first_name() {
		HomePage homePage = new HomePage(driver, explicitWait);
		RegisterPage registerPage = new RegisterPage(driver, explicitWait);
		LoginPage PasswordPage = new LoginPage(driver,explicitWait);
		
		String fName = "hsdgggwgghgsagghgdgygygysahgdgggsahggwggqgubcbbaggiauqwuguasbjbjuaugq";
		String lName = "marlon";
		String email = Utils.mailRandomGenerator(Long.parseLong("199"), Long.parseLong("999"));
		String password = "KKwipywehgiw61";
		String cPassword = "KKwipywehgiw61";
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
		String expectedText = "First Name must be between 1 and 32 characters!";

		Assert.assertTrue(actualText.contains(expectedText));
	}
	
	@Test
	public void register_user_without_check_terms_condition() {
		HomePage homePage = new HomePage(driver, explicitWait);
		RegisterPage registerPage = new RegisterPage(driver, explicitWait);
		LoginPage PasswordPage = new LoginPage(driver,explicitWait);
		
		String fName = "joseph";
		String lName = "marlon";
		String email = Utils.mailRandomGenerator(Long.parseLong("199"), Long.parseLong("999"));
		String password = "KKwipywehgiw61";
		String cPassword = "KKwipywehgiw61";
		String phone = "536764762";
		
		homePage.clickButton();
		homePage.clickRegister();
		registerPage.inputFname(fName);
		registerPage.inputLname(lName);
		registerPage.inputEmail(email);
		registerPage.inputPhone(phone);
		registerPage.inputPassword(password);
		registerPage.inputConfirmPass(cPassword);
		registerPage.clickRegisterButton();
		Utils.hardWait(2);
	
		
		String actualText = registerPage.getWarning();
		String expectedText = "Warning: You must agree to the Privacy Policy!";

		Assert.assertTrue(actualText.contains(expectedText));
	}
	
	@Test
	public void register_user_with_password_below_minimum_characters() {
		HomePage homePage = new HomePage(driver, explicitWait);
		RegisterPage registerPage = new RegisterPage(driver, explicitWait);
		LoginPage PasswordPage = new LoginPage(driver,explicitWait);
		
		String fName = "joseph";
		String lName = "marlon";
		String email = Utils.mailRandomGenerator(Long.parseLong("199"), Long.parseLong("999"));
		String password = "KKw";
		String cPassword = "KKw";
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
		String expectedText = "Password must be between 4 and 20 characters!";

		Assert.assertTrue(actualText.contains(expectedText));
	}
	
	@Test
	public void register_user_with_telephone_below_minimum_characters() {
		HomePage homePage = new HomePage(driver, explicitWait);
		RegisterPage registerPage = new RegisterPage(driver, explicitWait);
		LoginPage PasswordPage = new LoginPage(driver,explicitWait);
		
		String fName = "joseph";
		String lName = "marlon";
		String email = Utils.mailRandomGenerator(Long.parseLong("199"), Long.parseLong("999"));
		String password = "KKwww";
		String cPassword = "KKwww";
		String phone = "5";
		
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
		String expectedText = "Telephone must be between 3 and 32 characters!";

		Assert.assertTrue(actualText.contains(expectedText));
	}

	

}
