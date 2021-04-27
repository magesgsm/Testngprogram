 package org.junit;

import java.util.List;


import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({JunitSample1.class,JunitSample2.class})
public class SuiteLevel { 
	@Test
	public void verifyDeatils() {
	org.junit.runner.Result result = JUnitCore.runClasses(JunitSample1.class,JunitSample2.class);
	int failureCount = result.getFailureCount();
	System.out.println("failurecount is"+failureCount);
	int runCount = result.getRunCount();
	System.out.println(runCount);
	int ignoreCount = result.getIgnoreCount();
	System.out.println(ignoreCount);
	System.out.println(result.getRunTime());
	List<Failure> failures = result.getFailures();
	for (Failure failure : failures) {
		System.out.println(failure);
		
	}
	
	}
	
	
}
