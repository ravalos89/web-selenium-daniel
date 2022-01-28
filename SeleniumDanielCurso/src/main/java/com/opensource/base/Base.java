package com.opensource.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base {
	
	private WebDriver driver;
	
	/*
	 * Constructor WebDriver Abstracto (Polymorphism)
	 * 
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

}
