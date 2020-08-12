package com.qa.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.qa.pages.AddEmployeePage;
import com.qa.pages.DashboardPage;
import com.qa.pages.LeaveListPage;
import com.qa.pages.LoginPage;
import com.qa.pages.PersonalDetailsPage;
import com.qa.util.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DashboardPageSteps extends TestBase { // cal the constructor and intialize prop object of base class
													// automatically due to extends

	LoginPage loginpage;
	DashboardPage dashboard;
	LeaveListPage leavelistpage;
	AddEmployeePage addemp;
	PersonalDetailsPage personaldetails;

	@Given("^user opens browser with url$")
	public void user_opens_browser_with_url() throws Throwable {
		TestBase.initialization();
	}

	@When("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		loginpage = new LoginPage();
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals("OrangeHRM", title);
	}

	@Then("^user enters the login credintials$")
	public void user_enters_the_login_credintials() throws Throwable {
		dashboard = loginpage.loginin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^user validate Dashboard page title$")
	public void user_validate_Dashboardpage_title() throws Throwable {
		String dashboardtitle = dashboard.dashBoardtitlePage();
		Assert.assertEquals("OrangeHRM", dashboardtitle);
	}

	@Then("^user validate logged username$")
	public void user_validate_logged_username() throws Throwable {
		boolean flag = dashboard.verifyingUserlabel();
		Assert.assertTrue(flag);
	}

	@Then("^user validate employeechart$")
	public void user_validate_employeechart() throws Throwable {
		Assert.assertTrue(dashboard.verifyEmployeeChart());

	}

	@Then("^user click to leaveLink$")
	public void user_click_to_leaveLink() throws Throwable {
		leavelistpage = dashboard.clickOnLeaveLink();
	}

	@Then("^user is on leaveListPage")
	public void user_is_on_leaveListPage() throws Throwable {
		boolean flag = leavelistpage.verifyLeaveListPage();
		if (flag = true) {
			System.out.println("leavelist page is available");

		} else {
			System.out.println("leavelist page is not available");
		}
	}

	@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String startDate, String endDate) throws Throwable {
		leavelistpage.startDateLeave(startDate);
		leavelistpage.endDateLeave(endDate);
	}

	@Then("^click on All checkbox$")
	public void click_on_All_checkbox() throws Throwable {
		leavelistpage.leaveStatus();
	}

	@When("^user type \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_type_and(String empname, String subunit) throws Throwable {
		leavelistpage.employeeName(empname);
		leavelistpage.subUnit(subunit);
	}

	@Then("^click on searchBtn$")
	public void click_on_searchBtn() throws Throwable {
		leavelistpage.searchBtn();
	}

	@Then("^click on saveBtn$")
	public void click_on_saveBtn() throws Throwable {
		leavelistpage.saveBtn();
	}

	@When("^user go to PIM Link$")
	public void user_go_to_PIM_Link() throws Throwable {
		dashboard.navigateToPimLink();
	}

	@When("^click the addEmpoyee option$")
	public void click_the_addEmpoyee_option() throws Throwable {
		addemp =dashboard.clickOnAddEmployee();
	}

	@Then("^user landed on addEmployee page$")
	public void user_landed_on_addEmployee_page() throws Throwable {
		Assert.assertTrue(addemp.verifyemployeeLabel());

	}

	@Then("^user enter employee details$")
	public void user_enter_employee_details(DataTable empdetails) throws Throwable {
		List<List<String>> empvalue = empdetails.raw();    // intialiaze datatable variable(empdetails) with raw method which it gives the list of list string .
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(empvalue.get(0).get(0));
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(empvalue.get(0).get(1));
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(empvalue.get(0).get(2));
		driver.findElement(By.xpath("//input[@id='employeeId']")).clear();
		driver.findElement(By.xpath("//input[@id='employeeId']")).sendKeys(empvalue.get(0).get(3));
	}

	@Then("^user upload the file$")
	public void user_upload_the_file() throws Throwable {
		addemp.uploadphoto();
		Thread.sleep(2000);
	}

	@Then("^Click the save button$")
	public void click_the_save_button() throws Throwable {
		personaldetails = addemp.clickOnsaveBtn();
	}

	@Then("^user navigate to personalDetails page$")
	public void user_navigate_to_personalDetails_page() throws Throwable {
		Assert.assertTrue(personaldetails.verifylabelName());
		
	}
	
	
	@Then("^user click on edit button$")
	public void user_click_on_edit_button() throws Throwable {
		personaldetails.clickOnEditbutton();
	}

	@Then("^user enters the personaldetails$")
	public void user_enters_the_personaldetails(DataTable empdetails) throws Throwable {
	    
		for(Map<String,String> data : empdetails.asMaps(String.class, String.class)) {    // dataTable with map for parameterization of test cases.
			
			driver.findElement(By.xpath("//input[@id='personal_txtLicenNo']")).sendKeys(data.get("DLnumber"));
			driver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']")).sendKeys(data.get("licenseExpiryDate"));
			driver.findElement(By.xpath("//input[@id='personal_DOB']")).sendKeys(data.get("DateOfBirth"));
		}
			
		}
		
		
	

	@Then("^user click on radio button$")
	public void user_click_on_radio_button() throws Throwable {
		personaldetails.clickOngender();
	}

	@Then("^user select the martial status$")
	public void user_select_the_martial_status() throws Throwable {
		personaldetails.maritalStatus();
	}

	@Then("^user select nationality$")
	public void user_select_nationality() throws Throwable {
		personaldetails.nationality();
	}

	@Then("^ClickOn Save button$")
	public void clickon_Save_button() throws Throwable {
		personaldetails.savebutton();
	}

}
