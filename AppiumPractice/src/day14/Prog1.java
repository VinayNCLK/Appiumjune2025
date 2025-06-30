package day14;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.PointerInput.MouseButton;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.Sleeper;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.touch.offset.PointOption;
import utils.Press;
import utils.Scrollable;
import utils.SwitchTo;
import utils.Wait;

public class Prog1 {

	
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		UiAutomator2Options options = new UiAutomator2Options();
		options.setUdid("emulator-5554");
		options.setAppPackage("org.chromium.webview_shell");
		options.setAppActivity("org.chromium.webview_shell.WebViewBrowserActivity");
		//options.setApp(System.getProperty("user.dir")+"\\apks\\DRAGDROP.apk");
		
		//options.setFullReset(true);
		
		//options.setFullReset(false);
		//options.setNoReset(true);
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	
		Wait.waitForPresenceOfElement(AppiumBy.id("org.chromium.webview_shell:id/url_field"), driver, 3000);
		driver.findElement(AppiumBy.id("org.chromium.webview_shell:id/url_field")).clear();
		driver.findElement(AppiumBy.id("org.chromium.webview_shell:id/url_field")).sendKeys("https://google.com");
		
		driver.findElement(AppiumBy.accessibilityId("Load URL")).click();
		
		Thread.sleep(Duration.ofMillis(5000));
		Scrollable.tapOnCoordinates(driver, 183, 2063);
		Thread.sleep(Duration.ofMillis(5000));
		
		
		System.out.println(driver.getContext());
		
		Set<String> contexts = SwitchTo.getAllContexts(driver);
		SwitchTo.switchToWebView(driver, contexts);
		
		driver.findElement(AppiumBy.xpath("//textarea[@name='q']")).sendKeys("cricinfo");
		
		SwitchTo.switchToNative(driver, contexts);
		
		driver.findElement(AppiumBy.id("org.chromium.webview_shell:id/url_field")).clear();
		driver.findElement(AppiumBy.id("org.chromium.webview_shell:id/url_field")).sendKeys("https://facebook.com");
		driver.findElement(AppiumBy.accessibilityId("Load URL")).click();
		
	}

}
