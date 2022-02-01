package com.opensource.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

	/*
	 * Search user
	 */
	public void searchUser(String user) {
		reporterLog("Search username in field Username");
		type(txtSearchUser, user);
		reporterLog("Click Search");
		click(btnSearch);
	}

}
