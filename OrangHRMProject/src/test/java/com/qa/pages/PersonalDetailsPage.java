package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.TestBase;

public class PersonalDetailsPage extends TestBase {

	
	public  PersonalDetailsPage() {
		PageFactory.initElements(driver, this);  
	}
	
	
	@FindBy(xpath = "//*[@id='profile-pic']/h1")
	WebElement  verifypersonaldetailsLabel ;
	
	@FindBy(xpath = "//input[@id= 'btnSave']")
	WebElement Edit_button ;
	
	@FindBy(xpath = "//input[@id='personal_txtLicenNo']")
	WebElement DLnum ;
	
	@FindBy(xpath = "//input[@id='personal_txtLicExpDate']")
	WebElement licexpDate ;
	
	@FindBy(xpath = "//input[@id='personal_DOB']")
	WebElement DOB ;
	
	@FindBy(xpath = "//input[@id='personal_optGender_1']")
	WebElement gender ;
	
	@FindBy(xpath = "//select[@id='personal_cmbMarital']")
	WebElement marital_Status ;
	
	@FindBy(xpath = "//select[@id='personal_cmbNation']")
	WebElement Nationality ;
	
	@FindBy(xpath = "//input[@id= 'btnSave']")
	WebElement save_button ;
	
	public boolean verifylabelName() {
		return verifypersonaldetailsLabel.isDisplayed();
	}
	
	public void clickOnEditbutton() {
		 Edit_button.click();
	}
	
	
	public void clickOngender() {
		 gender.click();
		
	}
	
	public void maritalStatus() {
		String status = "Married";
		Select select = new Select( marital_Status);
		select.selectByVisibleText(status);
		
	}
	
	
	public void nationality() {
		
		String country = "Austrian";
		Select select = new Select( Nationality);
		select.selectByVisibleText(country);
		
	}
	
	public void savebutton() {
		save_button.click();
		
	}
	
}
