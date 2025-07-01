package day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Prog2 {

	
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
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(actualText, expectedText, "Test case failed");
			softAssert.assertTrue(true, "Test case failed");
			softAssert.assertFalse(false, "Test case failed");
			
			softAssert.assertAll();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Inside catch block for multiple asssertions");
			Assert.fail(e.getMessage());
		}
		
		
	}
	
	
	
}
