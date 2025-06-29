package day15;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Prog2 {

	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
	
	@Test
	public void testA() {
		System.out.println("Test case");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}
	
}
