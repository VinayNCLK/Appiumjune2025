package day4;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Prog2 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setUdid("emulator-5554");
		options.withBrowserName("Chrome");
		
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@aria-label='Google Search']")).sendKeys("Face book");
		driver.findElement(By.xpath("//span[.='Facebook']")).click();
		
	}

}
