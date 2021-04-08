package testNG;

import org.testng.annotations.Test;

public class TestNgGroupTest2 {
	@Test(groups="sanity")
	private void tc1() {
System.out.println("Tc11");
	}
	@Test(groups="regression")
	private void tc2() {
		System.out.println("Tc22");
	}
	@Test(groups="smoke")
	private void tc3() {
		System.out.println("Tc33");
	}
	

}
