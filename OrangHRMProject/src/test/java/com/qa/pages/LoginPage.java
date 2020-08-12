package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase {

	// pagefactory is class where init method help to intialize all the webelement
	// this keyword pointing to current class
	// intializing the page object / webelement/webobject
	public LoginPage() {
		PageFactory.initElements(driver, this);  
	}
	
	
	
	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement loginBtn ;
	
	//Actions
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	
	public DashboardPage loginin(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		//loginBtn
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
		
				return new DashboardPage();
				
	}
	
	
}
