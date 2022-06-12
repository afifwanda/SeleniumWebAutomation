package webAutomation.portofolio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePageFactory{
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	private WebElement accountButton;
	

	@FindBy(xpath = "//a[normalize-space()='Register']")
	private WebElement registerSubButton;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'Login')]")
	private WebElement loginSubButton;
	


	public HomePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	
	
	public void clickButton() {
		accountButton.click();
	}
	
	public void clickRegister() {
		registerSubButton.click();
	}
	
	public void clickLogin() {
		loginSubButton.click();
	}
	

}


