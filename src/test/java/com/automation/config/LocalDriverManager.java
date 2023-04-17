package com.automation.config;


import io.appium.java_client.AppiumDriver;

/**
 * The Class LocalDriverManager.
 */
public class LocalDriverManager {

	/** The web driver. */
	private static ThreadLocal<AppiumDriver> AppiumDriver = new ThreadLocal<AppiumDriver>();

	
	
	
	public static AppiumDriver getAppiumDriver() {
		return AppiumDriver.get();
	}

	/**
	 * Sets the web driver.
	 *
	 * @param driver
	 *            the new web driver
	 */
	
	static void setAppiumDriver(AppiumDriver driver) {
		AppiumDriver.set(driver);
	}
	
	
	
}