package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibraries {

	//No of rows index - 0
	public static int getNumberOfRows(String fileName, String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(fileName);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		return sheet.getLastRowNum();
	}
	
	//No of columns - 1
	public static int getNumberOfColumns(String fileName, String sheetName, int rowNumber) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(fileName);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		return sheet.getRow(rowNumber).getLastCellNum();
	}
	
	//returns the string cell value
	public static String getCellValue(String fileName, String sheetName, int rowNumber, int cellNumber) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(fileName);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		return sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue();
	}
	

	//returns the active sheet number
	public static int getActiveSheetIndex(String fileName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(fileName);
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getActiveSheetIndex();
		
	}
	
	//set new name to the sheet
	public static void setSheetName(String fileName, String originalSheetName, String newSheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(fileName);
		Workbook wb = WorkbookFactory.create(fis);
		wb.setSheetName(wb.getSheetIndex(originalSheetName), newSheetName);
		FileOutputStream fos = new FileOutputStream(fileName);
		wb.write(fos);
		fos.close();
	}
	
	//write the data into the cell
	public static void writeValueIntoCell(String fileName,String sheetName, int rowNumber, int cellNumber, String value) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(fileName);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		sheet.getRow(rowNumber).createCell(cellNumber).setCellValue(value);
		FileOutputStream fos = new FileOutputStream(fileName);
		wb.write(fos);
		fos.close();
	}
	
	//creating the new sheet
	public static void createSheet(String fileName, String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(fileName);
		Workbook wb = WorkbookFactory.create(fis);
		wb.createSheet(sheetName);
		FileOutputStream fos = new FileOutputStream(fileName);
		wb.write(fos);
		fos.close();
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String fileName = System.getProperty("user.dir")+"\\testData\\testData.xlsx";
		String sheetName= "Sheet1";
		
		
		System.out.println(ExcelLibraries.getNumberOfRows(fileName, sheetName));
		System.out.println(ExcelLibraries.getNumberOfColumns(fileName, sheetName, 0));
		System.out.println(ExcelLibraries.getCellValue(fileName, sheetName, 0, 0));
		System.out.println(ExcelLibraries.getCellValue(fileName, sheetName, 0, 1));
		System.out.println(ExcelLibraries.getActiveSheetIndex(fileName));
		
		//ExcelLibraries.setSheetName(fileName, "Sheet3", "Sheet1");
		
		//ExcelLibraries.writeValueIntoCell(fileName, sheetName, 0, 0, "Email_Id");
		//ExcelLibraries.createSheet(fileName, "Sheet2");
		
		
		ExcelLibraries.writeValueIntoCell(fileName, sheetName, 1, 2, "PASS");
		ExcelLibraries.writeValueIntoCell(fileName, sheetName, 2, 2, "FAIL");
		ExcelLibraries.writeValueIntoCell(fileName, sheetName, 3,2, "PASS");
		ExcelLibraries.writeValueIntoCell(fileName, sheetName, 4, 2, "PASS");
		
	}

}
