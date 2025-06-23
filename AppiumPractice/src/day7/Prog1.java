package day7;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Prog1 {
	
	static AndroidDriver driver;
	
	public static String operation(String firstValue, String secondValue, String operator) {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text="+"\""+firstValue+"\"]")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().textContains("+"\""+operator+"\").index(1).instance(0)")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text="+"\""+secondValue+"\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"=\"]")).click();
		String result = driver.findElement(AppiumBy.accessibilityId("Calculator input field")).getText();
		driver.findElement(AppiumBy.accessibilityId("Calculator input field")).clear();
		return result;
	}
	
	
	public static void calculation(String operation,String firstValue, String secondValue) {
		
		switch (operation) {
		case "Add": {
			System.out.println("Addition result is :"+operation(firstValue, secondValue, "+"));
			break;
		}
		case "Sub": {
			System.out.println("Sub result is :"+operation(firstValue, secondValue, "−"));
			break;
		}
		case "Mul": {
			System.out.println("Mul result is :"+operation(firstValue, secondValue, "×"));
			break;
		}
		case "Div": {
			System.out.println("Div result is :"+operation(firstValue, secondValue, "÷"));
			break;
		}
		
		default:
			System.out.println("Please select the proper operation");
			throw new IllegalArgumentException("Unexpected value: " + operation);
		}
	}
	
	
	

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setUdid("3200742adcad6679");
		options.setAppPackage("com.sec.android.app.popupcalculator");
		options.setAppActivity("com.sec.android.app.popupcalculator.Calculator");
		
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		calculation("Add", "1", "2");
		Thread.sleep(2000);
		calculation("Sub", "1", "8");
		Thread.sleep(2000);
		calculation("Mul", "1", "3");
		Thread.sleep(2000);
		calculation("Div", "4", "3");
		
	}

}
