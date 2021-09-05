package pages;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import core.Config;


public class AutomationMultipleEmailsPage extends PageBase{

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
	
	@FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
	private WebElement homePageLogo;
	
	@FindBy(id = "search_query_top")
	private WebElement homeSearchBar;
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/button")
	private WebElement searchBoxButton;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/h5/a")
	private WebElement chiffonDress;
	
	@FindBy(id = "add_to_cart")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
	private WebElement continueShopping;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
	private WebElement summerDress;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
	private WebElement signoutButton;
	
	
	public AutomationMultipleEmailsPage(WebDriver driver) {
		super(driver);

	}
	
	public static HashMap<String, String> getEmailMap() {
		HashMap<String, String> userMap = new HashMap <String, String>();
		
		userMap.put("emailOne", "TestEmail575756@gmail.com:Password1");
		userMap.put("emailTwo", "TestEmail00022463415527@gmail.com:Password2");
		userMap.put("emailThree", "TestEmail0003463553172@gmail.com:Password3");
		userMap.put("emailFour", "TestEmail0004341655427@gmail.com:Password4");
		userMap.put("emailFive", "TestEmail0005354655172@gmail.com:Password5");
		userMap.put("emailSix", "TestEmail0006617456532@gmail.com:Password6");
		userMap.put("emailSeven", "TestEmail0007356451772@gmail.com:Password7");
		userMap.put("emailEight", "TestEmail0008354657812@gmail.com:Password8");
		userMap.put("emailNine", "TestEmail0009197564532@gmail.com:Password9");
		userMap.put("emailTen", "TestEmail0010013765452@gmail.com:Password10");
		return userMap;
		
	}
	
	public static String getEmail(String role) {
		String email = getEmailMap().get(role);
		return email.split(":")[0];
	}
	
	public static String getPassword(String role) {
		String email = getEmailMap().get(role);
		return email.split(":")[1];
	}
	

	public void LaunchApp() {
		driver.get(Config.getProperty("APP_AUTOMATION_URL"));
		homePageSignIn.click();
	}
	
	public void FirstNewAccount() {
		newAccountEmail.sendKeys(getEmail("emailOne"));
		createButton.click();
	}
	
	public void SecondNewAccount() {
		newAccountEmail.sendKeys(getEmail("emailTwo"));
		createButton.click();
	}
	
	public void ThirdNewAccount() {
		newAccountEmail.sendKeys(getEmail("emailThree"));
		createButton.click();
	}
	
	public void ForthNewAccount() {
		newAccountEmail.sendKeys(getEmail("emailFour"));
		createButton.click();
	}
	
	public void FifthNewAccount() {
		newAccountEmail.sendKeys(getEmail("emailFive"));
		createButton.click();
	}
	
	public void SixthNewAccount() {
		newAccountEmail.sendKeys(getEmail("emailSix"));
		createButton.click();
	}
	
	public void SeventhNewAccount() {
		newAccountEmail.sendKeys(getEmail("emailSeven"));
		createButton.click();
	}
	
	public void EighthNewAccount() {
		newAccountEmail.sendKeys(getEmail("emailEight"));
		createButton.click();
	}
	
	public void NinthNewAccount() {
		newAccountEmail.sendKeys(getEmail("emailNine"));
		createButton.click();
	}
	
	public void TenthNewAccount() {
		newAccountEmail.sendKeys(getEmail("emailTen"));
		createButton.click();
	}
	
	public void FirstAccountInformation() {
		password.sendKeys(getPassword("emailOne"));
		submit.click();
		homePageLogo.click();
	}
	
	public void SecondAccountInformation() {
		password.sendKeys(getPassword("emailTwo"));
		submit.click();
		homePageLogo.click();
	}
	
	public void ThirdAccountInformation() {
		password.sendKeys(getPassword("emailThree"));
		submit.click();
		homePageLogo.click();
	}
	
	public void ForthAccountInformation() {
		password.sendKeys(getPassword("emailFour"));
		submit.click();
		homePageLogo.click();
	}
	
	public void FifthAccountInformation() {
		password.sendKeys(getPassword("emailFive"));
		submit.click();
		homePageLogo.click();
	}
	
	public void SixthAccountInformation() {
		password.sendKeys(getPassword("emailSix"));
		submit.click();
		homePageLogo.click();
	}
	
	public void SeventhAccountInformation() {
		password.sendKeys(getPassword("emailSeven"));
		submit.click();
		homePageLogo.click();
	}
	
	public void EighthAccountInformation() {
		password.sendKeys(getPassword("emailEight"));
		submit.click();
		homePageLogo.click();
	}
	
	public void NinthAccountInformation() {
		password.sendKeys(getPassword("emailNine"));
		submit.click();
		homePageLogo.click();
	}
	
	public void TenthAccountInformation() {
		password.sendKeys(getPassword("emailTen"));
		submit.click();
		homePageLogo.click();
	}
	
	public void GeneralInformation() {
		firstName.sendKeys("Jordan");
		lastName.sendKeys("test");
		
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
	}
	
	public void AddingTwoItems() {
		homeSearchBar.sendKeys("Printed Dress");
		searchBoxButton.click();
		chiffonDress.click();
		addToCartButton.click();
		homePageLogo.click();
		homeSearchBar.sendKeys("Printed Dress");
		searchBoxButton.click();
		summerDress.click();
		addToCartButton.click();
		signoutButton.click();
		
		
	}
		
}
	
	
	
	
	
