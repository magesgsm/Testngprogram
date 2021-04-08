package org.junit;

import java.util.Date;

import org.openqa.selenium.By;

public class JunitSample1 extends Base {
	@BeforeClass
	public static void browserlaunch() {
		browserLaunch();
		//driver.manage().window().maximize();

	}

	/*@Before
	public void startTime() {
		Date date = new Date();
		System.out.println(date);
	}
*/
	// valid username invalid password
	@Test
	public void tc1() {
		getUrl("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("mageswaran");
		driver.findElement(By.id("pass")).sendKeys("741789963");
		//driver.findElement(By.name("login")).click();

	}

	// invalid username valid password
	@Test
	public void tc2() throws InterruptedException {
		//Thread.sleep(5000);
		getUrl("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("raja");
		driver.findElement(By.id("pass")).sendKeys("859596");
		driver.findElement(By.name("login")).click();

	}

	@Ignore
	@Test
	public void tc3() throws InterruptedException {
		//Thread.sleep(5000);
		getUrl("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("guru");
		driver.findElement(By.id("pass")).sendKeys("852741528585");
		driver.findElement(By.name("login")).click();

	}

	@Test
	public void tc4() {
		Assert.assertTrue(true);
	}

	/*@After

	public void endTime() {
		Date date = new Date();
		System.out.println(date);
	}*/

	@AfterClass
	public static void close() {
		// driver.close();
	}

}
