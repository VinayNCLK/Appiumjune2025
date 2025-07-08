package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.Scrollable;

public class GoalPO extends ScreenBase {

	public GoalPO(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	@AndroidFindBy(id = "com.crrepa.band.dafit:id/wp_goal_steps")
	public WebElement wp_goal_steps;
	
	@AndroidFindBy(id = "com.crrepa.band.dafit:id/iv_title_back")
	public WebElement backButton;
	
	public GoalPO updateTheSteps() {
		
		Scrollable.doSwipeWithCoOrdinates(driver, 541, 541, 1069, 776, 2000 );
		return this;
	}
	
	public MyProfile clickBackButton() {
		backButton.click();
		return new MyProfile(driver);
	}
}
