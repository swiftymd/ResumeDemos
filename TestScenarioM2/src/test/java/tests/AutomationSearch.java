package tests;

import org.testng.annotations.Test;

import pages.AutomationSearchPage;

public class AutomationSearch extends TestBase{
	
	AutomationSearchPage asp = null;
	
	
	@Test(priority=1)
	public void chiffonSearch() {
		asp = new AutomationSearchPage(driver);
		asp.LaunchApp();
		asp.ChiffonSearch();
	
	}
	
	@Test(priority=2)
	public void SummerDress() {
		asp = new AutomationSearchPage(driver);
		asp.LaunchApp();
		asp.SummerDress();
		
	}

	@Test(priority=3)
	public void NoResult() {
		asp = new AutomationSearchPage(driver);
		asp.LaunchApp();
		asp.NoResult();
	}
}
