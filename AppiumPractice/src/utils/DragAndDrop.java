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

public class DragAndDrop extends Generic{
	
	public static void dragAndDrop(AppiumDriver driver, WebElement source, WebElement destination) {
		
		
		Point sourceElementCenter = getCenterOfElement(source.getLocation(),source.getSize());
		Point destinationElementCenter = getCenterOfElement(destination.getLocation(),destination.getSize());
		
		Sequence drag = new Sequence(FINGER, 1)
				.addAction(FINGER.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), sourceElementCenter))
				.addAction(FINGER.createPointerDown(MouseButton.LEFT.asArg())).addAction(new Pause(FINGER, Duration.ofMillis(5000)))
				.addAction(FINGER.createPointerMove(Duration.ofMillis(5000), PointerInput.Origin.viewport(), destinationElementCenter))
				.addAction(FINGER.createPointerUp(MouseButton.LEFT.asArg()));
		
		driver.perform(Arrays.asList(drag));
	}

}
