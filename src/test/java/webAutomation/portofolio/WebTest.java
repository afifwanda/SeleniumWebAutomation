package webAutomation.portofolio;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest extends BaseWebTest {
	
	@Test
	public void register_user_with_correct_password() {
		HomePage homePage = new HomePage(driver, explicitWait);
		RegisterPage registerMailPage = new RegisterPage(driver, explicitWait);
		PasswordPage PasswordPage = new PasswordPage(driver,explicitWait);
		
		String email = "testaqhdhutod3mation@gmail.com";
		String password = "MakanNasiPadang1";
		
		homePage.clickButton();
		registerMailPage.inputEmail(email);
		registerMailPage.clickButton();
		Utils.hardWait(3);
		PasswordPage.inputPassword(password);
		PasswordPage.inputConfirmPassword(password);
		PasswordPage.clickButton();
		Utils.hardWait(10);
		
	
		
		String actualText = homePage.textAfterRegister();
		String expectedText = "Hi";
		
		System.out.println(" ini text");
		System.out.println(actualText + " ini text");
		
		Assert.assertTrue(actualText.contains(expectedText));
	}

}
