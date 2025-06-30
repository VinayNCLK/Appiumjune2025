package utils;



import java.util.Set;

import io.appium.java_client.android.AndroidDriver;

public class SwitchTo {

	public static void context(AndroidDriver driver,String contextName) {
		driver.context(contextName);
	}
	
	
	public static Set<String> getAllContexts(AndroidDriver driver) {
		Set<String> contexts = driver.getContextHandles();
		System.out.println("==================");
		System.out.println(contexts);
		
		return contexts;
	}
	
	
	public static void switchToWebView(AndroidDriver driver,Set<String> contexts)
	{
	for(String contextName : contexts) {
		if(contextName.contains("WEBVIEW")) {
			context(driver, contextName);
		}
	}
	}
	
	public static void switchToNative(AndroidDriver driver,Set<String> contexts)
	{
	for(String contextName : contexts) {
		if(contextName.contains("NATIVE")) {
			context(driver, contextName);
		}
	}
	}
	
}
