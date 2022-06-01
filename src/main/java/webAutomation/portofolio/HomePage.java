package webAutomation.portofolio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePageFactory{
	@FindBy(xpath = "//a[@class='bui-button bui-button--secondary js-header-login-link']//span[@class='bui-button__text'][normalize-space()='Register']")
	private WebElement registerButton;
	
	@FindBy(xpath = "//span[normalize-space()='List your property']")
	private WebElement listProperty;


	public HomePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	
	public String textAfterRegister() {
		return listProperty.getText();
	}
	
	public void clickButton() {
		registerButton.click();
	}

}


