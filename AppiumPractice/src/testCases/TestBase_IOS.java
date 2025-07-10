package testCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;


public class TestBase_IOS {

	public static XCUITestOptions options;
	public static IOSDriver driver;
	

	@Parameters({"setUdid","app","platformVersion","url"})
	@BeforeTest
	public void init(String udid, String app, String platformVersion, String appiumUrl) throws MalformedURLException {
		//AppiumServer.start();
		options = new XCUITestOptions();
		options.setUdid(udid);
		options.setApp(app);
		options.setPlatformVersion(platformVersion);
		
		driver = new IOSDriver(new URL(appiumUrl),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		//AppiumServer.stop();
	}
	
	
	public IOSDriver getDriver() {
		return driver;
	}

	
}
