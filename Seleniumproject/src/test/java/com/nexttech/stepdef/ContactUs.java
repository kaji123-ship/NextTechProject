package com.nexttech.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.nexttech.Pageobjectmodel.ContactUsPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.BrowserFactory;

public class ContactUs  {

	
	
	WebDriver driver;
	
	
	
	
	
	@Given("^visitor opening the browser$")
	public void visitor_opening_the_browser() throws Throwable {
		 System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 
			driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		 
		//driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.oscommerce.com"); 
		
		
	}

	@Given("^click the contact Us link$")
	public void click_the_contact_Us_link() throws Throwable {
	    
		ContactUsPage obj = new ContactUsPage(driver);
		obj.ContactUs().click();
	}

	@When("^visitor put \"([^\"]*)\" , \"([^\"]*)\"and\"([^\"]*)\"$")
	public void visitor_put_and(String arg1, String arg2, String arg3) throws Throwable {
		ContactUsPage obj1 = new ContactUsPage(driver);
		obj1.FullName().sendKeys(arg1);
		obj1.EmailAddress().sendKeys(arg2);
		obj1.enquiry().sendKeys(arg3);
	}

	@When("^visitor click on continue button$")
	public void visitor_click_on_continue_button() throws Throwable {
		ContactUsPage obj2 = new ContactUsPage(driver);
		obj2.Continue().click();
	}

	@Then("^visitor successfully enquiry the store Owner$")
	public void visitor_successfully_enquiry_the_store_Owner() throws Throwable {
	    
	}


}
