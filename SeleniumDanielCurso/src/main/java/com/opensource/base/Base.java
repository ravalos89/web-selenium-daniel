package com.opensource.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class Base {
	
	private WebDriver driver;
	File fileFolderCreation;
	
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
		screenshot("OpenedBrowser");
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
		screenshot("click"+locator);
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
	
	/**
	 * Get Data from JSON file (Directly)
	 * 
	 * @author Ricardo Avalos
	 * @param jsonFile, jsonKey
	 * @return jsonValue
	 * @throws FileNotFoundException
	 */
	public String getJSONData(String jsonFileObj, String jsonKey) throws FileNotFoundException {
		try {

			// JSON Data
			InputStream inputStream = new FileInputStream(GlobalVariables.PATH_JSON_DATA + jsonFileObj + ".json");
			JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));

			// Get Data
			String jsonValue = (String) jsonObject.get(jsonKey);
			return jsonValue;

		} catch (FileNotFoundException e) {
			Assert.fail("JSON file is not found");
			return null;
		}
	}
	
	/*
	 * Get Value from Excel
	 * @author Ricardo Avalos 
	 * @date 02/18/2019
	 */
	public String getCellData(String excelName, int row, int column) {
		try {
			// Reading Data
			FileInputStream fis = new FileInputStream(GlobalVariables.PATH_EXCEL_DATA+excelName+".xlsx");
			// Constructs an XSSFWorkbook object
			@SuppressWarnings("resource")
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheetAt(0);
			Row rowObj = sheet.getRow(row);
			Cell cell = rowObj.getCell(column);
			String value = cell.getStringCellValue();
			return value;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e1) {
			e1.printStackTrace();
			return null;
		}
	}
	
	/*
	 * Take screenshot creating new folder
	 * 
	 * @author Ricardo Avalos
	 * @throws IOException
	 */
	public String screenshot(String fileName, boolean isTaked){
		try {
			if(!fileFolderCreation.exists()) {
				fileFolderCreation.mkdirs(); // or file.mkdir()
			}
			String absolutePath = fileFolderCreation.getAbsolutePath()+"/";
			String pathFileName= absolutePath + fileName + ".png";
			Screenshot screenshot = new AShot().takeScreenshot(driver);
			ImageIO.write(screenshot.getImage(), "PNG", new File(pathFileName));
			return pathFileName;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

	}
	
	/*
	 * Take screenshot
	 * 
	 * @author Ricardo Avalos
	 * @throws IOException
	 */
	public String screenshot(String fileName){
		try {
			String pathFileName= GlobalVariables.PATH_SCREENSHOTS + fileName + ".png";
			Screenshot screenshot = new AShot().takeScreenshot(driver);
			ImageIO.write(screenshot.getImage(), "PNG", new File(pathFileName));
			return pathFileName;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

	}

}
