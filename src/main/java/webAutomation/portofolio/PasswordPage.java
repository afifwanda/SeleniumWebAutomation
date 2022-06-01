package webAutomation.portofolio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PasswordPage extends BasePageFactory {

	@FindBy(xpath = "//input[@id='new_password']")
	private WebElement emailPassword;
	
	@FindBy(xpath = "//input[@id='confirmed_password']")
	private WebElement confirmPassword;
	
	@FindBy(xpath = "//div[@aria-label='Press and hold']")
	private WebElement holdPress;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement passwordMailButton;

	public PasswordPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	
	public void inputPassword(String Password) {
		emailPassword.sendKeys(Password);
	}
	
	public void inputConfirmPassword(String Password) {
		confirmPassword.sendKeys(Password);
	}


	
	public void clickButton() {
		passwordMailButton.click();
	}

}
