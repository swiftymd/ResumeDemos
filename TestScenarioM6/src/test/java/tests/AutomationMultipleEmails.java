package tests;

import org.testng.annotations.Test;

import pages.AutomationMultipleEmailsPage;

public class AutomationMultipleEmails extends TestBase{

	AutomationMultipleEmailsPage amep = null;
	
	@Test
	public void firstAccount() {
	
		amep = new AutomationMultipleEmailsPage(driver());
		amep.LaunchApp();
		amep.FirstNewAccount();
		amep.GeneralInformation();
		amep.FirstAccountInformation();
		amep.AddingTwoItems();
	
	}
	@Test
	public void secondAccount() {
		
		amep = new AutomationMultipleEmailsPage(driver());
		amep.LaunchApp();
		amep.SecondNewAccount();
		amep.GeneralInformation();
		amep.SecondAccountInformation();
		amep.AddingTwoItems();
		
	}
	@Test
	public void thirdAccount() {
		
		amep = new AutomationMultipleEmailsPage(driver());
		amep.LaunchApp();
		amep.ThirdNewAccount();
		amep.GeneralInformation();
		amep.ThirdAccountInformation();
		amep.AddingTwoItems();
		
	}
	@Test
	public void forthAccount() {
		
		amep = new AutomationMultipleEmailsPage(driver());
		amep.LaunchApp();
		amep.ForthNewAccount();
		amep.GeneralInformation();
		amep.ForthAccountInformation();
		amep.AddingTwoItems();
		
	}
	@Test
	public void fifthAccount() {
		
		amep = new AutomationMultipleEmailsPage(driver());
		amep.LaunchApp();
		amep.FifthNewAccount();
		amep.GeneralInformation();
		amep.FifthAccountInformation();
		amep.AddingTwoItems();
		
	}
	@Test
	public void sixthAccount() {
		
		amep = new AutomationMultipleEmailsPage(driver());
		amep.LaunchApp();
		amep.SixthNewAccount();
		amep.GeneralInformation();
		amep.SixthAccountInformation();
		amep.AddingTwoItems();
		
	}
	@Test
	public void seventhAccount() {
		
		amep = new AutomationMultipleEmailsPage(driver());
		amep.LaunchApp();
		amep.SeventhNewAccount();
		amep.GeneralInformation();
		amep.SeventhAccountInformation();
		amep.AddingTwoItems();
		
	}
	@Test
	public void eighthAccount() {
		
		amep = new AutomationMultipleEmailsPage(driver());
		amep.LaunchApp();
		amep.EighthNewAccount();
		amep.GeneralInformation();
		amep.EighthAccountInformation();
		amep.AddingTwoItems();
		
	}
	@Test
	public void ninthAccount() {
		
		amep = new AutomationMultipleEmailsPage(driver());
		amep.LaunchApp();
		amep.NinthNewAccount();
		amep.GeneralInformation();
		amep.NinthAccountInformation();
		amep.AddingTwoItems();
		
	}
	@Test
	public void tenthAccount() {
		
		amep = new AutomationMultipleEmailsPage(driver());
		amep.LaunchApp();
		amep.TenthNewAccount();
		amep.GeneralInformation();
		amep.TenthAccountInformation();
		amep.AddingTwoItems();
		
	}
}
