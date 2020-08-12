package com.nexttechproject.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nexttechproject.utility.BrowserFactory1;

public class MrBoolCourseDropDownPage extends  BrowserFactory1 {

	
	
	public  MrBoolCourseDropDownPage() {
		
		
		PageFactory.initElements(driver, this); // initialize the webelement
		
	}
	
	@FindBy(xpath="//a[@class=\"menulink\"]")
	WebElement click_content;
	
	public WebElement content() {
		return click_content;
		
	}
	
	@FindBy(xpath="//*[@id=\"headermenudesktop\"]/ul/li/ul/li[2]/a")
	WebElement click_courses;
	
	public WebElement courses() {
		return click_courses;
		
	}
	
	
	
	
	
	
	
	
	
}
