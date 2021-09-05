package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.Config;

public class AutomationSearchPage extends PageBase{

	@FindBy(id = "search_query_top")
	private WebElement homeSearchBar;
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/button")
	private WebElement searchBoxButton;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[1]/span[1]")
	private WebElement chiffonDressStock;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/h5/a")
	private WebElement chiffonDress;
	
	@FindBy(id = "add_to_cart")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")
	private WebElement dressAdded;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
	private WebElement continueShopping;
	
	@FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
	private WebElement homePage;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
	private WebElement summerDressStock;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
	private WebElement summerDress;
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/button")
	private WebElement noResults;
	
	public AutomationSearchPage(WebDriver driver) {
		super(driver);
	}
	
	public void LaunchApp() {
		driver.get(Config.getProperty("APP_AUTOMATION_URL"));
	}
	
	public void chiffon_Dress_Search() {
		homeSearchBar.sendKeys("Printed Dress");
		searchBoxButton.click();
		
		boolean chiffonIsDisplayed = chiffonDressStock.isDisplayed();
		
		if(chiffonIsDisplayed) {
		System.out.println("The chiffon dress is in stock, adding it to cart");
		chiffonDress.click();
		addToCartButton.click();
	}else {
		System.out.println("dress is not in stock");
		driver.quit();
	}
	}
	
	public void Summer_Dress_Search() {
		homeSearchBar.sendKeys("Printed Dress");
		searchBoxButton.click();
		
		boolean summerIsDisplayed = summerDressStock.isDisplayed();
		
		if(summerIsDisplayed) {
			System.out.println("The summer dress is in stock, adding it to cart");
			summerDress.click();
			addToCartButton.click();
			
		}else {
			System.out.println("dress is not in stock");
			
			driver.quit();
		}
	}
	
	public void No_Search_Result() {
		homeSearchBar.sendKeys("Printedd Dress");
		searchBoxButton.click();
		
		boolean isDisplayed = noResults.isDisplayed();
		
		if(isDisplayed) {
			System.out.println("Your Search had zero results...returning to homepage");
			
			driver.get("http://automationpractice.com/index.php");
		}else {
			driver.quit();
		}
		
	}
	
	public void ReturnToMain() {
		driver.get("http://automationpractice.com/index.php");
	}

	


}
