package com.nexttechproject.stefdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechproject.pageobjectmodel.ContactUsLinkPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsLink {
WebDriver driver;
ContactUsLinkPage contact;


	@Given("^visitor opening the browser with url$")
	public void visitor_opening_the_browser_with_url() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		 
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.oscommerce.com"); 
	}

	@Given("^click the contactUs link$")
	public void click_the_contactUs_link() throws Throwable {
	    contact = new ContactUsLinkPage(driver);
	    contact.ContactUs().click();
	}

	@When("^visitor send \"([^\"]*)\" , \"([^\"]*)\"and\"([^\"]*)\"$")
	public void visitor_send_and(String fullName, String emailAddress, String enquiry) throws Throwable {
	  contact.FullName().sendKeys(fullName);
	  contact.EmailAddress().sendKeys(emailAddress);
	  contact.enquiry().sendKeys(enquiry);
	  
	  Thread.sleep(3000);
	}

	@When("^visitor click on continue button$")
	public void visitor_click_on_continue_button() throws Throwable {
	    
		contact.Continue().click();
		
	}

	@Then("^visitor successfully enquiry the store Owner$")
	public void visitor_successfully_enquiry_the_store_Owner() throws Throwable {
	   
		//contact.contactpagelanding();
	}
	
	
	
	
}
