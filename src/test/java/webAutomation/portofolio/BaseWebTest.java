package webAutomation.portofolio;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseWebTest {
	
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();
	
	@BeforeMethod
	public void createChromeDriver() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless","--disable-gpu","--window-size=1920,1200");
		driver.set(new ChromeDriver(options));
		explicitWait.set(new WebDriverWait(driver.get(), Duration.ofSeconds(10)));
		driver.get().get("https://www.booking.com/");
		driver.get().manage().window().maximize();
	}

	@AfterMethod
	public void quitChromeDriver() {
		driver.get().quit();
	}

}
