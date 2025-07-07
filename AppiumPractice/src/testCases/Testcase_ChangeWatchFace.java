package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import listeners.ExtentListeners;
import pageObjectModel.HomePO;
import pageObjectModel.WatchFacesPO;
import pageObjectModel.WatchPO;
import utils.ExcelLibraries;

public class Testcase_ChangeWatchFace extends TestBase{

	
	HomePO home;
	WatchPO watch;
	WatchFacesPO watchFaces;
	
	
	@BeforeClass
	public void initPo() {
		home = new HomePO(driver);
		watch = new WatchPO(driver);
		watchFaces = new WatchFacesPO(driver);
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
	
	
}
