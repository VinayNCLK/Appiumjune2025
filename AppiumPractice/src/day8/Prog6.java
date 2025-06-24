package day8;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.ScreenOrientation;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Prog6 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub


		UiAutomator2Options options = new UiAutomator2Options();
		options.setUdid("emulator-5554");
		options.setAppPackage("com.VPCalculator.VPCalculator");
		options.setAppActivity("com.VPCalculator.VPCalculator.SplashActivity");
		//options.setApp(System.getProperty("user.dir")+"\\apks\\vp-calculator-1-0.apk");
		
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		//io.appium.android.apis/io.appium.android.apis.ApiDemos
		
		
		Thread.sleep(5000);
		driver.toggleAirplaneMode();
		Thread.sleep(5000);
		driver.toggleAirplaneMode();
	}

}
