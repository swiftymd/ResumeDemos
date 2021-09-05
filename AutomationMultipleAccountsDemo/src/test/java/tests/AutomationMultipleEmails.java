package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import pages.AutomationMultipleEmailsPage;

public class AutomationMultipleEmails extends TestBase{

	AutomationMultipleEmailsPage amep = null;
	
	@Test
	public void firstAccount() {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter firstAccount = new ExtentSparkReporter("target/Automation_First_Account_Results.html");
		firstAccount.config().setTheme(Theme.DARK);
		firstAccount.config().setDocumentTitle("Automation Report");
		extent.attachReporter(firstAccount);

		amep = new AutomationMultipleEmailsPage(driver());
		amep.LaunchApp();
		amep.FirstNewAccount();
		amep.GeneralInformation();
		amep.FirstAccountInformation();
		amep.AddingTwoItems();
	
		extent.createTest("First Email Creation Test")
		.info("First Account was Created")
		.info("General information was successfully added")
		.info("Two items were added to the cart")
		.log(Status.PASS, "The First Account was successfully created");
		extent.flush();
	}
	@Test
	public void secondAccount() {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter SecondAccount = new ExtentSparkReporter("target/Automation_Second_Account_Results.html");
		SecondAccount.config().setTheme(Theme.DARK);
		SecondAccount.config().setDocumentTitle("Automation Report");
		extent.attachReporter(SecondAccount);
		
		amep = new AutomationMultipleEmailsPage(driver());
		amep.LaunchApp();
		amep.SecondNewAccount();
		amep.GeneralInformation();
		amep.SecondAccountInformation();
		amep.AddingTwoItems();
		
		extent.createTest("Second Email Creation Test")
		.info("Second Account was Created")
		.info("General information was successfully added")
		.info("Two items were added to the cart")
		.log(Status.PASS, "The Second Account was successfully created");
		extent.flush();
		
	}
	@Test
	public void thirdAccount() {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter ThirdAccount = new ExtentSparkReporter("target/Automation_Third_Account_Results.html");
		ThirdAccount.config().setTheme(Theme.DARK);
		ThirdAccount.config().setDocumentTitle("Automation Report");
		extent.attachReporter(ThirdAccount);
		
		amep = new AutomationMultipleEmailsPage(driver());
		amep.LaunchApp();
		amep.ThirdNewAccount();
		amep.GeneralInformation();
		amep.ThirdAccountInformation();
		amep.AddingTwoItems();
		
		extent.createTest("Third Email Creation Test")
		.info("Third Account was Created")
		.info("General information was successfully added")
		.info("Two items were added to the cart")
		.log(Status.PASS, "The Third Account was successfully created");
		extent.flush();
		
	}
	@Test
	public void forthAccount() {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter ForthAccount = new ExtentSparkReporter("target/Automation_Forth_Account_Results.html");
		ForthAccount.config().setTheme(Theme.DARK);
		ForthAccount.config().setDocumentTitle("Automation Report");
		extent.attachReporter(ForthAccount);
		
		amep = new AutomationMultipleEmailsPage(driver());
		amep.LaunchApp();
		amep.ForthNewAccount();
		amep.GeneralInformation();
		amep.ForthAccountInformation();
		amep.AddingTwoItems();
		
		extent.createTest("Forth Email Creation Test")
		.info("Forth Account was Created")
		.info("General information was successfully added")
		.info("Two items were added to the cart")
		.log(Status.PASS, "The Forth Account was successfully created");
		extent.flush();
		
	}
	@Test
	public void fifthAccount() {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter FifthAccount = new ExtentSparkReporter("target/Automation_Fifth_Account_Results.html");
		FifthAccount.config().setTheme(Theme.DARK);
		FifthAccount.config().setDocumentTitle("Automation Report");
		extent.attachReporter(FifthAccount);
		
		amep = new AutomationMultipleEmailsPage(driver());
		amep.LaunchApp();
		amep.FifthNewAccount();
		amep.GeneralInformation();
		amep.FifthAccountInformation();
		amep.AddingTwoItems();
		
		extent.createTest("Fifth Email Creation Test")
		.info("Fifth Account was Created")
		.info("General information was successfully added")
		.info("Two items were added to the cart")
		.log(Status.PASS, "The Fifth Account was successfully created");
		extent.flush();
		
	}
	@Test
	public void sixthAccount() {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter SixthAccount = new ExtentSparkReporter("target/Automation_Sixth_Account_Results.html");
		SixthAccount.config().setTheme(Theme.DARK);
		SixthAccount.config().setDocumentTitle("Automation Report");
		extent.attachReporter(SixthAccount);
		
		amep = new AutomationMultipleEmailsPage(driver());
		amep.LaunchApp();
		amep.SixthNewAccount();
		amep.GeneralInformation();
		amep.SixthAccountInformation();
		amep.AddingTwoItems();
		
		extent.createTest("Sixth Email Creation Test")
		.info("Sixth Account was Created")
		.info("General information was successfully added")
		.info("Two items were added to the cart")
		.log(Status.PASS, "The Sixth Account was successfully created");
		extent.flush();
		
	}
	@Test
	public void seventhAccount() {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter SeventhAccount = new ExtentSparkReporter("target/Automation_Seventh_Account_Results.html");
		SeventhAccount.config().setTheme(Theme.DARK);
		SeventhAccount.config().setDocumentTitle("Automation Report");
		extent.attachReporter(SeventhAccount);
		
		amep = new AutomationMultipleEmailsPage(driver());
		amep.LaunchApp();
		amep.SeventhNewAccount();
		amep.GeneralInformation();
		amep.SeventhAccountInformation();
		amep.AddingTwoItems();
		
		extent.createTest("Seventh Email Creation Test")
		.info("Seventh Account was Created")
		.info("General information was successfully added")
		.info("Two items were added to the cart")
		.log(Status.PASS, "The Seventh Account was successfully created");
		extent.flush();
		
	}
	@Test
	public void eighthAccount() {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter EighthAccount = new ExtentSparkReporter("target/Automation_Eighth_Account_Results.html");
		EighthAccount.config().setTheme(Theme.DARK);
		EighthAccount.config().setDocumentTitle("Automation Report");
		extent.attachReporter(EighthAccount);
		
		amep = new AutomationMultipleEmailsPage(driver());
		amep.LaunchApp();
		amep.EighthNewAccount();
		amep.GeneralInformation();
		amep.EighthAccountInformation();
		amep.AddingTwoItems();
		
		extent.createTest("Eighth Email Creation Test")
		.info("Eighth Account was Created")
		.info("General information was successfully added")
		.info("Two items were added to the cart")
		.log(Status.PASS, "The Eighth Account was successfully created");
		extent.flush();
		
	}
	@Test
	public void ninthAccount() {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter NinthAccount = new ExtentSparkReporter("target/Automation_Ninth_Account_Results.html");
		NinthAccount.config().setTheme(Theme.DARK);
		NinthAccount.config().setDocumentTitle("Automation Report");
		extent.attachReporter(NinthAccount);
		
		amep = new AutomationMultipleEmailsPage(driver());
		amep.LaunchApp();
		amep.NinthNewAccount();
		amep.GeneralInformation();
		amep.NinthAccountInformation();
		amep.AddingTwoItems();
		
		extent.createTest("Ninth Email Creation Test")
		.info("Ninth Account was Created")
		.info("General information was successfully added")
		.info("Two items were added to the cart")
		.log(Status.PASS, "The Ninth Account was successfully created");
		extent.flush();
		
	}
	@Test
	public void tenthAccount() {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter TenthAccount = new ExtentSparkReporter("target/Automation_Tenth_Account_Results.html");
		TenthAccount.config().setTheme(Theme.DARK);
		TenthAccount.config().setDocumentTitle("Automation Report");
		extent.attachReporter(TenthAccount);
		
		amep = new AutomationMultipleEmailsPage(driver());
		amep.LaunchApp();
		amep.TenthNewAccount();
		amep.GeneralInformation();
		amep.TenthAccountInformation();
		amep.AddingTwoItems();
		
		extent.createTest("Tenth Email Creation Test")
		.info("Tenth Account was Created")
		.info("General information was successfully added")
		.info("Two items were added to the cart")
		.log(Status.PASS, "The Tenth Account was successfully created");
		extent.flush();
		
	}
}
