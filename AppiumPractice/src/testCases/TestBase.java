package testCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import utils.AppiumServer;

public class TestBase {

	public static UiAutomator2Options options;
	public static AndroidDriver driver;
	

	@Parameters({"setUdid","appPackage","appActivity","url"})
	@BeforeTest
	public void init(String udid, String appPackage, String appActivity, String appiumUrl) throws MalformedURLException {
		//AppiumServer.start();
		options = new UiAutomator2Options();
		options.setUdid(udid);
		options.setAppPackage(appPackage);
		options.setAppActivity(appActivity);
		//options.setApp(System.getProperty("user.dir")+"\\apks\\DRAGDROP.apk");
		//options.setFullReset(false);
		options.setNoReset(true);
		
		driver = new AndroidDriver(new URL(appiumUrl),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		//AppiumServer.stop();
	}
	
	
	public AndroidDriver getDriver() {
		return driver;
	}

	
}
