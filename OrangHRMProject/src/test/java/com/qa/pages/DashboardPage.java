package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class DashboardPage extends TestBase {
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(), 'Welcome Admin')]")
	WebElement userlabel;

	@FindBy(xpath = "//a[contains(@id, 'menu_leave_viewLeaveModule')]")
	WebElement leaveLink;

	@FindBy(xpath = "//a[contains(@id, 'menu_leave_assignLeave')]")
	WebElement assignLink;

	@FindBy(xpath = "//canvas[contains(@class, 'flot-overlay')]")
	WebElement employeeChart;

	@FindBy(xpath = "//a[contains(@id, 'menu_pim_viewPimModule')]")
	WebElement pim;

	@FindBy(xpath = "//a[contains(text(), 'Add Employee')]")
	WebElement addemployee;

	public String dashBoardtitlePage() {
		return driver.getTitle();
	}

	public boolean verifyingUserlabel() {
		return userlabel.isDisplayed();
	}

	public boolean verifyEmployeeChart() {
		return employeeChart.isDisplayed();
	}

	public LeaveListPage clickOnLeaveLink() {
		leaveLink.click();
		return new LeaveListPage();
	}

	public void navigateToPimLink() {
		Actions action = new Actions(driver);
		action.moveToElement(pim).build().perform();
	}

	public AddEmployeePage clickOnAddEmployee() {

		addemployee.click();
		return new AddEmployeePage();

	}

}
