package testNG;

import org.junit.Base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageFactoryAdactin.pageObjectAdactinLoginPage;

public class TestNgParameterTest extends Base {
	@Parameters({"username","password"})
	@Test
	//private void loginpagetc1(@Optional("wert") String s1, @Optional("789456") String s2) {
	private void loginpagetc1(String s1,String s2) {
	browserLaunch();
		getUrl("https://adactinhotelapp.com/");
		pageObjectAdactinLoginPage adactinLoginPage = new pageObjectAdactinLoginPage();
		WebElement userNametxt = adactinLoginPage.getUserNametxt();
		txtbox(userNametxt, s1);
		WebElement passWordttxt = adactinLoginPage.getPassWordttxt();
		txtbox(passWordttxt, s2);
	}
}
