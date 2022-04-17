package com.executemain;

import org.junit.Test;

import com.aventstack.extentreports.ExtentTest;
import com.locators.Order;



public class Bookpage  extends Order{
	
	
		@Test
		
		public void Finalexecution2() throws InterruptedException {
			
			
			Location();
			Hotels();
			Roomtype();
			Roomno();
			Checkin();
			Checkout();
			Adult();
			Child();
			Searchbutton();
		
	}
}



