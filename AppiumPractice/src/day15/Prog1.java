package day15;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Prog1 {

	@Test(priority = 2)
	public void testA() {
		Reporter.log("test A");
	}
	
	@Test()
	public void testB() {
		Reporter.log("test B");
	}
	
	@Test(priority = 2, invocationCount = 2)
	public void testC() {
		Reporter.log("test C");
	}
	
	
}
