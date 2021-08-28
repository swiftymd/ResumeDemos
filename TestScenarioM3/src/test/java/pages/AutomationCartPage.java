package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AutomationCartPage extends PageBase{

	@FindBy(id = "search_query_top")
	private WebElement homeSearchBar;
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/button")
	private WebElement searchBoxButton;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
	private WebElement summerDress;
	
	@FindBy(id = "add_to_cart")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")
	private WebElement cartButton;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
	private WebElement proceedToCart;
	
	@FindBy(linkText= "Printed Summer Dress")
	private WebElement nameOfDress;
	
	@FindBy(xpath = "//*[@id=\"cart_quantity_up_5_19_0_0\"]/span")
	private WebElement increaseQuanity;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	private WebElement proccedToCheckout;
	
	@FindBy(xpath = "//*[@id=\"5_19_0_547985\"]")
	private WebElement removeItem;
	
	@FindBy(id = "email")
	private WebElement loginEmail;
	
	@FindBy(id = "passwd")
	private WebElement loginPassword;
	
	@FindBy(id = "SubmitLogin")
	private WebElement loginSubmit;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
	private WebElement proceedingToCheckout;
	
	@FindBy(xpath = "//*[@id=\"cgv\"]")
	private WebElement agreeToTerms;
	
	@FindBy(xpath = "//*[@id=\"form\"]/p/button")
	private WebElement finalCheckoutButton;
	
	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
	private WebElement payByCheckButton;
	
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
	private WebElement paymentConfirmation;
	
	public AutomationCartPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void LaunchApp() {
		driver.get("http://automationpractice.com/index.php");
	
	}
	
	public void AutomationCart() {
		homeSearchBar.sendKeys("Printed Dress");
		searchBoxButton.click();
		
		boolean isDisplayed = summerDress.isDisplayed();
		
		if(isDisplayed) {
			
			System.out.println("The Summer dress is in stock adding it to cart");
			
			summerDress.click();
			addToCartButton.click();
			cartButton.click();
			proceedToCart.click();
			
			
		}else {
			System.out.println("Dress is not in stock...returning to main page");
			
			driver.get("http://automationpractice.com/index.php");
		}
		
		boolean dressIsDisplayed = nameOfDress.isDisplayed();
		
		if(dressIsDisplayed) {
			System.out.println("The dress is in the cart...updating quantity to two");
			
			
			WebElement element = increaseQuanity;
			
			Actions action = new Actions(driver);
			
			action.moveToElement(element).perform();
			action.click(element).perform();
			
			System.out.println("Updated to two dresses...proceeding to checkout");
			
			proccedToCheckout.click();
			
		}else {
			System.out.println("The wrong dress was selected...removing it from cart");
			
			removeItem.click();
			
		}
		
		loginEmail.sendKeys("testSelenium13@gmail.com");
		loginPassword.sendKeys("Password");
		loginSubmit.click();
		
		proceedingToCheckout.click();
		agreeToTerms.click();
		finalCheckoutButton.click();
		payByCheckButton.click();
		paymentConfirmation.click();
		
	}

}
