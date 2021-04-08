package testNG;

import org.testng.annotations.Test;

public class ParallelExecution3 {
	public class TestNgGroupTest1 {

		@Test
		private void tc17() {
			System.out.println("Tc17");
			System.out.println(Thread.currentThread().getId());
		}
		@Test
		private void tc18() {
			System.out.println("Tc18");
			System.out.println(Thread.currentThread().getId());
		}
		@Test
		private void tc19() {
			System.out.println("Tc19");
			System.out.println(Thread.currentThread().getId());
		}

	}
}
