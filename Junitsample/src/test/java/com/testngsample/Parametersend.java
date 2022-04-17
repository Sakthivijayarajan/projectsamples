package com.testngsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Base.Basenew;

public class Parametersend {
	
	WebDriver driver;
	
	@Parameters({"name1","password1"})
	
	@Test
	public void  launch(String name1,String password1 )
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\eclipse-workspace\\Seleniumauto\\driver\\geckodriver.exe");
	driver= new FirefoxDriver();
	
	driver.get("https://www.facebook.com/");
	
	
	WebElement name = driver.findElement(By.id("email"));
   WebElement pass = driver.findElement(By.id("pass"));
	
		
 name.sendKeys(name1);
pass.sendKeys(password1);
	
	WebElement login= Basenew.findElementByname("login");
	login.click();
	
		
	}
	
	

}
