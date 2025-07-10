package ios;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class Prog2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		
		XCUITestOptions options = new XCUITestOptions();
		options.setUdid("C0B4374F-D53F-4C88-8FC7-AB85B7A3B1D2");
		//options.withBrowserName("safari");
		options.setPlatformVersion("18.5");
		options.setApp("/Users/nammaqa/Library/Developer/Xcode/DerivedData/WebDriverAgent-gxxvxnksededkrddnhflxkctufpg/Build/Products/Debug-iphonesimulator/IntegrationApp.app");
		
		IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
		
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Alerts\"`]")).click();
		driver.findElement(AppiumBy.iOSNsPredicateString("name == \"Create App Alert\" AND label == \"Create App Alert\" AND value == \"Create App Alert\"")).click();
		String alertTxt = driver.findElement(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Should read\"]")).getText();
		System.out.println(alertTxt);
		
		driver.findElement(AppiumBy.accessibilityId("Will do")).click();
		
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Create GPS access Alert\"`]")).click();
		Thread.sleep(5000);
		driver.findElement(AppiumBy.accessibilityId("Allow Once")).click();
	}

}
