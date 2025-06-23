package day7;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Prog2 {
	
	
	

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setUdid("3200742adcad6679");
		options.setAppPackage("com.samsung.android.calendar");
		options.setAppActivity("com.samsung.android.app.calendar.activity.MainActivity");
		
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		
		 Date dNow = new Date( );
	     SimpleDateFormat ft = new SimpleDateFormat ("yyyy-M-dd");
	     driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\" \" and @text=\""+ft.format(dNow)+"\"]")).click();
	     driver.findElement(AppiumBy.id("com.samsung.android.calendar:id/title")).sendKeys("Birthday");
	     driver.findElement(AppiumBy.id("com.samsung.android.calendar:id/start_date_time")).click();
	     

	     driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.samsung.android.calendar:id/numberpicker_input\" and @text=\"9, Hour\"]")).click();
	     driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.samsung.android.calendar:id/numberpicker_input\" and @text=\"9, Hour\"]")).clear();
	     
	     driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.samsung.android.calendar:id/numberpicker_input\" and @text=\", Hour\"]")).sendKeys("10");
		
	     
	     driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.samsung.android.calendar:id/numberpicker_input\" and @text=\"00, Minute\"]")).click();
	     driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.samsung.android.calendar:id/numberpicker_input\" and @text=\"00, Minute\"]")).clear();
	     
	     driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.samsung.android.calendar:id/numberpicker_input\" and @text=\", Minute\"]")).sendKeys("50");
		
	     driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"PM, , \"]")).click();
	     
	     driver.hideKeyboard();
	     
	     driver.findElement(AppiumBy.accessibilityId("Add alert")).click();
	     driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"1 hour before\"]")).click();
	     driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
	     driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().textContains(\"Save\")")).click();
	}

}
