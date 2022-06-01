package webAutomation.portofolio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasePageFactory {

	@FindBy(xpath = "//input[@id='username']")
	private WebElement emailForm;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement registerMailButton;

	public RegisterPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	
	public void inputEmail(String email) {
		emailForm.sendKeys(email);
	}

	
	public void clickButton() {
		registerMailButton.click();
	}


}

