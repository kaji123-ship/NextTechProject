package com.qa.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.TestBase;

public class LeaveListPage extends TestBase {

	public LeaveListPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='calFromDate']")
	WebElement startDateLeave;

	@FindBy(xpath = "//input[@id='calToDate']")
	WebElement endDateLeave;

	@FindBy(xpath = "//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")
	WebElement LeaveStatus;

	@FindBy(xpath = "//input[@id='leaveList_txtEmployee_empName']")
	WebElement empName;

	@FindBy(xpath = "//select[@id='leaveList_cmbSubunit']")
	WebElement subUnit;

	@FindBy(xpath = "//input[@id='btnSearch']")
	WebElement searchBtn;

	@FindBy(xpath = "//input[@id='btnSave']")
	WebElement saveBtn;

	@FindBy(xpath = "//a[@class='toggle tiptip']")
	WebElement verifyLeaveListPage;

	public boolean verifyLeaveListPage() {
		return verifyLeaveListPage.isDisplayed();
	}

	public void startDateLeave(String startDate) {
		//String startdate = "2020-06-12";
		startDateLeave.clear();
		startDateLeave.sendKeys(startDate);

	}

	public void endDateLeave(String endDate) {
		//String enddate = "2020-06-15";
		endDateLeave.clear();
		endDateLeave.sendKeys(endDate);

	}

	public void leaveStatus() {
		LeaveStatus.click();

	}

	public void employeeName(String empname) {
		//String employeeName = "Corona shrestha";
		empName.sendKeys(empname);

	}
	
	
	public void subUnit( String subunit) {
		//String selectedUnit ="IT";
		Select select = new Select(subUnit);
		select.selectByVisibleText(subunit);
	}
	
	
	public void searchBtn() {
		searchBtn.click();
		
	}
	
	public void saveBtn() {
		 saveBtn.click();
	}
	

}
