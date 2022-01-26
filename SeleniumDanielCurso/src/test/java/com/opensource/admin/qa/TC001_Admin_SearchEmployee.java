package com.opensource.admin.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.opensource.base.GlobalVariables;

public class TC001_Admin_SearchEmployee {
	
	private static String MAIN_USER = "Admin";
	private static String MAIN_PWD = "admin123";

	@Test
	public void tc001() {
		
		SoftAssert softAssert = new SoftAssert();

		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");
		System.setProperty(GlobalVariables.NAME_CHROME_DRIVER, GlobalVariables.PATH_CHROME_DRIVER);
		WebDriver driver = new ChromeDriver();
		driver.get(GlobalVariables.QA_URL);
		driver.manage().window().maximize();
		
		// Step 2 
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(MAIN_USER);
		driver.findElement(By.id("txtPassword")).sendKeys(MAIN_PWD);
		boolean isBtnLogindisplayed = driver.findElement(By.id("btnLogin")).isDisplayed();
		softAssert.assertTrue(isBtnLogindisplayed); // SOFTASSERTION #1
		
//		// Suma
//		int num1 = 1;
//		int num2 = 1;
//		int suma = 3;
//		boolean isEqual;
//		if((num1+num2)==suma) {
//			isEqual=true;
//		}else {
//			isEqual=false;
//		}
		
//		softAssert.assertTrue(isEqual);//Softassertion #3
		
		driver.findElement(By.id("btnLogin")).click();
		// IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		// EXPLICIT WAIT
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("welcome")));
		
		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Step 5
		Reporter.log("Search username in field \"Username\"");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(MAIN_USER);
		
		// Step 6
		Reporter.log("Click Search");
		driver.findElement(By.id("searchBtn")).click();
		
		// Step 7 
		Reporter.log("Verify username exist in table");
		String actualValue = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		Assert.assertEquals(actualValue, MAIN_USER); // HARD ASSERTION
		
		softAssert.assertEquals(actualValue, MAIN_USER); // SOFT ASSERTION #2
		
		// Step 8
		Reporter.log("Log out");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[@href=\"/index.php/auth/logout\"]")).click();
		
		// Step 9
		Reporter.log("Close Browser");
		driver.close();
		
		softAssert.assertAll(); // Sirve para indicar que se corran los assertions previos
		

		
	}
}
