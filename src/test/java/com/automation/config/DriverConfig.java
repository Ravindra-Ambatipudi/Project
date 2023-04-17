package com.automation.config;

import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.automation.constants.Constants;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * The Class DriverConfig.
 *
 */
public class DriverConfig {

	/** The base project path. */
	public static String baseProjectPath = System.getProperty("user.dir");
	
	
	public DesiredCapabilities capabilities = new DesiredCapabilities();
	
	

	public void setUp(String platformName, String platformVersion, String deviceName, String deviceUrl) throws Throwable {
		try {
			AppiumDriver driver = null ;
			switch(platformName) {
			case "Android":
				capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, Constants.ANDROID_AUTOMATION_NAME);
				capabilities.setCapability(MobileCapabilityType.PLATFORM, platformName);
				capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
				capabilities.setCapability(MobileCapabilityType.APP,baseProjectPath.concat(Constants.APK_FILES_PATH));
				driver = new AndroidDriver<MobileElement>(new URL(deviceUrl), capabilities);
				driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
				break;
			case "iOS":
				capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, Constants.iOS_AUTOMATION_NAME);
				capabilities.setCapability(MobileCapabilityType.PLATFORM, platformName);
				capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
				capabilities.setCapability(MobileCapabilityType.APP,baseProjectPath.concat(Constants.IPA_FILES_PATH));
				driver = new AndroidDriver<MobileElement>(new URL(deviceUrl), capabilities);
				driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
				
			}
			
			
			LocalDriverManager.setAppiumDriver(driver);

		}catch (Throwable throwable) {
		
	
	}
		
	}
}
