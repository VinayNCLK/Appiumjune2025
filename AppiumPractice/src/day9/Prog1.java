package day9;


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

public class Prog1 {

	
	private final static PointerInput FINGER = new PointerInput(Kind.TOUCH, "finger");
	
	public static Point getCenterOfElement(Point location, Dimension size) {
		return new Point(location.getX()+size.getWidth()/2,location.getY()+size.getHeight()/2);
	}
	
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		UiAutomator2Options options = new UiAutomator2Options();
		options.setUdid("emulator-5554");
		options.setAppPackage("com.mobeta.android.demodslv");
		options.setAppActivity("com.mobeta.android.demodslv.Launcher");
		//options.setApp(System.getProperty("user.dir")+"\\apks\\DRAGDROP.apk");
		
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().textContains(\"Continue\")")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().textContains(\"OK\")")).click();
		
		
		
		List<WebElement> li = driver.findElements(AppiumBy.id("com.mobeta.android.demodslv:id/activity_title"));
		
		for(WebElement rowHeaders : li) {
			System.out.println(rowHeaders.getText());
			if(rowHeaders.getText().contains("Basic usage playground")) {
				rowHeaders.click();
				break;
			}
		}
		
		WebElement source = driver.findElement(AppiumBy.xpath("(//android.widget.ImageView[@resource-id=\"com.mobeta.android.demodslv:id/drag_handle\"])[1]"));
		WebElement destination = driver.findElement(AppiumBy.xpath("(//android.widget.ImageView[@resource-id=\"com.mobeta.android.demodslv:id/drag_handle\"])[8]"));
		
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
