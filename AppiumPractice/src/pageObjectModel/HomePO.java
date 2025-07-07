package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITBy;

public class HomePO extends ScreenBase{

	public HomePO(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//@iOSXCUITBy(xpath = "")
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.crrepa.band.dafit:id/iv_tab_item\"])[1]")
	public WebElement menuItemBottomNav;
	
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.crrepa.band.dafit:id/iv_tab_item1\"])[2]")
	public WebElement watchItemBottomNav;
	
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.crrepa.band.dafit:id/iv_tab_item\"])[3]")
	public WebElement profileItemBottomNav;
	
	
	
	public WatchPO clickWatchItemFromBottomNav() {
		watchItemBottomNav.click();
		return new WatchPO(driver);
	}
	

}
