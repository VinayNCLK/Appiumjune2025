package day4;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Prog1 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setUdid("emulator-5554");
		options.withBrowserName("Chrome");
		
		
		WebDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("passw1");
		driver.findElement(By.xpath("//a[.='Forgotten password?']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Email address or mobile number']")).sendKeys("1234565");
		driver.findElement(By.xpath("//div[@aria-label='Log in']")).click();
		
	}

}
