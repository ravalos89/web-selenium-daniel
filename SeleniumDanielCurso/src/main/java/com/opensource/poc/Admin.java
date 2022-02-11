package com.opensource.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.opensource.base.Base;

public class Admin extends Base {

	public Admin(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Objects
	By txtSearchUser = By.id("searchSystemUser_userName");
	By btnSearch = By.id("searchBtn");
	By tblUsers = By.xpath("//tbody/tr[1]/td[2]");
	By tblNorecords = By.xpath("//tbody/tr");

	/*
	 * Search user
	 */
	public void searchUser(String user) {
		reporterLog("Search username in field Username");
		type(txtSearchUser, user);
		screenshot("EnterUser"+user);
		reporterLog("Click Search");
		click(btnSearch);
		screenshot("AfterSearch"+user);
	}
	
	/*
	 * Validar dato en la tabla de username
	 * @author: ricardo.avalos
	 * @date
	 */
	public void validateValueinUsernameTable(String expectedValue) {
		reporterLog("Validate "+expectedValue + " in username table");
		String getActualValue= getText(tblUsers);
		screenshot("ValidateUserTable");
		Assert.assertEquals(getActualValue, expectedValue);
	}
	
	/*
	 * Validar dato en la tabla de username
	 * @author: ricardo.avalos
	 * @date
	 */
	public void validateInvalidMessageFromUsernameTable(String expectedValue) {
		reporterLog("Validate "+expectedValue + " in username table");
		String getActualValue= getText(tblNorecords);
		Assert.assertEquals(getActualValue, expectedValue);
	}

}
