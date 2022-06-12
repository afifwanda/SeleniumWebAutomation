package webAutomation.portofolio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePageFactory {

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement password;
	
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginSubmitButton;
	
	@FindBy(xpath="//div[@id='content']")
	private WebElement textRegistered;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement warningSign;


	public LoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	
	public void inputEmail(String Email) {
		email.sendKeys(Email);
	}
	
	
	public void inputPassword(String Password) {
		password.sendKeys(Password);
	}
	
	public void clickLoginButton() {
		loginSubmitButton.click();
	}
	
	public String getTextRegis() {
		return textRegistered.getText();
	}
	
	public String getWarning() {
		return warningSign.getText();
	}


}

