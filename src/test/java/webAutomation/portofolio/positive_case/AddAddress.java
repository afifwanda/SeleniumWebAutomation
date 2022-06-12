package webAutomation.portofolio.positive_case;

import org.testng.Assert;
import org.testng.annotations.Test;

import webAutomation.portofolio.AddressPage;
import webAutomation.portofolio.BaseWebTest;
import webAutomation.portofolio.HomePage;
import webAutomation.portofolio.LoginPage;
import webAutomation.portofolio.RegisterPage;
import webAutomation.portofolio.Utils;

public class AddAddress extends BaseWebTest {
	
	@Test
	public void user_add_address() {
		HomePage homePage = new HomePage(driver, explicitWait);
		LoginPage loginPage = new LoginPage(driver, explicitWait);
		AddressPage addressPage = new AddressPage(driver, explicitWait);
		
		String email = "testf542i@mail.com";
		String password = "Kwipywehgiw61";
		String fName = "joseph";
		String lName = "marlon";
		String address = "new england 1 boulevard";
		String city = "birmingham";
		String postCode = "5762";
		String country = "United Kingdom";
		String area = "Bristol";
		
		homePage.clickButton();
		homePage.clickLogin();
		loginPage.inputEmail(email);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();
		Utils.hardWait(2);
		addressPage.ClickAddressBook();
		addressPage.ClickAddNewAddress();
		addressPage.inputFname(fName);
		addressPage.inputLname(lName);
		addressPage.inputAddress(address);
		addressPage.inputCity(city);
		addressPage.inputPostalCode(postCode);
		addressPage.inputCountry(country);
		addressPage.inputArea(area);
		addressPage.ClickAddAddress();
		
		
		String actualText = addressPage.getTextRegis();
		String expectedText = "Address Book Entries";
		

		Assert.assertTrue(actualText.contains(expectedText));
	}

}
