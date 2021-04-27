package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestNGCrossBrowser {
	WebDriver driver; 
	@Parameters({"browser"})
	@Test
	private void crossBrowser(String s1) {
		if(s1.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\Java\\JunitPractice\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
		}
		else if(s1.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\Java\\JunitPractice\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			
		}
		else{
			System.setProperty("webdriver.ie.driver","D:\\Java\\JunitPractice\\driver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.get("https://www.facebook.com/");
		
			
		}
	
		
		
		

	}
	

}
