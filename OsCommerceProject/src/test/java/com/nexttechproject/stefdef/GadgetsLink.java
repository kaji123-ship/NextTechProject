package com.nexttechproject.stefdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.nexttechproject.pageobjectmodel.GadgetsLinkPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GadgetsLink {
	WebDriver driver;
	 GadgetsLinkPage gadgets;
	
	@Given("^customer start the browser with url$")
	public void customer_start_the_browser_with_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		 
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.oscommerce.com");
	}

	@When("^customer click the Gadgets link$")
	public void customer_click_the_Gadgets_link() throws Throwable {
	   gadgets = new  GadgetsLinkPage(driver);
	   gadgets.gadgets().click();
	   Thread.sleep(3000);
	}

	@Then("^customer see the selected gadgets$")
	public void customer_see_the_selected_gadgets() throws Throwable {
	   boolean display=driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/div/div/div[1]/div[2]/table/tbody/tr/td[1]/a/img")).isDisplayed();
	   System.out.println(display);
	   Thread.sleep(3000);
	   
	}

	@Then("^customer click the buy now option$")
	public void customer_click_the_buy_now_option() throws Throwable {
	  gadgets.buyNow().click();;
	}

	@Then("^customer can see the cartpage$")
	public void customer_can_see_the_cartpage() throws Throwable {
		if(driver.getPageSource().contains("What's In My Cart?")) {
			Assert.assertTrue(true);
		}else {
			System.out.println("cart page is notlanding");
			
		}
	}

	
	
	
	
	
	
	
}
