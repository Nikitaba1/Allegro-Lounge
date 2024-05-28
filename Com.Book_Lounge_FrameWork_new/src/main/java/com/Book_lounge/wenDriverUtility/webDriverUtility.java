package com.Book_lounge.wenDriverUtility;
/**
 * @author Vivek
 */
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webDriverUtility { 
	/**
	 * This method is for Implicit wait
	 * @param driver
	 */

	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	/**
	 * This method is used for Explicit wait
	 * @param driver
	 * @param element
	 */

	public void waitForElementPresent(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * This method will wait for the element to be clickable
	 * @param driver
	 * @param element
	 */

	public void waitForElementIsClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		System.out.println("hello");
	}
	/**
	 * This method will switch tab using url
	 * @param driver
	 * @param partialUrl
	 */

	public void switchToTabOnUrl(WebDriver driver, String partialUrl) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> ite = set.iterator();
		while (ite.hasNext()) {
			String windowId = ite.next();
			driver.switchTo().window(windowId);
			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains(partialUrl)) {
				break;
			}
		}
	}
	/**
	 * This method will switch tab using title
	 * @param driver
	 * @param partialTitle
	 */

	public void switchToTabOnTitle(WebDriver driver, String partialTitle) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String windowID = it.next();
			driver.switchTo().window(windowID);
			String actURL = driver.getCurrentUrl();
			if (actURL.contains(partialTitle)) {
				break;
			}
		}
	}
	/**
	 * This method will switch frame using Id
	 * @param driver
	 * @param index
	 */
	public void switchToFrame_Id(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * This method will switch frame using Name
	 * @param driver
	 * @param index
	 */
	public void switchToFrame_Name(WebDriver driver, String name) {
		driver.switchTo().frame(name);
	}
	/**
	 * This method will switch frame using WebElement
	 * @param driver
	 * @param index
	 */
	public void switchToFrame_WebElem(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	/**
	 * This method will accept the alert
	 * @param driver
	 * @param index
	 */
	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
/**
 * This method will cancel the alert
 * @param driver
 */
	public void switchToAlertAndCancel(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
/**
 * This method will select data from dropDown using index
 * @param element
 * @param index
 */
	public void select(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
/**
 * This method will select data from dropDown using visible text
 * @param element
 * @param text
 */
	public void select(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
/**
 * This method will use use mouse over action moveToElement
 * @param element
 */
	public void moveMouseOnELement(WebDriver driver, WebElement element) {
		Actions acti = new Actions(driver);
		acti.moveToElement(element).perform();
	}
/**
 * This method will use use mouse over action doubleClick
 * @param driver
 * @param element
 */
	public void doubleClick(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}

}
