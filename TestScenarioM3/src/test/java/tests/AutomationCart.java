package tests;

import org.testng.annotations.Test;

import pages.AutomationCartPage;

public class AutomationCart extends TestBase{

	AutomationCartPage acp = null;
	@Test(priority = 1)
	public void automationCart() {
		
	acp = new AutomationCartPage(driver());
	acp.LaunchApp();
	acp.AutomationCart();
	}
	
}
