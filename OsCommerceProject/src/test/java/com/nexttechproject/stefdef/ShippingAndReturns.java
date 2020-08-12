package com.nexttechproject.stefdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechproject.pageobjectmodel.ShippingAndReturnsPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShippingAndReturns {
WebDriver driver;

ShippingAndReturnsPage shiplink;
	
	@Given("^customer open the browser with url$")
	public void customer_open_the_browser_with_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		 
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.oscommerce.com"); 
		
	}

	@When("^customer click the ShippingAndReturn link$")
	public void customer_click_the_ShippingAndReturn_link() throws Throwable {
	   shiplink = new ShippingAndReturnsPage(driver);
	   shiplink.shippingAndReturns().click();
	   Thread.sleep(3000);
		
	}

	@When("^customer click on continue button$")
	public void customer_click_on_continue_button() throws Throwable {
	   shiplink.Continue().click();
	}

	@Then("^customer see the homepage$")
	public void customer_see_the_homepage() throws Throwable {
	    
	}
	
	
	
	
	
	
	
}
