package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import pages.AutomationCartPage;

public class AutomationCart extends TestBase{

	AutomationCartPage acp = null;
	
	@Test(priority = 1)
	public void automationCart() {
		
	acp = new AutomationCartPage(driver());
	acp.LaunchApp();
	acp.AutomationCart();
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter CartTest = new ExtentSparkReporter("target/Automation_Cart_Results.html");
	CartTest.config().setTheme(Theme.DARK);
	CartTest.config().setDocumentTitle("Automation Report");
	extent.attachReporter(CartTest);
		extent.createTest("Automation Cart test")
		.info("The Summer dress is in stock adding it to cart")
		.info("The dress is in the cart...updating quantity to two")
		.info("Updated to two dresses...proceeding to checkout")
		.log(Status.PASS, "The Cart was successfully purchased by check");
		extent.flush();
	
	
	}
	
}
