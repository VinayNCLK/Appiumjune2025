package listeners;

import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.appium.java_client.android.AndroidDriver;
import testCases.TestBase;
import utils.Generic;

public class ExtentListeners implements ITestListener, ISuiteListener{

	public static ExtentTest test; 
	public static ExtentReports extent = ExtentManager.createInstance("extent");
	
	 	public void onTestStart(ITestResult result) {
		    // not implemented
	 		String methodName = result.getMethod().getMethodName();
	 		test = extent.createTest("@Test case - "+methodName.toUpperCase());
		  }


		  public void onTestSuccess(ITestResult result) {
		    // not implemented
			  String methodName = result.getMethod().getMethodName();
			  Markup m = MarkupHelper.createLabel(methodName.toUpperCase()+" PASS", ExtentColor.GREEN);
			  test.pass(m);
		  }


		  public void onTestFailure(ITestResult result) {
		    // not implemented
			  String methodName = result.getMethod().getMethodName();
			  String dateAndTime = Generic.currentDateAndTime();
			  Object currentClass = result.getInstance();
			  AndroidDriver driver = ((TestBase) currentClass).getDriver();
			  Generic.getScreenShot(driver, methodName, dateAndTime);
              Markup m = MarkupHelper.createLabel(methodName.toUpperCase()+" FAIL "+"<a href="+"file:///"+System.getProperty("user.dir")+"\\Screenshots\\"+methodName+dateAndTime+".png"+" target=\"_blank\">click here</a>", ExtentColor.RED);
			  test.fail(m);
		  }

	
		  public void onTestSkipped(ITestResult result) {
		    // not implemented
			  String methodName = result.getMethod().getMethodName();
			  Markup m = MarkupHelper.createLabel(methodName.toUpperCase()+" SKIP", ExtentColor.YELLOW);
			  test.skip(m);
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
			  if(extent !=null) {
				  extent.flush();  
			  }
			  
		  }
}
