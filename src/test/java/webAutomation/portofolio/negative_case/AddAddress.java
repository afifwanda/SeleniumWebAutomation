package webAutomation.portofolio.negative_case;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
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
	public void user_add_address_without_input_mandatory_fields() {
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
		addressPage.inputLname(lName);
		addressPage.inputAddress(address);
		addressPage.inputCity(city);
		addressPage.inputPostalCode(postCode);
		addressPage.inputCountry(country);
		addressPage.inputArea(area);
		addressPage.ClickAddAddress();
		
		
		String actualText = addressPage.getTextRegis();
		String expectedText = "First Name must be between 1 and 32 characters!";
		

		AssertJUnit.assertTrue(actualText.contains(expectedText));
	}
	
	@Test
	public void user_add_address_with_postalCode_exceed_maximum_character() {
		HomePage homePage = new HomePage(driver, explicitWait);
		LoginPage loginPage = new LoginPage(driver, explicitWait);
		AddressPage addressPage = new AddressPage(driver, explicitWait);
		
		String email = "testf542i@mail.com";
		String password = "Kwipywehgiw61";
		String fName = "joseph";
		String lName = "marlon";
		String address = "new england 1 boulevard";
		String city = "birmingham";
		String postCode = "563535635635635635353566353653563563653653563563563563562";
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
		String expectedText = "Postcode must be between 2 and 10 characters!";

		AssertJUnit.assertTrue(actualText.contains(expectedText));
	}
	
	@Test
	public void user_add_address_with_postalCode_below_minimum_character() {
		HomePage homePage = new HomePage(driver, explicitWait);
		LoginPage loginPage = new LoginPage(driver, explicitWait);
		AddressPage addressPage = new AddressPage(driver, explicitWait);
		
		String email = "testf542i@mail.com";
		String password = "Kwipywehgiw61";
		String fName = "joseph";
		String lName = "marlon";
		String address = "new england 1 boulevard";
		String city = "birmingham";
		String postCode = "2";
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
		String expectedText = "Postcode must be between 2 and 10 characters!";
		

		AssertJUnit.assertTrue(actualText.contains(expectedText));
	}
	
	@Test
	public void user_add_address_with_alphabetical_postalCode() {
		HomePage homePage = new HomePage(driver, explicitWait);
		LoginPage loginPage = new LoginPage(driver, explicitWait);
		AddressPage addressPage = new AddressPage(driver, explicitWait);
		
		String email = "testf542i@mail.com";
		String password = "Kwipywehgiw61";
		String fName = "joseph";
		String lName = "marlon";
		String address = "new england 1 boulevard";
		String city = "birmingham";
		String postCode = "ABS";
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
		String expectedText = "Postcode must be numeric!";
		

		AssertJUnit.assertTrue(actualText.contains(expectedText));
	}

}
