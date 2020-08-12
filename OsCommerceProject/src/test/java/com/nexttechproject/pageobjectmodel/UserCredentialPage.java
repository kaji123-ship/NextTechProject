package com.nexttechproject.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserCredentialPage {
WebDriver driver; // initialize driver
	
	public  UserCredentialPage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this); // initialize the webelement
		
	}
	
	@FindBy(xpath = "//*[@id=\"tdb3\"]/span[2]")
	WebElement click_MyAccount;

	public WebElement MyAccount() {

		return click_MyAccount;

	}

	@FindBy(name = "email_address")
	WebElement Send_EmailAddress;

	public WebElement EmailAddress() {

		return Send_EmailAddress;

	}
	
	
	@FindBy(xpath="//input[@name=\"password\"]")
	WebElement Send_Password;
	public WebElement Password() {
		
		return Send_Password;
		
		}
	
	@FindBy(xpath="//*[@id=\"tdb1\"]/span[2]")
	WebElement click_SignIn;
	public WebElement SignIn() {
		
		return click_SignIn;
		
	}
	
	@FindBy(xpath="//*[@id=\"tdb4\"]/span")
	WebElement click_SignOut;
	public WebElement SignOut() {
		
		return click_SignOut;
	}
	
	
	
	
	
}
