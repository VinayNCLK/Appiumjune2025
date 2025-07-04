package day19;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import listeners.ExtentListeners;
import utils.ExcelLibraries;

public class Prog2 {

	
	@Parameters({"appPackage","appActivity"})
	@Test
	public void login(String appPack,String appActiv) throws EncryptedDocumentException, IOException {
		
		ExtentListeners.test.log(Status.INFO, "App Package "+appPack);
		ExtentListeners.test.log(Status.INFO, "App Activity "+appActiv);
		
		
		ExtentListeners.test.log(Status.INFO, "Enter the email id ");
		ExtentListeners.test.log(Status.INFO, "Enter the Password");
		ExtentListeners.test.log(Status.INFO, "Click sigin button");
		ExtentListeners.test.log(Status.INFO, "Landed to the home page successfully");
		
	}

	
	
	
}
