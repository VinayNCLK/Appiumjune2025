package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;


public class Wait {

	
	public static void waitForPresenceOfElement(By by, AppiumDriver driver, int duration) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(duration));
		wait.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver input) {
				// TODO Auto-generated method stub
				return driver.findElement(by).isDisplayed();
			}
			
		});
		
	}
	
	public static void waitForElementToBeEnabled(By by, AppiumDriver driver, int duration) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(duration));
		wait.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver input) {
				// TODO Auto-generated method stub
				return driver.findElement(by).isEnabled();
			}
			
		});
		
	}
	
	public static void waitForElementToBeSelected(By by, AppiumDriver driver, int duration) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(duration));
		wait.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver input) {
				// TODO Auto-generated method stub
				return driver.findElement(by).isSelected();
			}
			
		});
		
	}
	
	
}
