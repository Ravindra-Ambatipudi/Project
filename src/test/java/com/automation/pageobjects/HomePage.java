package com.automation.pageobjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomePage {
	

	/*** cosntructor for intializing page locators *****/
	public HomePage(AppiumDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	@AndroidFindBy(id = "username")
	@iOSXCUITFindBy(id = "username")
	private MobileElement userNameTextField;
	
	@AndroidFindBy(id = "password")
	@iOSXCUITFindBy(id = "password")
	private MobileElement passwordTextField;
	
	@AndroidFindBy(id = "login")
	@iOSXCUITFindBy(id = "login")
	private MobileElement loginBtn;
	
	@AndroidFindBy(id = "search")
	@iOSXCUITFindBy(id = "search")
	private MobileElement searchtextField;
	
	@AndroidFindBy(id = "searchbutton")
	@iOSXCUITFindBy(id = "searchbutton")
	private MobileElement searchButton;
	
	@AndroidFindBy(id = "productName")
	@iOSXCUITFindBy(id = "productName")
	private MobileElement productName;
	
	
	
	
	
	
	public void loginToApp() {
		userNameTextField.sendKeys("UsErNaMe");
		passwordTextField.sendKeys("PassWord");
		loginBtn.click();
	}
	
	public void performSearch() {
		searchtextField.click();
		searchtextField.clear();
		searchtextField.sendKeys("Mobile Phone");
		searchButton.click();
		
		
	}
	
	public void navigateToProductDetails() {
		productName.click();
		
	}
	
	
	

}
