package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;

import io.appium.java_client.AppiumDriver;

public class Generic {

	
	public final static PointerInput FINGER = new PointerInput(Kind.TOUCH, "finger");
	
	public static Point getCenterOfElement(Point location, Dimension size) {
		return new Point(location.getX()+size.getWidth()/2,location.getY()+size.getHeight()/2);
	}
	
	public static String currentDateAndTime() {
		 LocalDateTime myDateObj = LocalDateTime.now();
		   // System.out.println("Before formatting: " + myDateObj);
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");

		    String formattedDate = myDateObj.format(myFormatObj);
		    //System.out.println("After formatting: " + formattedDate);
		    return formattedDate;
	}
	
	public static void getScreenShot(AppiumDriver driver, String methodName, String dateAndTime) {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		//Saving the screenshot in desired location
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("./Screenshots/"+methodName+dateAndTime+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String readProperties(String file, String key)
	{

	    Properties prop = new Properties();
	    //InputStream fins = getClass().getClassLoader().getResourceAsStream(file)	    
	    try 
	    {
	        prop.load(new FileInputStream(file));
	        //prop.load(fins);
	    } 
	    catch (IOException e) {
	        e.printStackTrace();
	    }

	    return prop.getProperty(key);
	}
	
}
