package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WatchPO extends ScreenBase{

	public WatchPO(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Watch Faces\")")
	public WebElement watchFace;
	
	
	public WatchFacesPO clickWatchFace() {
		watchFace.click();
		return new WatchFacesPO(driver);
	}
	
}
