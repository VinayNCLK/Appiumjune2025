package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListeners implements ITestListener{

	public void onTestStart(ITestResult result) {
	    // not implemented
		Reporter.log("Test case started");
	  }

	  public void onTestSuccess(ITestResult result) {
	    // not implemented
		  Reporter.log("Test case success");
	  }


	  public void onTestFailure(ITestResult result) {
	    // not implemented
		  System.setProperty("org.uncommons.reportng.escape-output", "false");
		  Reporter.log("Test case failed");
		  Reporter.log("<a href=\"file:///C:/Users/Admin/Downloads/down.png\" target=\"_blank\">click here</a>");
	  }


	  public void onTestSkipped(ITestResult result) {
	    // not implemented
		  Reporter.log("Test case skipped");
	  }


	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }


	  public void onStart(ITestContext context) {
	    // not implemented
	  }

	  public void onFinish(ITestContext context) {
	    // not implemented
	  }
}
