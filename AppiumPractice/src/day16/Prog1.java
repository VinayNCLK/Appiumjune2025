package day16;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Prog1 {

	
	@Test
	public void testA() {
		
		String expectedText = "Facebook.com";
		String actualText = "Gmail.com";
		//String actualText = "Facebook.com";
		
		/*if(expectedText.equals(actualText)) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}*/
		try {
			
			Assert.assertEquals(actualText, expectedText, "Test case failed");
			Assert.assertTrue(true, "Test case failed");
			Assert.assertFalse(false, "Test case failed");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Inside catch block for multiple asssertions");
			Assert.fail(e.getMessage());
		}
		
		
	}
	
	
	
}
