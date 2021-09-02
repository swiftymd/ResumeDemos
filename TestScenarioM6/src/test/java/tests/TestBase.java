package tests;

import java.lang.reflect.Method;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import core.Config;
import core.DriverFactory;
import core.Reporter;

public class TestBase {
	
	private WebDriver driver = null;
	private DriverFactory df = null;
	private Reporter report = null;

	@BeforeSuite
	public void initSuite() {
		Config.loadProperty(System.getenv("env"));
		report = new Reporter();
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
	
	@BeforeMethod
	public void reportStart(Method method) {
		report.startReport(method.getName());
	}
	
	@AfterMethod
	public void stopReport() {
		report.stopReport();
		
	}
	
	@AfterSuite
	public void dumpReport() {
		report.clearReport();
	}
	
	public Reporter report() {
		return report;
	}
	

	
	
	
}
