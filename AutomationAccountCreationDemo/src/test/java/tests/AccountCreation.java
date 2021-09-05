package tests;



import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import pages.AutomationCreationPage;


public class AccountCreation extends TestBase {

	AutomationCreationPage acp = null;
	
	@Test(priority = 1)
	public void accountCreation() {
		acp = new AutomationCreationPage(driver());
		acp.LaunchApp();
		acp.CreateAccount();
		acp.AccountInformation();
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter AccountCreation = new ExtentSparkReporter("target/Automation_Account_Creation_Results.html");
		AccountCreation.config().setTheme(Theme.DARK);
		AccountCreation.config().setDocumentTitle("Automation Report");
		extent.attachReporter(AccountCreation);
			extent.createTest("Automation Account Creation test")
			.info("The Account was created with the information coded")
			.log(Status.PASS, "New Account Created");
			extent.flush();
		
		
	}

	@Test(priority = 2)
	public void updateInformation() {
		acp = new AutomationCreationPage(driver());
		acp.LaunchApp();
		acp.UserLogin();
		acp.UpdateUserInformation();
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter AccountUpdate = new ExtentSparkReporter("target/Automation_Account_Update_Results.html");
		AccountUpdate.config().setTheme(Theme.DARK);
		AccountUpdate.config().setDocumentTitle("Automation Report");
		extent.attachReporter(AccountUpdate);
			extent.createTest("Automation Account Update test")
			.info("The Account was updated with the information coded")
			.log(Status.PASS, "New Account updated");
			extent.flush();
		
	}
	
	@Test(priority = 3)
	public void updateAddress() {
		acp = new AutomationCreationPage(driver());
		acp.LaunchApp();
		acp.NewUserLogin();
		acp.UpdateUserAddress();
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter AddressUpdate = new ExtentSparkReporter("target/Automation_Address_Update_Results.html");
		AddressUpdate.config().setTheme(Theme.DARK);
		AddressUpdate.config().setDocumentTitle("Automation Report");
		extent.attachReporter(AddressUpdate);
			extent.createTest("Automation Address Update test")
			.info("The Account was updated with the information coded")
			.log(Status.PASS, "New Account Address was updated");
			extent.flush();
	}
}

