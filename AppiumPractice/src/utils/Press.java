package utils;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.PointerInput.MouseButton;

import io.appium.java_client.AppiumDriver;

public class Press extends Generic{
	

	public static void doTap(AppiumDriver driver, WebElement element, int duration) {
		
		
		Point sourceElementCenter = getCenterOfElement(element.getLocation(),element.getSize());
		
		Sequence tap = new Sequence(FINGER, 1)
				.addAction(FINGER.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), sourceElementCenter))
				.addAction(FINGER.createPointerDown(MouseButton.LEFT.asArg())).addAction(new Pause(FINGER, Duration.ofMillis(duration)))
				.addAction(FINGER.createPointerUp(MouseButton.LEFT.asArg()));
		
		driver.perform(Arrays.asList(tap));
	}
	
	public static void doLongPress(AppiumDriver driver, WebElement element) {
		
		
		Point sourceElementCenter = getCenterOfElement(element.getLocation(),element.getSize());
		
		Sequence tap = new Sequence(FINGER, 1)
				.addAction(FINGER.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), sourceElementCenter))
				.addAction(FINGER.createPointerDown(MouseButton.LEFT.asArg())).addAction(new Pause(FINGER, Duration.ofMillis(5000)))
				.addAction(FINGER.createPointerUp(MouseButton.LEFT.asArg()));
		
		driver.perform(Arrays.asList(tap));
	}
	
	

}
