package com.testngsample;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Base.Basenew;

import prop.propertycc;

public class Testngfirst { 

	@BeforeClass
	public void beforeClass() {
		Basenew.browserlaunch();
		Basenew.url("https://www.facebook.com/");
		
		
		
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}

	@Test
	
	public void login() {

		WebElement name = Basenew.findElementByname("email");
		WebElement pass = Basenew.findElementByname("pass");
		
		
		Basenew.typeData(name,Basenew.read("username") );
		Basenew.typeData(pass,Basenew.read("password") );
		
		WebElement login= Basenew.findElementByname("login");
		login.click();
		

	}

}
