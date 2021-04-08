package org.junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driver;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void txtbox(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void clickbtn(WebElement element) {
		element.click();
	}

	public static void quit(WebDriver driver) {
		driver.quit();
	}

	public void clear(WebElement element) {
		element.clear();
	}

	public String getCurrentUrl(WebDriver driver) {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static String  getAttribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		//System.out.println(attribute);
		return attribute;
		

	}

	public static String  getText(WebElement element) {
		String text = element.getText();
		//System.out.println(text);
		return text;
		
	}

	public String getTagName(WebElement element) {
		String tagName = element.getTagName();
		return tagName;
	}

	public void getWindowHandles(WebDriver driver) {
		driver.getWindowHandles();
	}

	public void getWindowHandle(WebDriver driver) {
		driver.getWindowHandle();
	}

	public void getOptions(WebElement element, String text) {
		new Select(element).getOptions();
	}

	public void getSellectedAllOptions(WebElement element, String text) {
		new Select(element).getOptions();
	}

	public void isEnabled(WebElement element) {
		element.isEnabled();
	}

	public void isDisplayed(WebElement element) {
		element.isDisplayed();
	}

	public void iselected(WebElement element) {
		element.isSelected();
	}

	public void isdesabled(WebElement element) {
		element.isDisplayed();
	}

	public static void selectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public static void selectByValue(WebElement element, String value) {
		Select sc = new Select(element);
		sc.selectByValue(value);
	}

	public static void selectByIndex(WebElement element, int index) {
		Select sc = new Select(element);
		sc.selectByIndex(index);
	}

	public void deselectByValue(WebElement element, String value) {
		Select sc = new Select(element);
		sc.deselectByValue(value);
	}

	public void deselectByValue(WebElement element) {
		new Select(element).getFirstSelectedOption();
	}

	public void navigateBack(WebDriver driver) {
		driver.navigate().back();
	}

	public void navigateRefresh(WebDriver driver) {
		driver.navigate().refresh();
	}

	public void navigateTo(WebDriver driver, String url) {
		driver.navigate().to(url);
	}

	public void navigateForward(WebDriver driver) {
		driver.navigate().forward();
	}

	public void frameSwitchId(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public void frameSwitchString(WebDriver driver, String value) {
		driver.switchTo().frame(value);
	}

	public void build(WebDriver driver) {
		new Actions(driver).build();
	}

	public void doubleclick(WebDriver driver, WebElement element) {
		new Actions(driver).doubleClick(element).perform();
	}

	public void aclick(WebDriver driver) {
		new Actions(driver).click();
	}

	public void contextClick(WebDriver driver, WebElement element) {
		new Actions(driver).contextClick(element).perform();

	}

	public void alertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();

	}

	public void alertDissmiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();

	}

	public String alertGetText(WebDriver driver, String text1) {
		String text = driver.switchTo().alert().getText();
		return text;

	}

	public void alertSendKeys(WebDriver driver, String value) {
		driver.switchTo().alert().sendKeys(value);

	}

	public  String getDataFromExcel(String path, String SheetName, int rownum, int cellnum) throws IOException {
		File file = new File(path);
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		int cellType = cell.getCellType();
		String value=null;
		if (cellType == 1) {
			 value = cell.getStringCellValue();
			

		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			 value = dateFormat.format(dateCellValue);
			
		} else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;
			value = String.valueOf(l);
			

		}
		return value;

	}
	public static void getExcelWrite(String path,String Sheetnum,int rownum,int cellnum,String name) throws IOException {
		File file = new File(path);
		Workbook w = new XSSFWorkbook();
		Sheet sheet = w.createSheet(Sheetnum);
		Row row = sheet.createRow(rownum);
		Cell cell = row.createCell(cellnum);
	
		cell.setCellValue(name);
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		w.write(fileOutputStream);
		
	}
	public static void updateDataFromExcel(String path,String sheetname,int rownum,int cellnum,String attri) throws IOException {
		File file = new File(path);
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		cell.setCellValue(attri);
	/*	if(!cell.equals(atttribute)) {
			cell.setCellValue(atttribute);*/
			
		}
		

	}





