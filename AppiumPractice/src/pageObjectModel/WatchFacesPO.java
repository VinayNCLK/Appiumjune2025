package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WatchFacesPO extends ScreenBase{

	public WatchFacesPO(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	

	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Watch Face 1\")")
	public WebElement watchFace1;
	
	@AndroidFindBy(xpath = "(//android.widget.CheckBox[@resource-id=\"com.crrepa.band.dafit:id/cb_watch_face\"])[1]")
	public WebElement watchFace1RdBtn;
	
	
	public boolean vaildateWatchRdBtn() {
		return watchFace1RdBtn.isEnabled();
	}
	
	public WatchFacesPO clickWatchFace1() {
		watchFace1.click();
		return this;
	}
}
