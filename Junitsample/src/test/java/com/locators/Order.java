package com.locators;

import com.Base.Basenew;
import com.executepage.Bookpageexecute;

public class Order extends Bookpageexecute {
	
	public static String order= "order_no";
	
	public static void print() throws InterruptedException
	
	
	{
		
		
		Basenew.jsGetData(Basenew.findElementByname(order));
		
	}
	
	
		
	

	
	

}
