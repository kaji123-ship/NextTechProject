package com.nexttechproject.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingAndReturnsPage {

	
WebDriver driver; // initialize driver
	
	public ShippingAndReturnsPage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this); // initialize the webelement
		
	}
	
	
	@FindBy(linkText="Shipping & Returns")
	WebElement click_shippinglink;
	public WebElement shippingAndReturns() {
		return click_shippinglink;
		
	}
	
	@FindBy(xpath= "//*[@id=\"tdb4\"]/span[2]")
	WebElement click_continue;
	public WebElement Continue() {
		return click_continue;
		
	}
	
	
	
	
	
}
