package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import core.Config;


public class AutomationCreationPage extends PageBase{

	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	private WebElement homePageSignIn;
	
	@FindBy(xpath = "//*[@id=\"email_create\"]")
	private WebElement newAccountEmail;
	
	@FindBy(id = "SubmitCreate")
	private WebElement createButton;
	
	@FindBy(id = "uniform-id_gender1")
	private WebElement gender;
	
	@FindBy(id = "customer_firstname")
	private WebElement firstName;
	
	@FindBy(id = "customer_lastname")
	private WebElement lastName;
	
	@FindBy(id = "passwd")
	private WebElement password;

	@FindBy(xpath = "//*[@id=\"days\"]")
	private WebElement day;
	
	@FindBy(xpath = "//*[@id=\"months\"]")
	private WebElement month;
	
	@FindBy(xpath = "//*[@id=\"years\"]")
	private WebElement year;
	
	@FindBy(id = "address1")
	private WebElement address;
	
	@FindBy(id = "city")
	private WebElement city;
	
	@FindBy(xpath = "//*[@id=\"id_state\"]")
	private WebElement state;
	
	@FindBy(id = "postcode")
	private WebElement postcode;
	
	@FindBy(id = "phone_mobile")
	private WebElement mobile;
	
	@FindBy(id = "submitAccount")
	private WebElement submit;
	
	@FindBy(id = "email")
	private WebElement loginEmail;
	
	@FindBy(id = "passwd")
	private WebElement loginPassword;
	
	@FindBy(id = "passwd")
	private WebElement newloginPassword;
	
	@FindBy(id = "SubmitLogin")
	private WebElement loginSubmit;
	
	@FindBy(xpath = "//*[@id='center_column']/div/div[1]/ul/li[4]/a")
	private WebElement updateInformation;
	
	@FindBy(id = "firstname")
	private WebElement updatedFirstName;
	
	@FindBy(id = "lastname")
	private WebElement updatedLastName;
	
	@FindBy(xpath = "//*[@id=\"days\"]")
	private WebElement updatedDay;
	
	@FindBy(xpath = "//*[@id=\"months\"]")
	private WebElement updatedMonth;
	
	@FindBy(xpath = "//*[@id=\"years\"]")
	private WebElement updatedYear;
	
	@FindBy(id = "old_passwd")
	private WebElement oldPassword;
	
	@FindBy(id = "passwd")
	private WebElement updatedPassword;
	
	@FindBy(id = "confirmation")
	private WebElement passwordConfirmation;
	
	@FindBy(xpath = "//*[@id='center_column']/div/form/fieldset/div[11]/button")
	private WebElement completeUpdate;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span")
	private WebElement updateAddressButton;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div[2]/a/span")
	private WebElement addNewAddress;
	
	@FindBy(id = "address1")
	private WebElement updatedAddress;
	
	@FindBy(id = "city")
	private WebElement updatedCity;
	
	@FindBy(xpath = "//*[@id=\"id_state\"]")
	private WebElement updatedState;
	
	@FindBy(id = "postcode")
	private WebElement updatedPostal;
	
	@FindBy(id = "phone")
	private WebElement updatedPhone;
	
	@FindBy(id = "alias")
	private WebElement addressName;
	
	@FindBy(id = "submitAddress")
	private WebElement submitAdressButton;
	
	
	public AutomationCreationPage(WebDriver driver) {
		super(driver);

	}
	

	public void LaunchApp() {
		driver.get(Config.getProperty("APP_AUTOMATION_URL"));
	
	}
	
	public void CreateAccount() {
		homePageSignIn.click();
		newAccountEmail.sendKeys("testselenium11285@gmail.com");
		createButton.click();
	}

	
	
	public void AccountInformation() {
		
		gender.click();
		firstName.sendKeys("Jordan");
		lastName.sendKeys("test");
		password.sendKeys("Password");
		
		Select sel = new Select(day);
		sel.selectByValue("1");
		
		Select sel1 = new Select(month);
		sel1.selectByValue("1");
		
		Select sel2 = new Select(year);
		sel2.selectByValue("2000");
		
		address.sendKeys("123 pepper");
		
		Select sel3 = new Select(state);
		sel3.selectByValue("25");
		
		city.sendKeys("selo");
		postcode.sendKeys("12342");
		mobile.sendKeys("1233243212");
		submit.click();
	
		
	}
	
	public void UserLogin() {
		homePageSignIn.click();
		loginEmail.sendKeys("testselenium11285@gmail.com");
		loginPassword.sendKeys("Password");
		loginSubmit.click();
		
	}
	
	public void NewUserLogin() {
		homePageSignIn.click();
		loginEmail.sendKeys("testselenium11285@gmail.com");
		newloginPassword.sendKeys("Password!");
		loginSubmit.click();
		
	}
	
	public void UpdateUserInformation() {
		updateInformation.click();
		updatedFirstName.sendKeys("newJordan");
		updatedLastName.sendKeys("newTest");
		
		Select sel = new Select(updatedDay);
		sel.selectByValue("6");
		
		Select sel1 = new Select(updatedMonth);
		sel1.selectByValue("4");
		
		Select sel2 = new Select(updatedYear);
		sel2.selectByValue("1999");
		
		oldPassword.sendKeys("Password");
		
		updatedPassword.sendKeys("Password!");
		
		passwordConfirmation.sendKeys("Password!");
		
		completeUpdate.click();
		
}
	
	public void UpdateUserAddress() {
		updateAddressButton.click();
		addNewAddress.click();
		updatedAddress.sendKeys("123 buffalo dr");
		updatedCity.sendKeys("buffalo");
		
		Select sel = new Select(updatedState);
		sel.selectByValue("30");
		
		updatedPostal.sendKeys("32313");
		
		updatedPhone.sendKeys("716857247");
		
		addressName.sendKeys("second address");
		
		submitAdressButton.click();
	}
}
	
	
	
	
	
