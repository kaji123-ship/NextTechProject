package com.nexttechproject.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory1 {

	 public static WebDriver driver;

	 public  static void startBrowser(String browserName,String url)  {
		
		 if(browserName.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			 
				driver = new ChromeDriver();
				
					
			 
		 }
		 
		 else if (browserName.equalsIgnoreCase("firefox")) {
			 
			 System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			 
				driver = new FirefoxDriver();
				 
			 
		 }
		 
		 else if (browserName.equalsIgnoreCase("IE")) {
			 
			 System.setProperty("webdriver.ie.driver", "C:\\Program Files\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
			 
			driver = new InternetExplorerDriver();
			 
		 }
		 
		 driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(url);
			
	 } 
}
