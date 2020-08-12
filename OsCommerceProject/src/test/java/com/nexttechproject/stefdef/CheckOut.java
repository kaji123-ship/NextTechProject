package com.nexttechproject.stefdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.nexttechproject.pageobjectmodel.CheckOutPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckOut {
WebDriver driver;
CheckOutPage checkout;
	
	
	
	@Given("^customer open the browser with urls$")
	public void customer_open_the_browser_with_urls() throws Throwable {
	   
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		 
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.oscommerce.com"); 
	}

	@Given("^click checkout button$")
	public void click_checkout_button() throws Throwable {
	    checkout = new CheckOutPage(driver);
	    checkout.checkOutButton().click();
	}

	@When("^customer enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void customer_enter_and(String email, String password) throws Throwable {
	   checkout.emailAddress().sendKeys(email);
	   checkout.password().sendKeys(password);
	   Thread.sleep(2000);
		
	}

	@When("^customer click on Sign In button$")
	public void customer_click_on_Sign_In_button() throws Throwable {
	   checkout.signIn().click();
	   Thread.sleep(2000);
	}

	@Then("^customer see  checkoutpage and click continue button$")
	public void customer_see_checkoutpage_and_click_continue_button() throws Throwable {
	   checkout.continueButton().click();
	}

	@Then("^customer landing on payment page$")
	public void customer_landing_on_payment_page() throws Throwable {
		if(driver.getPageSource().contains("Payment Information")) {
			System.out.println("payment page is landing");
		}else {
			System.out.println("payment page is not landing");
			
		}
	}
	
	
	
	
	
	
	
}
