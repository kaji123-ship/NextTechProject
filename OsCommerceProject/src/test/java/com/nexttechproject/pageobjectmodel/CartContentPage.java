package com.nexttechproject.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartContentPage {


WebDriver driver; // initialize driver
	
	public CartContentPage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this); // initialize the webelement
		
	}
	
	
	@FindBy(xpath="//span[text()='Cart Contents']")
	WebElement click_cartContents;
	
	public WebElement cartContents() {
		return click_cartContents;
		}
	
	
	@FindBy(xpath="//span[text()='Continue']")
	WebElement click_continue;
	
	public WebElement continueButton() {
		return click_continue;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
