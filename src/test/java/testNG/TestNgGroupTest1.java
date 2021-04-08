package testNG;

import org.testng.annotations.Test;

public class TestNgGroupTest1 {
	@Test(groups="sanity")
	private void tc1() {
System.out.println("Tc1");
	}
	@Test(groups="regression")
	private void tc2() {
		System.out.println("Tc2");
	}
	@Test(groups="smoke")
	private void tc3() {
		System.out.println("Tc3");
	}
	

}
