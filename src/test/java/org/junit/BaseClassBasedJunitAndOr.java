package org.junit;

import java.io.Closeable;

import org.openqa.selenium.WebElement;
import org.seleniumhq.jetty9.server.AsyncNCSARequestLog;

import pageObjectClass.PagesObjectFaceBookLogin;

public class BaseClassBasedJunitAndOr extends Base {
	@BeforeClass
	public static void testCase1() {
		browserLaunch();
		
	}
	@Test
	public void testCase2() {
		PagesObjectFaceBookLogin pagesObjectFaceBookLogin=new PagesObjectFaceBookLogin();
		getUrl("https://www.facebook.com/");
		txtbox(pagesObjectFaceBookLogin.getUsernametxt(),"mages");
		txtbox(pagesObjectFaceBookLogin.getPasswordttxt(), "1234567890");
		String attribute = getAttribute(pagesObjectFaceBookLogin.getPasswordttxt(),"value");
		Assert.assertEquals("equals", attribute, "1234567890");
		
		String text = getText(pagesObjectFaceBookLogin.getFacebootext());
		boolean equals = text.equals("Facebook helps you connect and share with the people in your life.");
		Assert.assertTrue(equals);
		clickbtn(pagesObjectFaceBookLogin.getLoginbtn());
		
		
	}
	

}
