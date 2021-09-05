package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import pages.AutomationSearchPage;

public class AutomationSearch extends TestBase{
	
	AutomationSearchPage asp = null;
	
	@Test(priority=1)
	public void Chiffon_Dress_Search() {
		asp = new AutomationSearchPage(driver());
		asp.LaunchApp();
		asp.chiffon_Dress_Search();
		asp.ReturnToMain();
		
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter Chiffon = new ExtentSparkReporter("target/Automation_ChiffonDress_Search.html");
		Chiffon.config().setTheme(Theme.DARK);
		Chiffon.config().setDocumentTitle("Automation Report");
		extent.attachReporter(Chiffon);
		extent.createTest("Automation Chiffon search test")
		.info("Dress was in stock and added to cart")
		.log(Status.PASS, "The search was successful ");
		extent.flush();
	
	}
	
	@Test(priority=2)
	public void SummerDress() {
		asp.LaunchApp();
		asp.Summer_Dress_Search();
		asp.ReturnToMain();
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter Summer = new ExtentSparkReporter("target/Automation_SummerDress_Search.html");
		Summer.config().setTheme(Theme.DARK);
		Summer.config().setDocumentTitle("Automation Report");
		extent.attachReporter(Summer);
		extent.createTest("Automation  search test")
		.info("Dress was in stock and added to cart")
		.log(Status.PASS, "The search was successful ");
		extent.flush();
		
	}

	@Test(priority=3)
	public void NoResult() {
		asp.LaunchApp();
		asp.No_Search_Result();
		asp.ReturnToMain();
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter NoResult = new ExtentSparkReporter("target/Automation_NoResult_Search.html");
		NoResult.config().setTheme(Theme.DARK);
		NoResult.config().setDocumentTitle("Automation Report");
		extent.attachReporter(NoResult);
		extent.createTest("Automation  search test")
		.info("There is no result")
		.log(Status.PASS, "The search was successful ");
		extent.flush();
	}
	
}
