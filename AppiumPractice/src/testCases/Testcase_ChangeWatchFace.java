package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import listeners.ExtentListeners;
import pageObjectModel.GoalPO;
import pageObjectModel.HomePO;
import pageObjectModel.MyProfile;
import pageObjectModel.WatchFacesPO;
import pageObjectModel.WatchPO;
import utils.ExcelLibraries;

public class Testcase_ChangeWatchFace extends TestBase{

	
	HomePO home;
	WatchPO watch;
	WatchFacesPO watchFaces;
	MyProfile myProfile;
	GoalPO goal;
	
	
	@BeforeClass
	public void initPo() {
		home = new HomePO(driver);
		watch = new WatchPO(driver);
		watchFaces = new WatchFacesPO(driver);
		myProfile = new MyProfile(driver);
		goal = new GoalPO(driver);
	}
	

	
	
	@Test
	public void updateTheNewWatchFaceTest() {
		home.clickWatchItemFromBottomNav();
		ExtentListeners.test.log(Status.INFO, "Clicked on Watch Item From Bottom Nav");
		watch.clickWatchFace();
		ExtentListeners.test.log(Status.INFO, "Clicked on Watch Face");
		Assert.assertEquals(watchFaces.vaildateWatchRdBtn(), true, "Watch faces 1 radio button is ENABLED");
		ExtentListeners.test.log(Status.INFO, "Watch Faces1 radio button is enabled");
		watchFaces.clickWatchFace1();
		ExtentListeners.test.log(Status.INFO, "Clicked on Watch Faces 1");
	
	}
	
	@Test
	public void updateTheGoal() {
		home.clickProfileIconFromBottomNav();
		ExtentListeners.test.log(Status.INFO, "Clicked on profile icon From Bottom Nav");
		myProfile.clickGoal();
		ExtentListeners.test.log(Status.INFO, "Click on creating goal");
		goal.updateTheSteps();
		ExtentListeners.test.log(Status.INFO, "Updated the goal from scroll view");
		goal.clickBackButton();
		ExtentListeners.test.log(Status.INFO, "clicked on back button");
		Assert.assertEquals(myProfile.getTheSteps(), "10000 Steps", "new steps are not updated");
		ExtentListeners.test.log(Status.INFO, "Expected steps are updated successfully");
	}
	
}
