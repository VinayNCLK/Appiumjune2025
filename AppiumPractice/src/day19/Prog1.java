package day19;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import listeners.ExtentListeners;
import utils.ExcelLibraries;

public class Prog1 {

	
	
	@Test
	public void login() throws EncryptedDocumentException, IOException {
		
		String fileName = System.getProperty("user.dir")+"\\testData\\testData.xlsx";
		String sheetName= "Sheet1";
		int numberOfRows = ExcelLibraries.getNumberOfRows(fileName, sheetName);
		
		for(int i=1;i<=numberOfRows;i++) {
			
			ExtentListeners.test.log(Status.INFO, "Enter the email id "+ExcelLibraries.getCellValue(fileName, sheetName, i, 0));
			ExtentListeners.test.log(Status.INFO, "Enter the Password"+ExcelLibraries.getCellValue(fileName, sheetName, i, 1));
			ExtentListeners.test.log(Status.INFO, "Click sigin button");
			ExtentListeners.test.log(Status.INFO, "Landed to the home page successfully");
			ExcelLibraries.writeValueIntoCell(fileName, sheetName, i, 2, "PASS");
			if(i==2) {
				ExcelLibraries.writeValueIntoCell(fileName, sheetName, i, 2, "FAIL");
			}
		}
		
	}

	
	
	
}
