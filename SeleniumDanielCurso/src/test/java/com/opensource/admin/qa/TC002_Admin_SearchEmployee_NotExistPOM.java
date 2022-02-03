package com.opensource.admin.qa;

import org.testng.annotations.Test;

import com.opensource.base.Base;
import com.opensource.base.GlobalVariables;
import com.opensource.poc.Admin;
import com.opensource.poc.Home;
import com.opensource.poc.Login;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class TC002_Admin_SearchEmployee_NotExistPOM {

	WebDriver driver;
	Base base;
	Login login;
	Home home;
	Admin admin;
	String username, password, userInvalid, msgInvalidUser;

	@BeforeTest
	public void beforeTest() {
		// Instanciando objetos
		base = new Base(driver);
		driver = base.chromeDriver();
		login = new Login(driver);
		home = new Home(driver);
		admin = new Admin(driver);

		// Data
		username = "Admin";
		password = "admin123";
		userInvalid = "XYZ";
		msgInvalidUser = "No Records Found";
	}

	@Test
	public void tc002() {

		// Step 1
		base.launchBrowser(GlobalVariables.QA_URL);

		// Step 2 & 3
		login.loginOrange(username, password);

		// Step 4
		home.clickAdmin();

		// Step 5 & 6
		admin.searchUser(userInvalid);

		// Step 7
		admin.validateInvalidMessageFromUsernameTable(msgInvalidUser);

		// Step 8 & 9
		login.logoutOrange();
	}

}
