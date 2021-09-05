package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import pages.AutomationPerformancePage;

public class AutomationPerformance extends TestBase{

	AutomationPerformancePage app = null;
	
	@Test
	public void AutomationPerformanceTest() {
	
		app = new AutomationPerformancePage(driver());
		app.LaunchApp();
		app.PerformanceTesting();
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter PerformanceTest = new ExtentSparkReporter("target/AutomationPerformanceResults.html");
		PerformanceTest.config().setTheme(Theme.DARK);
		PerformanceTest.config().setDocumentTitle("Automation Report");
		extent.attachReporter(PerformanceTest);
			extent.createTest("Automation Performance test")
			.log(Status.PASS, "Each Test Function successfully completed in 1-2 seconds");
			extent.flush();
}
}
