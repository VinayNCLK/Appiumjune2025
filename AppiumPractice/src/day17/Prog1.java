package day17;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Prog1 {

	
	public ExtentSparkReporter htmlReporter; //creating html file
	public ExtentReports extent; //add config, system info, test cases etc..
	public ExtentTest test; // maintain test cases and to log Pass/Fail/Skip
	
	
	@BeforeTest
	public void setReport() {
		
		htmlReporter = new ExtentSparkReporter("./reports/extent.html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Appium Report");
		htmlReporter.config().setReportName("Automation framework test results");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Product owner", "ABC");
		extent.setSystemInfo("Automation Lead", "CDE");
		extent.setSystemInfo("Automation Tester", "EDF");
		extent.setSystemInfo("Build Number", "123");
		extent.setSystemInfo("Organization", "XYZ");
	}
	
	@Test
	public void login() {
		test = extent.createTest("Login test");
		test.log(Status.INFO, "Enter the user name");
		test.log(Status.INFO, "Enter the Password");
		test.log(Status.INFO, "Click sigin button");
		test.log(Status.INFO, "Landed to the home page successfully");
		test.pass("Login test case passed");
	}
	
	@Test
	public void homeDashboard() {
		test = extent.createTest("home dashboard test");
		test.log(Status.INFO, "Enter the user name");
		test.log(Status.INFO, "Enter the Password");
		test.log(Status.INFO, "Click sigin button");
		test.log(Status.INFO, "Landed to the home page successfully");
		test.skip("home dashboard test case skipped");
	}
	
	@Test
	public void doRegistration() {
		test = extent.createTest("Do Registration");
		test.log(Status.INFO, "Enter the user name");
		test.log(Status.INFO, "Enter the Password");
		test.log(Status.INFO, "Enter Email id");
		test.log(Status.INFO, "Click sign up button");
		test.log(Status.INFO, "Landed to the home page successfully");
		test.fail("Do Registration test case failed");
	}
	
	
	
	
	@AfterTest
	public void endReport() {
		extent.flush();
	}
	
	
	
}
