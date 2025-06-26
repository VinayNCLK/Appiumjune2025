package utils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class Scrollable extends Generic{

	
	public static void scrollToText(String text, AppiumDriver driver) {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))"));
	}
	
	public static void scrollToTextAndClick(String text, AppiumDriver driver) {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))")).click();
	}
	
	public static void scrollToTextAndClear(String text, AppiumDriver driver) {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))")).clear();
	}
}
