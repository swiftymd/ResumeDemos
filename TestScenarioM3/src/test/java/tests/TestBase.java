package tests;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;




public class TestBase {
	
	protected WebDriver driver = null;
	
	
	@BeforeClass(alwaysRun=true)
	public void initDriver() throws InterruptedException {


		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jordan\\Desktop\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		Thread.sleep(1000);
	}
	
	@AfterClass(alwaysRun=true)
	public void tearDown() {
		driver.quit();
		
	}
	
	public WebDriver driver() {
		return driver;
	}

	
	public boolean ifElementDisplayed(By element) {
		try {
			return waitForElement(2,driver.findElement(element)).isDisplayed();
		}catch(NoSuchElementException e) {}
		return false;
	}
	
	public Alert waitForAlert(long time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		return wait.ignoring(NoAlertPresentException.class)
		.pollingEvery(Duration.ofSeconds(1))
		.until(ExpectedConditions.alertIsPresent());
	}
	
	public WebElement waitForElement(long time, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		return wait.ignoring(NoSuchElementException.class)
		.pollingEvery(Duration.ofSeconds(1))
		.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public List<WebElement> waitForElements(long time, List<WebElement> elements) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		return wait.ignoring(NoSuchElementException.class)
		.pollingEvery(Duration.ofSeconds(1))
		.until(ExpectedConditions.visibilityOfAllElements(elements));
	}
	

}