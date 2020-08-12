package com.nexttech.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectProduct {

	WebDriver driver;

	@Given("^the new user is in the homepage$")
	public void the_new_user_is_in_the_homepage() throws Throwable {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://www.facebook.com");
		driver.get("https://demo.oscommerce.com");
		
	}

	@When("^user click on any product$")
	public void user_click_on_any_product() throws Throwable {
	   
	}

	@Then("^user will find details of product$")
	public void user_will_find_details_of_product() throws Throwable {
	   
	}


	
	
}
