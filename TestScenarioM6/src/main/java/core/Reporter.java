package core;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reporter {
	
	private ExtentReports reports = null;
	private ExtentTest test = null;
	
	public Reporter() {
		reports = new ExtentReports(System.getProperty("user.dir")+"//TestReport.html",true);
	}
	
	public void startReport(String testName) {
		test = reports.startTest(testName);
	}
	
	public void log(LogStatus status, String stepName, String stepDesc) {
		test.log(status, stepName, stepDesc);
	}
	
	public void stopReport() {
		reports.endTest(test);
	}
	
	public void clearReport() {
		reports.flush();
		reports.close();
	}
	

}
