package com.reports;


import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runners.Parameterized.Parameters;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.executemain.Adacinfinal;

public  class FirstReport extends Adacinfinal {
	
	public static ExtentHtmlReporter reporter;
	
	public static ExtentReports extent;
	
	@BeforeClass
	
	public static void report()
	{
	   
		
		  
		   reporter = new ExtentHtmlReporter("C:\\Users\\vijay\\OneDrive\\Desktop\\New Text Document.html");		  
		   extent = new ExtentReports();
		  
	extent.attachReporter(reporter);
		
	}
		  @Before
		  
		  public void before()
		  {
			  Date d= new Date();
			   System.out.println(d);
		  }
		
		  
		  
		  
		  
				
				
			
		  
		  @After
		  public  void flush()
		  {
			  extent.flush();
		  }
		  
}

		  
			  
		  
		  
		  
		  
  
		  
		  
		  
		  
		  
		  
		
	