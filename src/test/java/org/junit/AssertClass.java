package org.junit;

import javax.swing.SortingFocusTraversalPolicy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AssertClass extends Base {
	@Test
	public void tc1() {
		browserLaunch();
		getUrl("https://www.facebook.com/");
		String currentUrl = getCurrentUrl(driver);
		System.out.println(currentUrl);
		boolean contains = currentUrl.contains("www");
		Assert.assertTrue("verify", contains);
		WebElement email = driver.findElement(By.id("email"));
		txtbox(email, "mages");
	
		String attribute = getAttribute(email, "value");
	    Assert.assertEquals("verify username", attribute, "mages");
		//	Assert.assertTrue(message, condition);
		WebElement pass = driver.findElement(By.id("pass"));
		txtbox(pass, "123456789");

	}

	@Test
	public void tc2() {
		Assert.assertTrue(true);
	}

}
