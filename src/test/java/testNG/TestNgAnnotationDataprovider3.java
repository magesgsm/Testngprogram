package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Base;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageFactoryAdactin.pageObjectAdactinLoginPage;

public class TestNgAnnotationDataprovider3 extends Base {



	@DataProvider(name ="excel-data")
  	public Object[][] excelDP() throws IOException{
        	//We are creating an object from the excel sheet data by calling a method that reads data from the excel stored locally in our system
        	Object[][] arrObj = getExcelData("D:\\Java\\JunitPractice\\file\\excel.xlsx","Sheet1");
        	return  arrObj;
  	}
  	//This method handles the excel - opens it and reads the data from the respective cells using a for-loop & returns it in the form of a string array
  	public String[][] getExcelData(String fileName, String sheetName){
        	
        	String[][] data = null;   	
  	  	try
  	  	{
  	   	FileInputStream fis = new FileInputStream(fileName);
  	   	XSSFWorkbook wb = new XSSFWorkbook(fis);
  	   	XSSFSheet sh = wb.getSheet(sheetName);
  	   	XSSFRow row = sh.getRow(0);
  	   	int noOfRows = sh.getPhysicalNumberOfRows();
  	   	int noOfCols = row.getLastCellNum();
  	   	Cell cell;
  	   	data = new String[noOfRows][noOfCols];
  	   	for(int i =0; i<noOfRows;i++){
  		     for(int j=0;j<noOfCols;j++){
  		    	   row = sh.getRow(i);
  		    	   cell= row.getCell(j);
  		    	   data[i][j] = cell.getStringCellValue();
  	   	 	   }
  	   	}
  	  	}
  	  	catch (Exception e) {
  	     	   System.out.println("The exception is: " +e.getMessage());
  	     	           	}
        	return data;
  	}
	@Test(dataProvider = "excel-data")
	public void test1(String s1, String s2) {
		browserLaunch();
		pageObjectAdactinLoginPage adactinLoginPage = new pageObjectAdactinLoginPage();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		getUrl("https://adactinhotelapp.com/");
		txtbox(adactinLoginPage.getUserNametxt(), s1);
		txtbox(adactinLoginPage.getPassWordttxt(), s2);
	//	clickbtn(adactinLoginPage.getLoginbtn());

	}
}


