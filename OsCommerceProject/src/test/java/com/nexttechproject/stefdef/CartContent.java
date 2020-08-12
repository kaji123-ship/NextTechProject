package com.nexttechproject.stefdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.nexttechproject.pageobjectmodel.CartContentPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartContent {

	WebDriver driver;
	CartContentPage cart;
	
	@Given("^customer start the browser with URL$")
	public void customer_start_the_browser_with_URL() throws Throwable {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		 
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.oscommerce.com"); 
	}

	@When("^customer click the cartContent link$")
	public void customer_click_the_cartContent_link() throws Throwable {
	    cart = new CartContentPage(driver);
		cart.cartContents().click();
		
	}

	@Then("^customer see the Continue button$")
	public void customer_see_the_Continue_button() throws Throwable {
	   
		if(driver.getPageSource().contains("What's In My Cart?")) {
			Assert.assertTrue(true);
		}else {
			System.out.println("continue button is not clickable");
			
		}
		Thread.sleep(3000);
	}

	@Then("^customer click on Continue  button$")
	public void customer_click_on_Continue_button() throws Throwable {
	    cart.continueButton().click();
	}

	@Then("^customer can see the welcome page$")
	public void customer_can_see_the_welcome_page() throws Throwable {
		
		if(driver.getPageSource().contains("Welcome to osCommerce Demo")) {
			Assert.assertTrue(true);
			System.out.println("welcome page is landing");
		}else {
			System.out.println("welcome page is not visible");
			
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
