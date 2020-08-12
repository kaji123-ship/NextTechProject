
package com.nexttechproject.stefdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechproject.pageobjectmodel.MrBoolCourseDropDownPage;
import com.nexttechproject.utility.BrowserFactory1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MrBoolCourseDropDown extends BrowserFactory1 {
	
	
	MrBoolCourseDropDownPage course;
	
	
	@Given("^customer open the browser with Url$")
	public void customer_open_the_browser_with_Url() throws Throwable {
		//C:\Program Files\chromedriver_win32
	
		BrowserFactory1.startBrowser("chrome", "http://www.mrbool.com/");
		
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		 
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.mrbool.com/"); */
	}

	@When("^customer click on contents button$")
	public void customer_click_on_contents_button() throws Throwable {
		course = new MrBoolCourseDropDownPage();
	   Actions action = new Actions(driver);
	   action.moveToElement(course.content()).build().perform();
	   Thread.sleep(2000);
	}

	@Then("^customer click on Course button$")
	public void customer_click_on_Course_button() throws Throwable {
	    course.courses().click();
	
	}

	@Then("^customer successfully landing the Course page$")
	public void customer_successfully_landing_the_Course_page() throws Throwable {
	  String title= driver.getTitle();
	  Assert.assertEquals("Online Courses about Software Development - MrBool", title);
	 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
