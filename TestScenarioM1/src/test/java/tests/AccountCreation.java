package tests;



import org.testng.annotations.Test;

import pages.AutomationCreationPage;


public class AccountCreation extends TestBase {

	AutomationCreationPage acp = null;
	
	@Test(priority = 1)
	public void accountCreation() {
		
		
		acp = new AutomationCreationPage(driver());
		acp.LaunchApp();
		acp.CreateAccount();
		acp.AccountInformation();
		
	}

	@Test(priority = 2)
	public void updateInformation() {
		acp = new AutomationCreationPage(driver());
		acp.LaunchApp();
		acp.UserLogin();
		acp.UpdateUserInformation();
		
	}
	
	@Test(priority = 3)
	public void updateAddress() {
		acp = new AutomationCreationPage(driver());
		acp.LaunchApp();
		acp.NewUserLogin();
		acp.UpdateUserAddress();
	}
}

