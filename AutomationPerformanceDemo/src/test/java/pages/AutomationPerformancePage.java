package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import core.Config;

public class AutomationPerformancePage extends PageBase{

	@FindBy(id = "search_query_top")
	private WebElement searchBar;
	
	@FindBy(xpath = "//*[@id='searchbox']/button")
	private WebElement searchButton;
	
	@FindBy(id = "selectProductSort")
	private WebElement filterButton;
	
	@FindBy(linkText = "Specials")
	private WebElement specialsLink;
	
	@FindBy(xpath = "//*[@id=\"list\"]/a/i")
	private WebElement listLayout;
	
	@FindBy(xpath = "//*[@id='header']/div[3]/div/div/div[3]/div/a")
	private WebElement cartButton;
	
	@FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
	private WebElement storeLogo;
	
	public AutomationPerformancePage(WebDriver driver) {
		super(driver);
		
	}
	
	public void LaunchApp() {
		driver.get(Config.getProperty("APP_AUTOMATION_URL"));
	
	}
	
	public void PerformanceTesting() {
		searchBar.sendKeys("Dress");
		searchButton.click();
		
		Select sel = new Select(filterButton);
		sel.selectByVisibleText("Product Name: A to Z");
		
		listLayout.click();
		specialsLink.click();
		cartButton.click();
		storeLogo.click();
		
	}
	
}
