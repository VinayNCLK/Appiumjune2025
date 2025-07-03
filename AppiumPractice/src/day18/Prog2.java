package day18;


import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import listeners.ExtentListeners;

public class Prog2 {

	
	@Test
	public void login() {
		ExtentListeners.test.log(Status.INFO, "Enter the user name");
		ExtentListeners.test.log(Status.INFO, "Enter the Password");
		ExtentListeners.test.log(Status.INFO, "Click sigin button");
		ExtentListeners.test.log(Status.INFO, "Landed to the home page successfully");
	}
	
	@Test
	public void homeDashboard() {
		ExtentListeners.test.log(Status.INFO, "Enter the user name");
		ExtentListeners.test.log(Status.INFO, "Enter the Password");
		ExtentListeners.test.log(Status.INFO, "Click sigin button");
		ExtentListeners.test.log(Status.INFO, "Landed to the home page successfully");
		throw new SkipException("Skip the ExtentListeners.test case");
	}
	
	@Test
	public void doRegistration() {
		ExtentListeners.test.log(Status.INFO, "Enter the user name");
		ExtentListeners.test.log(Status.INFO, "Enter the Password");
		ExtentListeners.test.log(Status.INFO, "Enter Email id");
		ExtentListeners.test.log(Status.INFO, "Click sign up button");
		ExtentListeners.test.log(Status.INFO, "Landed to the home page successfully");
		Assert.fail();
	}
	

}
