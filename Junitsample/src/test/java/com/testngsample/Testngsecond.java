package com.testngsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngsecond {
	
		WebDriver driver;
		@Parameters({"Browser"})
		@Test
		public void browserLaunch(String browser) {

			if (browser.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\eclipse-workspace\\Seleniumauto\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://facebook.com/");
				driver.manage().window().maximize();
			
			}else if(browser.equals("gecko")) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\vijay\\eclipse-workspace\\Seleniumauto\\driver\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.get("https://www.flipkart.com");
				driver.manage().window().maximize();
			}
	}
	}