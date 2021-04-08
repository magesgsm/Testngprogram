package testNG;

import org.testng.annotations.Test;

public class TestNgGroupTest3 {
	@Test(groups="sanity")
	private void tc1() {
System.out.println("Tc111");
	}
	@Test(groups="regression")
	private void tc2() {
		System.out.println("Tc222");
	}
	@Test(groups="smoke")
	private void tc3() {
		System.out.println("Tc333");
	}
	

}
