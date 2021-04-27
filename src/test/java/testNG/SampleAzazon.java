package testNG;

import org.junit.Base;
import org.testng.annotations.Test;

public class SampleAzazon extends Base{
	@Test
	private void testcase1() {
		browserLaunch();
		getUrl("https://www.amazon.in/");
		

	}
	
	

}
