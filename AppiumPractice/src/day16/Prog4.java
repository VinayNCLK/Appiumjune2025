package day16;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Prog4 {

	
	@Test(priority = 1)
	public void testA() {
		System.out.println("Test A");
		
	}
	
	
	@Test(priority = 2)
	public void testB() {
		System.out.println("Test B");
		Assert.fail("Test case A failed");
		
	}
	
	
	@Test(priority = 3)
	public void testC() {
		System.out.println("Test C");
		throw new SkipException("Test case c skipped");
	}
	
	
	
	
}
