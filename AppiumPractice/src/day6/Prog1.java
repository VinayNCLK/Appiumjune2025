package day6;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Prog1 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setUdid("emulator-5554");
		options.setAppPackage("com.google.android.dialer");
		options.setAppActivity("com.google.android.dialer.extensions.GoogleDialtactsActivity");
		
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.findElement(AppiumBy.accessibilityId("key pad")).click();
		
		driver.findElement(AppiumBy.id("com.google.android.dialer:id/one")).click();
		
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"2,ABC\"]")).click();
		driver.findElement(AppiumBy.accessibilityId("3,DEF")).click();
	
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceIdMatches(\"com.google.android.dialer:id/search_action_text\").index(1).instance(0)")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().textContains(\"First name\")")).sendKeys("Test");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Last name\"]")).sendKeys("User");
		driver.findElement(AppiumBy.xpath("//android.widget.Spinner[@content-desc=\"Phone\"]")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().textContains(\"Home\").resourceIdMatches(\"android:id/text1\").index(1).instance(0)")).click();
		
		driver.hideKeyboard();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().textContains(\"Email\")")).sendKeys("abc@gmail.com");
		driver.findElement(AppiumBy.id("com.android.contacts:id/editor_menu_save_button")).click();
		
		
	}

}
