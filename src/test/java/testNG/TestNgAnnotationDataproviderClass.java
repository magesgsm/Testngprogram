package testNG;

import org.junit.Base;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageFactoryAdactin.pageObjectAdactinLoginPage;

public class TestNgAnnotationDataproviderClass extends Base {

	@Test(dataProvider = "sampledata",dataProviderClass=TestNgAnnotationDataprovider.class)
	public void test1(String s1, String s2) {
		browserLaunch();
		pageObjectAdactinLoginPage adactinLoginPage = new pageObjectAdactinLoginPage();
		getUrl("https://adactinhotelapp.com/");
		txtbox(adactinLoginPage.getUserNametxt(), s1);
		txtbox(adactinLoginPage.getPassWordttxt(), s2);
		clickbtn(adactinLoginPage.getLoginbtn());

	}

}


