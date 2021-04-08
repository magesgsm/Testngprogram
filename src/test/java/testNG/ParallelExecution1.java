package testNG;

import org.testng.annotations.Test;

public class ParallelExecution1 {
	public class TestNgGroupTest1 {
		@Test
		private void tc11() {
			System.out.println("Tc11");
			System.out.println(Thread.currentThread().getId());
		}
		@Test
		private void tc12() {
			System.out.println("Tc12");
			System.out.println(Thread.currentThread().getId());
		}
		@Test
		private void tc13() {
			System.out.println("Tc13");
			System.out.println(Thread.currentThread().getId());
		}

	}
}
