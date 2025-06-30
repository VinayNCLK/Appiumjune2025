package utils;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.PointerInput.MouseButton;
import org.openqa.selenium.interactions.PointerInput.Origin;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

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
	
	
	public static void doSwipe(AppiumDriver driver, Point start, Point end, int duration) {
		Sequence swipe = new Sequence(FINGER, 1)
				.addAction(FINGER.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), start.getX(), start.getY()))
				.addAction(FINGER.createPointerDown(MouseButton.LEFT.asArg())).addAction(new Pause(FINGER, Duration.ofMillis(duration)))
				.addAction(FINGER.createPointerMove(Duration.ofMillis(5000), PointerInput.Origin.viewport(), end.getX(), end.getY()))
				.addAction(FINGER.createPointerUp(MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(swipe));
	}
	
	
	public static void swipeUp(int numberOfTimes, AppiumDriver driver, int duration) throws InterruptedException {
		Dimension dimension = driver.manage().window().getSize();
		Point start = new Point((int)(dimension.width * 0.6), (int)(dimension.height * 0.7));
		Point end = new Point((int)(dimension.width * 0.2), (int)(dimension.height * 0.2));
		for(int i=0;i<numberOfTimes;i++) {
			Thread.sleep(3000);
			doSwipe(driver, start, end, duration);
		}
	}
	
	public static void swipeDown(int numberOfTimes, AppiumDriver driver, int duration) throws InterruptedException {
		Dimension dimension = driver.manage().window().getSize();
		Point start = new Point((int)(dimension.width * 0.2), (int)(dimension.height * 0.2));
		Point end = new Point((int)(dimension.width * 0.6), (int)(dimension.height * 0.7));
		for(int i=0;i<numberOfTimes;i++) {
			Thread.sleep(3000);
			doSwipe(driver, start, end, duration);
		}
	}
	
	public static void swipeLeft(int numberOfTimes, AppiumDriver driver, int duration) throws InterruptedException {
		Dimension dimension = driver.manage().window().getSize();
		Point start = new Point((int)(dimension.width * 0.8), (int)(dimension.height * 0.5));
		Point end = new Point((int)(dimension.width * 0.2), (int)(dimension.height * 0.5));
		for(int i=0;i<numberOfTimes;i++) {
			Thread.sleep(3000);
			doSwipe(driver, start, end, duration);
		}
	}
	
	public static void swipeRight(int numberOfTimes, AppiumDriver driver, int duration) throws InterruptedException {
		Dimension dimension = driver.manage().window().getSize();
		Point start = new Point((int)(dimension.width * 0.2), (int)(dimension.height * 0.5));
		Point end = new Point((int)(dimension.width * 0.8), (int)(dimension.height * 0.5));
		for(int i=0;i<numberOfTimes;i++) {
			Thread.sleep(3000);
			doSwipe(driver, start, end, duration);
		}
	}
	
	
	public static void tapOnCoordinates(AppiumDriver driver, int pointA_X, int pointA_Y) {
		Sequence clickPosition = new Sequence(FINGER, 1);
		clickPosition .addAction(FINGER.createPointerMove(Duration.ZERO, Origin.viewport(), pointA_X,pointA_Y)) 
		.addAction(FINGER.createPointerDown(MouseButton.LEFT.asArg())) 
		.addAction(FINGER.createPointerUp(MouseButton.LEFT.asArg())); 
		driver.perform(Arrays.asList(clickPosition));	
	}
}
	
