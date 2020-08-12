package com.nexttech.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogInPage {

	
	WebDriver driver;

	public  FacebookLogInPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="email")
	WebElement Type_EmailAddress;

	public WebElement EmailAddress() {

		return Type_EmailAddress;

	}
	
	@FindBy(name="pass")
	WebElement Type_Password;
	public  WebElement Password() {
		
		return Type_Password;
		
		
	}
	
	@FindBy(xpath="//input[@value=\"Log In\"]")
	WebElement click_LogIn;
	public WebElement LogIn() {
		
		return click_LogIn;
		
		
	}
	
	
}
