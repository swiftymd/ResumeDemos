package tests;




import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeSuite;

import core.Config;
import core.DriverFactory;

public class TestBase {
	
	private WebDriver driver = null;
	private DriverFactory df = null;

	@BeforeSuite
	public void initSuite() {
		Config.loadProperty(System.getenv("env"));
		
	}
	
	@BeforeClass(alwaysRun=true)
	public void initDriver() throws Exception {
		String browser = null;
		
		if(System.getenv("browser").isEmpty()) {
			browser = "chrome";
		}else {
			browser = System.getenv("browser");
		}
		df =  new DriverFactory();
		driver =  df.getDriver(browser);
		
		
	}
	
	@AfterClass(alwaysRun=true)
	public void tearDown() {
		df.quitDriver();
		
		
	}
	
	public WebDriver driver() {
		return driver;
	}
	


	
	
	
}