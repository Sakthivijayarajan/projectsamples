package com.executemain;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.locators.Order;




public class Adacinfinal  extends Order  {
	
		
	  
		
	@Test
	
	public void Finalexecution1()
	{
		
		
		username();
		password();
		loginButton();
Location();
Hotels();
Roomtype();
Roomno();
Checkin();
Checkout();
Adult();
Child();


	
	
}
}