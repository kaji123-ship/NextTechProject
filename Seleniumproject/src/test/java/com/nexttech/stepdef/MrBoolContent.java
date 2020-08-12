package com.nexttech.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.BrowserFactory;

public class MrBoolContent extends BrowserFactory  {

	//WebDriver driver;
	@Given("^customer open the browser$")
	public void customer_open_the_browser() throws Throwable {
		MrBoolContent obj = new MrBoolContent();
		obj.startBrowser("chrome", "http://www.mrbool.com/");
		Thread.sleep(2000);
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
	}

	@When("^customer go to the website mrbool$")
	public void customer_go_to_the_website_mrbool() throws Throwable {
		//driver.get("http://www.mrbool.com/");
		System.out.println("go to mrbool website");
	}

	@When("^customer click on content button$")
	public void customer_click_on_content_button() throws Throwable {
		 Actions action = new Actions (driver);
		    action.moveToElement(driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/a"))).build().perform();
	}

	@Then("^customer click on singlevideo button$")
	public void customer_click_on_singlevideo_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/ul/li[3]/a")).click();
	}

	@Then("^customer successfully landing the singleviedeo page$")
	public void customer_successfully_landing_the_singleviedeo_page() throws Throwable {
	    
	}


	
	
	
	
	
	}


	
	
	
	
	
	
	
	
	
	
	

