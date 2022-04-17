package com.reports;

import java.lang.Thread.State;

import org.junit.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Reports extends FirstReport {
	
	@org.junit.Test
	
	
	
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

ExtentTest Logger= extent.createTest("Finalexecution1");

Logger.log(Status.INFO,"Finalexecution1");

Logger.log(Status.PASS,"valid");
	
	
	
}
}
		
		

