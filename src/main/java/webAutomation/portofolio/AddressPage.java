package webAutomation.portofolio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class AddressPage extends BasePageFactory {
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephone;
	
	@FindBy(xpath = "//input[@id='input-address-1']")
	private WebElement address;
	
	@FindBy(xpath = "//input[@id='input-city']")
	private WebElement city;
	
	@FindBy(xpath = "//input[@id='input-postcode']")
	private WebElement postalCode;
	
	@FindBy(xpath = "//select[@id='input-country']")
	private WebElement country;
	
	
	
	@FindBy(xpath = "//select[@id='input-zone']")
	private WebElement area;
	
	
	
	@FindBy(xpath = "//ul[@class='list-unstyled']//a[contains(text(),'Address Book')]")
	private WebElement addressBook;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement addNewAddress;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement addAddress;
	
	@FindBy(xpath="//div[@id='content']")
	private WebElement textRegistered;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement warningSign;


	public AddressPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	
	public void inputFname(String fName) {
		firstName.sendKeys(fName);
	}
	
	public void inputLname(String lName) {
		lastName.sendKeys(lName);
	}
	
	public void inputEmail(String Email) {
		email.sendKeys(Email);
	}
	
	public void inputPhone(String phone) {
		telephone.sendKeys(phone);
	}
	
	public void inputAddress(String Address) {
		address.sendKeys(Address);
	}
	
	public void inputCity(String City) {
		city.sendKeys(City);
	}
	
	public void inputPostalCode(String Zip) {
		postalCode.sendKeys(Zip);
	}
	
	public void inputCountry(String Country) {
		Select countryList = new Select(country);
		countryList.selectByVisibleText(Country);
	}
	
	public void inputArea(String Area) {
		Select areaList = new Select(area);
		areaList.selectByVisibleText(Area);
	}
	
	public void ClickAddressBook() {
		addressBook.click();
	}
	
	public void ClickAddNewAddress() {
		addNewAddress.click();
	}
	
	public void ClickAddAddress() {
		addAddress.click();
	}
	
	public String getTextRegis() {
		return textRegistered.getText();
	}
	
	public String getWarning() {
		return warningSign.getText();
	}


}

