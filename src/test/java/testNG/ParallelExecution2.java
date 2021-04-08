package testNG;

import org.testng.annotations.Test;

public class ParallelExecution2 {
	public class TestNgGroupTest1 {
		@Test
		private void tc14() {
			System.out.println("Tc14");
			System.out.println(Thread.currentThread().getId());
		}
		@Test
		private void tc15() {
			System.out.println("Tc15");
			System.out.println(Thread.currentThread().getId());
		}
		@Test
		private void tc16() {
			System.out.println("Tc16");
			System.out.println(Thread.currentThread().getId());
		}

	}
}
