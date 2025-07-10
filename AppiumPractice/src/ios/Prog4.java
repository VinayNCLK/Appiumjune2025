package ios;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class Prog4 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		
		XCUITestOptions options = new XCUITestOptions();
		options.setUdid("C0B4374F-D53F-4C88-8FC7-AB85B7A3B1D2");
		//options.withBrowserName("safari");
		options.setPlatformVersion("18.5");
		options.setApp("/Users/nammaqa/Library/Developer/Xcode/DerivedData/WebDriverAgent-gxxvxnksededkrddnhflxkctufpg/Build/Products/Debug-iphonesimulator/IntegrationApp.app");
		
		IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
		
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Scrolling\"`]")).click();
		driver.findElement(AppiumBy.iOSNsPredicateString("name == \"TableView\" AND label == \"TableView\" AND value == \"TableView\"")).click();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		js.executeScript("mobile: scroll", scrollObject);
		
		
		scrollObject.put("direction", "up");
		js.executeScript("mobile: scroll", scrollObject);
		
		Thread.sleep(5000);
		
		
	}

}
