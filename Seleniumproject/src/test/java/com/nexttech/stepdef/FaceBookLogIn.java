package com.nexttech.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.Pageobjectmodel.FacebookLogInPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FaceBookLogIn {

	
	WebDriver driver;
	
	
	@Given("^user visiting facebook homapage$")
	public void user_visiting_facebook_homapage() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		 
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com"); 
		
		
		
	}

	@When("^user put \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_put_and(String arg1, String arg2) throws Throwable {
		 FacebookLogInPage fb = new  FacebookLogInPage(driver);
		 fb.EmailAddress().sendKeys(arg1);
		 fb.Password().sendKeys(arg2);
	   
	}

	@When("^user click on Log In button$")
	public void user_click_on_Log_In_button() throws Throwable {
		FacebookLogInPage fb1 = new  FacebookLogInPage(driver);
		fb1.LogIn().click();
		
	    
	}

	@Then("^user successfully login to the account$")
	public void user_successfully_login_to_the_account() throws Throwable {
	    
	}

	
	
	
	
	
	
	
	
	
	
	
}
