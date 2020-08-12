package com.nexttech.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

WebDriver driver;


public ContactUsPage(WebDriver driver) {
	
	this.driver = driver;

	PageFactory.initElements(driver, this);
	
	
	
}

@FindBy(xpath = "//*[@id=\"columnLeft\"]/div[5]/div[2]/a[4]")
WebElement click_ContactUs;

public WebElement ContactUs() {
	return click_ContactUs;

	

}

@FindBy(name="name")
WebElement send_FullName;

public WebElement FullName() {
	return send_FullName;
	

}

@FindBy(name="email")
WebElement send_EmailAddress;
public WebElement EmailAddress() {
	return send_EmailAddress;
	

}

@FindBy(xpath="//*[@id=\"bodyContent\"]/form/div/div[1]/table/tbody/tr[3]/td[2]/textarea")
WebElement send_Enquiry;
public WebElement enquiry() {
	return send_Enquiry;
	
}

@FindBy(xpath="//*[@id=\"tdb4\"]/span[2]")
WebElement click_continue;
public WebElement Continue() {
	return click_continue;

	
}


}
