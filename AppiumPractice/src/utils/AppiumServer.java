package utils;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumServer {

	
	public static AppiumDriverLocalService service;
	
	public static void start() {
		
		service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
				.withAppiumJS(new File("C:\\Users\\Admin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
				.withLogFile(new File(System.getProperty("user.dir")+"\\appiumlogs\\log.txt"))
				.withArgument(GeneralServerFlag.LOCAL_TIMEZONE));
		
		service.start();
		
		
	}
	
	
	public static void stop() {
		service.stop();
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		AppiumServer.start();
		
		
		Thread.sleep(15000);
		
		AppiumServer.stop();
		
		
	}

}
