package com.nexttechproject.stefdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.nexttechproject.pageobjectmodel.UserCredentialPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserCredential {
	
	
	WebDriver driver;
	
	UserCredentialPage user;
	
	@Given("^open the browser with url$")
	public void open_the_browser_with_url() throws Throwable {
	   
		try {
			  
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			 
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://demo.oscommerce.com"); }
			
			catch(Exception e) {
				System.out.println("browser is not working");
			}
			
	
		
	}

	@Given("^click My Account button$")
	public void click_My_Account_button() throws Throwable {
	   user = new UserCredentialPage(driver);
	   user.MyAccount().click();
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String email, String password) throws Throwable {
	  
		user.EmailAddress().sendKeys(email);
		user.Password().sendKeys(password);
	  
	}

	@When("^user click on Sign In button$")
	public void user_click_on_Sign_In_button() throws Throwable {
	   user.SignIn().click();
	 
	}

	@Then("^user successfully login to the page$")
	public void user_successfully_login_to_the_page() throws Throwable {
		
		
		if(driver.getPageSource().contains("Error: No match for E-Mail Address and/or Password.")) {
			Assert.assertTrue(true);  //this means if login is not successful.
			System.out.println("login is not successful");
		}else {
		 System.out.println("longin is sucessful");
		}
	}

	@Then("^user click on Log off button for logout$")
	public void user_click_on_Log_off_button_for_logout() throws Throwable {
	    user.SignOut().click();
	    
	}

	@Then("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
	    driver.quit();
	}

	
	
	
	
	
}
