package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\bhai_\\eclipse-workspace\\OrangHRMProject\\src\\test\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);
		}catch(IOException e) {
			e.getMessage();
		}
		
		
	}
	
	
	public static void initialization() {
		
		String browserName = prop.getProperty("browser");
		
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
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	
	
}
