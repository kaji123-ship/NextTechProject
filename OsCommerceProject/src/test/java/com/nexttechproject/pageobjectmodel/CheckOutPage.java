package com.nexttechproject.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {

 WebDriver driver; // initialize driver
 
 
	public CheckOutPage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this); // initialize the webelement
		
	}
	
	@FindBy(xpath="//span[text()='Checkout']")
	WebElement click_checkout;
	public WebElement checkOutButton() {
		return click_checkout;
		
	}
	
	
	@FindBy(name="email_address")
	WebElement send_emailaddress;
	public WebElement emailAddress() {
		return send_emailaddress;
		
		
	}
	@FindBy(xpath="//input[@name=\"password\"]")
	WebElement send_password;
	public WebElement password() {
		return send_password;
		}
	
	@FindBy(xpath="//span[text()='Sign In']")
	WebElement click_signIn;
	public WebElement signIn() {
		return click_signIn;
		
	}
	
	
	@FindBy(xpath="//span[text()='Continue']")
	WebElement click_continue;
	public WebElement continueButton() {
		return click_continue;
		
	
	}
	
	
	
}
