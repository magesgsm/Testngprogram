package org.junit;

import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({JunitSample1.class,JunitSample2.class})
public class SuiteLevel { 
	public static void main(String[] args) {
		
	org.junit.runner.Result result = JUnitCore.runClasses(SuiteLevel.class);
	int failureCount = result.getFailureCount();
	System.out.println(failureCount);
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
