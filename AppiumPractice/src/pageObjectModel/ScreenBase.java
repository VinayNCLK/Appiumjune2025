package pageObjectModel;

import io.appium.java_client.AppiumDriver;

public class ScreenBase {

	public static AppiumDriver driver;
	
	public ScreenBase(AppiumDriver driver) {
		this.driver = driver;
		
	}
}
