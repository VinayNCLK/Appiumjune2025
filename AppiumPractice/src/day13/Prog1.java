package day13;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.PointerInput.MouseButton;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import utils.Press;
import utils.Scrollable;

public class Prog1 {

	
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		UiAutomator2Options options = new UiAutomator2Options();
		options.setUdid("3200742adcad6679");
		options.setAppPackage("com.google.android.apps.fitness");
		options.setAppActivity("com.google.android.apps.fitness.welcome.WelcomeActivity");
		//options.setApp(System.getProperty("user.dir")+"\\apks\\DRAGDROP.apk");
		
		//options.setFullReset(true);
		options.setFullReset(false);
		options.setNoReset(true);
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		Scrollable.swipeUp(1, driver, 2000);
		
		Scrollable.swipeUp(1, driver, 2000);
		
		Scrollable.swipeDown(2, driver, 2000);
	}

}
