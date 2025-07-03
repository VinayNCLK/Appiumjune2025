package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import utils.Generic;

public class ExtentManager {

	
	public static ExtentSparkReporter htmlReporter; //creating html file
	public static ExtentReports extent; //add config, system info, test cases etc..
	public static ExtentTest test; // maintain test cases and to log Pass/Fail/Skip
	
	
	public static ExtentReports createInstance(String fileName) {
		htmlReporter = new ExtentSparkReporter("./reports/"+fileName+Generic.currentDateAndTime()+".html");
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
		return extent;
	}
	
	
}
