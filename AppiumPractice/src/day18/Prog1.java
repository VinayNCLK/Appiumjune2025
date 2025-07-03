package day18;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import listeners.ExtentListeners;

public class Prog1 {

	
	
	@Test(dataProvider = "userDetails")
	public void login(String emailId, String pwd) {
		ExtentListeners.test.log(Status.INFO, "Enter the email id "+emailId);
		ExtentListeners.test.log(Status.INFO, "Enter the Password"+pwd);
		ExtentListeners.test.log(Status.INFO, "Click sigin button");
		ExtentListeners.test.log(Status.INFO, "Landed to the home page successfully");
	}
	
	
	@Test(dataProvider = "userDetail")
	public void doreg(String emailId, String pwd) {
		ExtentListeners.test.log(Status.INFO, "Enter the email id "+emailId);
		ExtentListeners.test.log(Status.INFO, "Enter the Password"+pwd);
		ExtentListeners.test.log(Status.INFO, "Click sigin button");
		ExtentListeners.test.log(Status.INFO, "Landed to the home page successfully");
	}
	
	
	@DataProvider(name="userDetails")
	public Object[][] getData(){
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "abc@gmail.com";
		data[0][1] = "pwd1";
		
		data[1][0] = "cde@gmail.com";
		data[1][1] = "pwd2";
		
		data[2][0] = "efg@gmail.com";
		data[2][1] = "pwd3";
		
		return data;
		
	}
	
	@DataProvider(name="userDetail")
	public Object[][] getData1(){
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "abc@gmail.com";
		data[0][1] = "pwd1";
		
		data[1][0] = "fgh@gmail.com";
		data[1][1] = "pwd2";
		
		data[2][0] = "efg@gmail.com";
		data[2][1] = "pwd3";
		
		return data;
		
	}
	
}
