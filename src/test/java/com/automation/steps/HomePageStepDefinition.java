package com.automation.steps;

import com.automation.config.DriverConfig;
import com.automation.config.LocalDriverManager;
import com.automation.pageobjects.HomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class HomePageStepDefinition {
	
	DriverConfig appInstance = new DriverConfig();
	
	
	  @Given("^user is on login screen of saucedemo$")
	    public void user_is_on_login_screen_of_saucedemo() throws Throwable {
		  appInstance.setUp("Android", "12.0", "Android", "http://127.0.0.1:4723/wd/hub");
	    }
	
	  
	  @When("^user enters uname,pswd and login to application$")
	    public void user_enters_unamepswd_and_login_to_application() throws Throwable {
		  instanceToHomePage().loginToApp();
	        
	    }
	  
	  @When("^user performs search operation$")
	    public void user_performs_search_operation() throws Throwable {
		  instanceToHomePage().performSearch();
	    }

	    @And("^user navigate to product details screen$")
	    public void user_navigate_to_product_details_screen() throws Throwable {
	    	instanceToHomePage().navigateToProductDetails();
	    }
	
	    public HomePage instanceToHomePage() {
	    	HomePage hp = new HomePage(LocalDriverManager.getAppiumDriver());
	    	return hp;
	    }
	    
	    
	

}
