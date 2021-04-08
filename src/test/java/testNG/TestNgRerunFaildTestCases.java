package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgRerunFaildTestCases {
	@Test
	private void tc1() {
		Assert.assertTrue(false);
		System.out.println("fail");
	}

	@Test
	private void tc2() {
		Assert.assertTrue(false);
		System.out.println("fail");

	}
}