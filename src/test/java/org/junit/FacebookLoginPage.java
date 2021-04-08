package org.junit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FacebookLoginPage extends Base{

	public static void main(String[] args) {
		browserLaunch();
		getUrl("https://www.snapdeal.com/");
	List<WebElement> fi = driver.findElements(By.linkText("//a[@class='dp-widget-link hookLink']"));
	fi.get(0).click();
		
	
	}
}
