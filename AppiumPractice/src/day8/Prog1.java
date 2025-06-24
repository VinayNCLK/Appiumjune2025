package day8;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Prog1 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub


		UiAutomator2Options options = new UiAutomator2Options();
		options.setUdid("3200742adcad6679");
		options.setAppPackage("com.VPCalculator.VPCalculator");
		options.setAppActivity("com.VPCalculator.VPCalculator.SplashActivity");
		//options.setApp(System.getProperty("user.dir")+"\\apks\\vp-calculator-1-0.apk");
		
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.findElement(AppiumBy.id("com.VPCalculator.VPCalculator:id/editText_first_no")).click();
		driver.findElement(AppiumBy.id("com.VPCalculator.VPCalculator:id/editText_first_no")).sendKeys("10");
		
		driver.findElement(AppiumBy.id("com.VPCalculator.VPCalculator:id/editText_second_no")).click();
		driver.findElement(AppiumBy.id("com.VPCalculator.VPCalculator:id/editText_second_no")).sendKeys("20");
		
		driver.hideKeyboard();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().textContains(\"Calculate\")")).click();
		
		String result = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.VPCalculator.VPCalculator:id/textView_answer\"]")).getText();
		System.out.println("Obtained result is "+result);
	}

}
