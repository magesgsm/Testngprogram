package testNG;

import org.junit.Base;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageFactoryAdactin.pageObjectAdactinLoginPage;

public class TestNgDataInvocationCount extends Base {
	
	@BeforeClass
	private void browserlaunch() {
		browserLaunch();
	}
		
	@Test(invocationCount=3)
	private void test1() {
	
		pageObjectAdactinLoginPage adactinLoginPage=new pageObjectAdactinLoginPage();
		getUrl("https://adactinhotelapp.com/");
		txtbox(adactinLoginPage.getUserNametxt(), "mages");
		txtbox(adactinLoginPage.getPassWordttxt(), "wertyui");
		clickbtn(adactinLoginPage.getLoginbtn());

	}
	@Test(enabled=false)
	private void test4() {

	}
	@Test(priority=-1,enabled=false)
	private void test3() {

	}
	@Test(priority=2)
	private void test5() {

	}
	@Test(priority=3)
	private void test2() {

	}
	

}
