package ios;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class Prog1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		
		XCUITestOptions options = new XCUITestOptions();
		options.setUdid("C0B4374F-D53F-4C88-8FC7-AB85B7A3B1D2");
		options.withBrowserName("safari");
		options.setPlatformVersion("18.5");
		
		IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("passw1");
		driver.findElement(By.xpath("//a[.='Forgotten password?']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Email address or mobile number']")).sendKeys("1234565");
		driver.findElement(By.xpath("//div[@aria-label='Log in']")).click();

	}

}
