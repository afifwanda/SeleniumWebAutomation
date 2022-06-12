package webAutomation.portofolio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasePageFactory {
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephone;
	
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement radioButton;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement registerSubmitButton;
	
	@FindBy(xpath="//div[@id='content']")
	private WebElement textRegistered;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement warningSign;


	public RegisterPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
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
	
	public void inputPassword(String Password) {
		password.sendKeys(Password);
	}
	
	public void inputConfirmPass(String cPass) {
		confirmPassword.sendKeys(cPass);
	}
	
	public void clickRadio() {
		radioButton.click();
	}
	
	public void clickRegisterButton() {
		registerSubmitButton.click();
	}
	
	public String getTextRegis() {
		return textRegistered.getText();
	}
	
	public String getWarning() {
		return warningSign.getText();
	}


}

