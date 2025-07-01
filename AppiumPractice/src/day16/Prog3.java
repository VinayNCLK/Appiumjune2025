package day16;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Prog3 {

	
	@Test(priority = 1)
	public void testA() {
		System.out.println("Test A");
		Assert.fail("Test case A failed");
	}
	
	
	@Test(priority = 2, dependsOnMethods = "testA")
	public void testB() {
		System.out.println("Test B");
	}
	
	
	
	
}
