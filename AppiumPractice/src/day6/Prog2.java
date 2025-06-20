package day6;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Prog2 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setUdid("3200742adcad6679");
		options.setAppPackage("com.sec.android.app.popupcalculator");
		options.setAppActivity("com.sec.android.app.popupcalculator.Calculator");
		
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
				
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"1\"]")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().textContains(\"+\").index(1).instance(0)")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"3\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"=\"]")).click();
		
		
	}

}
