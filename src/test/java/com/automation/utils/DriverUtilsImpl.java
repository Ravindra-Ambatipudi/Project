package com.automation.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.automation.config.LocalDriverManager;

public class DriverUtilsImpl {



	public void sendText(By idSelector, String text) {
			LocalDriverManager.getAppiumDriver().findElement(idSelector).clear();
			LocalDriverManager.getAppiumDriver().findElement(idSelector).sendKeys(text);
	}

	
	public void gClick(By elementLocator) {
				LocalDriverManager.getAppiumDriver().manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
				LocalDriverManager.getAppiumDriver().findElement(elementLocator).click();
	}



	
}