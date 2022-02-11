package com.opensource.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.Base;

public class Login extends Base{

	/*
	 * Constructor instantiate Superclass
	 */
	public Login(WebDriver driver) {
		super(driver);
	}
	
	// Objects
	By txtUsername = By.id("txtUsername");
	By txtPassword = By.id("txtPassword");
	By btnLogin = By.id("btnLogin");
	By btnWelcome = By.id("welcome");
	By btnlogout = By.xpath("//a[@href='/index.php/auth/logout']");
	
	// Method customize
	
	/*
	 * Login
	 */
	public void loginOrange(String username, String password) {
		reporterLog("Login into Orange app using credentials USERNAME:"+username+ " PASSWORD:"+password);
		type(txtUsername, username);
		type(txtPassword, password);
		screenshot("EnteringCredentials");
		click(btnLogin);
		implicitWait(5);
		waitForElementVisible(btnWelcome);
		screenshot("LoggedSuccess");
		reporterLog("User is logged successfully");
	}
	
	/*
	 * Logout
	 */
	public void logoutOrange() {
		reporterLog("Logout from Orange app");
		click(btnWelcome);
		click(btnlogout);
		screenshot("LoggedOut");
		closeBrowser();
	}

}
