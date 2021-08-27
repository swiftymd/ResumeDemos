package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

protected WebDriver driver = null;
	
	public PageBase(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
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

