package com.nexttech.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.nexttech.Pageobjectmodel.UserLogIn;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserLoginLogOut {

	WebDriver driver;
	
	
	
	@Given("^user visiting homepage$")
	public void user_visiting_homepage() throws Throwable {
		try {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		 
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.oscommerce.com"); }
		
		catch(Exception e) {
			System.out.println("homepage is not working");
		}
		
	}

	@Given("^click My Account button$")
	public void click_My_Account_button() throws Throwable {
	    
		 UserLogIn obj = new  UserLogIn (driver);
		 obj.MyAccount().click();
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2) throws Throwable {
		 UserLogIn obj1 = new  UserLogIn (driver);
	    obj1.EmailAddress().sendKeys( arg1);
	    obj1.Password().sendKeys(arg2);
	}

	@When("^user click on Sign In button$")
	public void user_click_on_Sign_In_button() throws Throwable {
		
		 UserLogIn obj3 = new  UserLogIn (driver);
		 
		 obj3.SignIn().click();
		 
		 
		
	}

	@Then("^user successfully login to the system$")
	public void user_successfully_login_to_the_system() throws Throwable {
	  String actual= driver.getTitle();
	  String expected ="osCommerce Demo";
	  
	  Assert.assertEquals( actual, expected,"title is not found");
	  
	}

	@Then("^user click on Log off button for logout$")
	public void user_click_on_Log_off_button_for_logout() throws Throwable {
	   
		 UserLogIn obj4 = new  UserLogIn (driver);
		 obj4.SignOut().click();
	}

	
	
	
	
	
	
	
}
