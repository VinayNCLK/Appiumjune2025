package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyProfile  extends ScreenBase {

	public MyProfile(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Goal\")")
	public WebElement goal;
	
	@AndroidFindBy(id = "com.crrepa.band.dafit:id/tv_setting_hint")
	public WebElement goalSteps;
	
	public GoalPO clickGoal() {
		goal.click();
		return new GoalPO(driver);
	}
	
	public String getTheSteps() {
		return goalSteps.getText();
	}
}
