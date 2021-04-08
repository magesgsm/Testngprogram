package testNG;

import java.util.Date;

import org.junit.Base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageFactoryAdactin.pageObjectAdactinLoginPage;

public class TestNgSample1 extends Base {

	@BeforeClass
	public void beforclass() {
		browserLaunch();
	}

	@AfterClass
	public void afterclass() {
		driver.quit();
	}

	@BeforeMethod
	public void brforemethod() {
		Date date = new Date();
		System.out.println(date);
	}

	@AfterMethod
	public void aftermethod() {
		Date date = new Date();
		System.out.println(date);
	}

	@Test
	private void loginpagetc1() {
		getUrl("https://adactinhotelapp.com/");
		pageObjectAdactinLoginPage adactinLoginPage=new pageObjectAdactinLoginPage();
		WebElement userNametxt = adactinLoginPage.getUserNametxt();
		txtbox(userNametxt, "mages");
		WebElement passWordttxt = adactinLoginPage.getPassWordttxt();
		txtbox(passWordttxt, "1234qwer");
		

	}

}
