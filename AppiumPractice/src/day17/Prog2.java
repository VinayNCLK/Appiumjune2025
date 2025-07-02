package day17;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import utils.Generic;

public class Prog2 {

	
	public ExtentSparkReporter htmlReporter; //creating html file
	public ExtentReports extent; //add config, system info, test cases etc..
	public ExtentTest test; // maintain test cases and to log Pass/Fail/Skip
	
	
	@BeforeTest
	public void setReport() {
		
		 
		    
		htmlReporter = new ExtentSparkReporter("./reports/extent"+Generic.currentDateAndTime()+".html");
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
		//test.pass("Login test case passed");
	}
	
	@Test
	public void homeDashboard() {
		test = extent.createTest("home dashboard test");
		test.log(Status.INFO, "Enter the user name");
		test.log(Status.INFO, "Enter the Password");
		test.log(Status.INFO, "Click sigin button");
		test.log(Status.INFO, "Landed to the home page successfully");
		//test.skip("home dashboard test case skipped");
		throw new SkipException("Skip the test case");
	}
	
	@Test
	public void doRegistration() {
		test = extent.createTest("Do Registration");
		test.log(Status.INFO, "Enter the user name");
		test.log(Status.INFO, "Enter the Password");
		test.log(Status.INFO, "Enter Email id");
		test.log(Status.INFO, "Click sign up button");
		test.log(Status.INFO, "Landed to the home page successfully");
		//test.fail("Do Registration test case failed");
		Assert.fail();
	}
	
	
	
	@AfterMethod
	public void updateTestResults(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE) {
			//test.fail("Test case failed");
			String methodName = result.getMethod().getMethodName();
			
			WebDriver driver = new ChromeDriver();
			// Navigate to the testim website
			driver.get("https://www.testim.io/");
			//Use TakesScreenshot method to capture screenshot
			String dateAndTime = Generic.currentDateAndTime();
			Generic.getScreenShot(driver, methodName, dateAndTime);
			//driver.quit();
			
			Markup m = MarkupHelper.createLabel(methodName.toUpperCase()+" FAIL "+"<a href="+"file:///"+System.getProperty("user.dir")+"\\Screenshots\\"+methodName+dateAndTime+".png"+" target=\"_blank\">click here</a>", ExtentColor.RED);
			
			test.fail(m);
		}
		else if (result.getStatus() == ITestResult.SUCCESS) {
			//test.pass("Test case passed");
			String methodName = result.getMethod().getMethodName();
			Markup m = MarkupHelper.createLabel(methodName.toUpperCase()+" PASS", ExtentColor.GREEN);
			test.pass(m);
		}
		else if (result.getStatus() == ITestResult.SKIP) {
			//test.skip("Test case skipped");
			String methodName = result.getMethod().getMethodName();
			Markup m = MarkupHelper.createLabel(methodName.toUpperCase()+" SKIP", ExtentColor.YELLOW);
			test.skip(m);
		}
		
	}
	
	
	
	@AfterTest
	public void endReport() {
		extent.flush();
	}
	
	
	
}
