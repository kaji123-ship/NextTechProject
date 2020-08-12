package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class AddEmployeePage extends TestBase{

	public AddEmployeePage() {
		PageFactory.initElements(driver, this);  
	}
	
	@FindBy(xpath = "//div[@id='addEmployeeTbl']")
	WebElement verifyaddEmployeeLabel;

	@FindBy(xpath = "//input[@id='firstName']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@id='middleName']")
	WebElement middlename ;
	
	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastname ;
	
	@FindBy(xpath = "//input[@id='employeeId']")
	WebElement employeeid ;
	
	@FindBy(xpath = "//input[@id='photofile']")
	WebElement uploadPic;
	
	@FindBy(xpath = "//input[@id= 'btnSave']")
	WebElement savebtn;
	
	
	public boolean verifyemployeeLabel() {
		
		return verifyaddEmployeeLabel.isDisplayed();
	}
	/*
	public void firstName(String fname) {
		firstname.sendKeys(fname);
	}
	
	public void middleName(String mname) {
		 middlename.sendKeys(mname);
		
	}
	
	
	public void lastName(String lname) {
		lastname.sendKeys(lname);
	}
	
	public void employeeId(String empId) {
		employeeid.sendKeys(empId);
		
	}*/
	
	public void uploadphoto() {
		//uploadPic.sendKeys("C:\\Users\\bhai_\\OneDrive\\Pictures\\Saved Pictures");
	}
	
	public  PersonalDetailsPage clickOnsaveBtn() {
		savebtn.click();
		
		return new PersonalDetailsPage();
		
		
	}
	
	
	
	
}
