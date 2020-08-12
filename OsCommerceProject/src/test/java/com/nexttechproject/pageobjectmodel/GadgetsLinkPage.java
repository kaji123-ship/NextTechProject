package com.nexttechproject.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GadgetsLinkPage {

WebDriver driver; // initialize driver
	
	public GadgetsLinkPage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this); // initialize the webelement
		
	}
	
	
	
	@FindBy(xpath="//a[text()='Gadgets']")
	WebElement click_gadgets;
	public WebElement gadgets() {
		return click_gadgets;
		
	}
	
	
	
	@FindBy(xpath="//span[text()='Buy Now']")
	WebElement click_buyNow;
	public WebElement buyNow() {
		return click_buyNow;
		
		
	}
	
}
