package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	private WebDriver driver = null;
	
	public WebDriver getDriver(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\jordan\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\jordan\\Desktop\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Long.parseLong(Config.getProperty("PAGE_LOAD_TIMEOUT")), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Long.parseLong(Config.getProperty("IMPLICIT_WAIT")), TimeUnit.SECONDS);
		return driver;
	}
	
	public void quitDriver() {
		if(driver!= null) {
			driver.quit();
		}
	}
	
	
	

}