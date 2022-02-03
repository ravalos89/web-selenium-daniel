package com.opensource.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class Base {
	
	private WebDriver driver;
	
	/*
	 * Constructor WebDriver Abstracto (Polymorphism)
	 * @author: ricardo.avalos
	 * @param: driver
	 * @return: N/A
	 * @date:
	 * @update
	 */
	public Base(WebDriver driver) {
		this.driver = driver;		
	}
	
	/*
	 * Chrome driver connection
	 */
	public WebDriver chromeDriver() {
		System.setProperty(GlobalVariables.NAME_CHROME_DRIVER, GlobalVariables.PATH_CHROME_DRIVER);
		driver = new ChromeDriver();
		return driver;
	}
	
	/*
	 * Launch browser
	 */
	
	public void launchBrowser(String url) {
		reporterLog("Launching url..."+ url);
		driver.get(url);
		driver.manage().window().maximize();
		implicitWait(5);
	}
	/*
	 * Reporter TestNG log
	 */
	public void reporterLog(String log) {
		Reporter.log(log);
	}
	
	/*
	 * Type
	 */
	public void type(By locator, String input) {
		driver.findElement(locator).sendKeys(input);
	}
	
	/*
	 * Validate object is displayed
	 */
	public boolean isDisplayed(By locator) {
		boolean isDisplayed = driver.findElement(locator).isDisplayed();
		return isDisplayed;
	}
	
	/*
	 * click
	 */
	public void click(By locator)  {
		driver.findElement(locator).click();	
	}
	
	/*
	 * Implicit wait
	 */
	public void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	/*
	 * Explicit wait - Wait for element visible
	 */
	public void waitForElementVisible(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	/*
	 * Get Text from Object
	 */
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	/*
	 * Driver close
	 */
	public void closeBrowser() {
		driver.close();
	}
	
	/*
	 * Hard assertion
	 */
	public void assertEquals(String actual, String expected) {
		try {
			Assert.assertEquals(actual, expected);
		}catch(AssertionError e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Hard assertion
	 */
	public SoftAssert softAssertEquals(String actual, String expected) {
		try {
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(actual, expected);
			return softAssert;
		}catch(AssertionError e) {
			e.printStackTrace();
			return null;
		}
	}

}
