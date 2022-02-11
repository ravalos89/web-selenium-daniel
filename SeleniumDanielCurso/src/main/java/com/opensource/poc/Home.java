package com.opensource.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.Base;

public class Home extends Base{

	public Home(WebDriver driver) {
		super(driver);
	}
	
	// Objects
	By lnkAdmin = By.id("menu_admin_viewAdminModule");
	By lnkPerformance = By.id("menu__Performance");
	
	/*
	 * Click Admin
	 */
	public void clickAdmin() {
		reporterLog("Clicking Admin...");
		click(lnkAdmin);
		screenshot("ClickAdmin");
		implicitWait(5);
	}
	
	/*
	 * Click Performance
	 */
	public void clickPerformance() {
		reporterLog("Clicking Performance...");
		click(lnkPerformance);
	}

}
