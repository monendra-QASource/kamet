package com.web.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Element {

	
	
	
	// ------------------Get Element-------------------------
	
	
	public static void hitUrl(String Url){
		WebDriverClass.getDriver().get(Url);
	}
	
	
	/**
	 * Locate element using By
	 * 
	 * @param by : locator to find element
	 * @return WebElement
	 */
	public static WebElement getElement(By by){
	return WebDriverClass.getDriver().findElement(by);	
	}
	
	
	/**
	 * Locate element by ID Locator
	 * 
	 * @param id : ID locator
	 * @return WebElement
	 */
	public static WebElement getElementByID(String id){
		return getElement(By.id(id));
	}
	
	/**
	 * 
	 * Locate element by CSS Locator
	 * 
	 * @param cssLocator : css locator of the WebElement
	 * @return webElement
	 */
	public static WebElement getElementByCSS(String cssLocator){
		return getElement(By.cssSelector(cssLocator));
	}
	
	
	/**
	 * Locate element by XPath Locator
	 * 
	 * @param xpathExpression : XPath locator of the WebElement
	 * @return Webelement
	 */
	public static WebElement getElementByXPath(String xpathExpression){
		return getElement(By.xpath(xpathExpression));
	}
	
	
	/**
	 *  Locate element by Name Locator
	 * @param name : Name Locator of the WebElement
	 * @return WebElement
	 */
	public static WebElement getElementByName(String name){
		return getElement(By.name(name));
	}
	
	
	/**
	 *  Locate element by LinkText
	 * 
	 * @param linkText : Text Displayed on the link
	 * @return WebElement
	 */
	public static WebElement getElementBylinkText(String linkText){
		return getElement(By.linkText(linkText));
	}
	
	/**
	 * Get all elements in a list
	 * 
	 * @param by : By locator to find multiple elements
	 * @return list of WebElements
	 */
	public static List<WebElement> getAllElements(By by){
		return WebDriverClass.getDriver().findElements(by);
	}
	
	
	// ------------------Clicks------------------------------
	
	/**
	 * Click on the element
	 * 
	 * @param webElement : Object of the located element
	 */
	public static void click(WebElement webElement){
		webElement.click();
	}
	
	
	
	/** 
	 * Click on element using By locator
	 * 
	 *  @param by : By locator of the element
	 */
	public static void click(By by){
		getElement(by).click();
	}
	
	
	// ------------------Enter Text----------------------------
	
	/**
	 * Enter text in a text field using any By locator
	 * 
	 * @param by : By locator of the element
	 * @param text : Text to be entered
	 */
	public static void enterText(By by, String text){
		getElement(by).sendKeys(text);
	}
	
	
	/**
	 * Enter text in a text field using element
	 * 
	 * @param webElement : Object of located element
	 * @param text : Text to be entered
	 */
	public static void enterText(WebElement webElement, String text){
		webElement.sendKeys(text);
	}
	
	
	//------------------Hover-----------------------------------
	
	
	/**
	 * Hover over an element
	 * 
	 * @param by : By locator to locate any element
	 */
	public static void hoverOver(By by) {
		    Actions action = new Actions(WebDriverClass.getDriver());
		    action.moveToElement(getElement(by));
		    action.perform();
		}

	
	/**
	 * Hover over an element and click
	 * 
	 * @param webElement : Object of located element
	 */
	public static void hoverClick(WebElement webElement){
		Actions action = new Actions(WebDriverClass.getDriver());
		action.moveToElement(webElement).click().perform();
	}
	
	

	
	//--------------------Booleans---------------------
	
	/**
	 * Verify if element is present
	 * 
	 * @param by : By locator to locate any element
	 * @return true if element is present, false otherwise
	 */
	public static boolean isElementPresent(By by) {
	    try {
	    	WebDriverClass.getDriver().findElement(by);
	        return true;
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	}
	
	/**
	 * Verify if Text is present
	 * 
	 * @param by : By locator to locate any element
	 * @param text : Text to be verified
	 */
	public static boolean isTextPresent(By by, String text){
		return getElement(by).getText().contains(text);
	}
	
	
	
	// ----------------Waits------------------------------
	
	
	/**
	 * Wait for Element to be visible
	 * 
	 * @param by : By locator to locate any element
	 * @return WebElement
	 */
	public static WebElement waitForVisible(By by){
		WebDriverWait wait = new WebDriverWait(WebDriverClass.getDriver(), 10);
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	

}
