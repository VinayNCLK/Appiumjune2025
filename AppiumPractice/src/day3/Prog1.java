package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("passw1");
		driver.findElement(By.xpath("//a[.='Forgotten password?']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Email address or mobile number']")).sendKeys("1234565");
		driver.findElement(By.xpath("//div[@aria-label='Log in']")).click();
		
		//driver.close();
		
		
	}

}
