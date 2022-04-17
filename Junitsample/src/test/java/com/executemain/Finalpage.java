package com.executemain;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import com.locators.Order;

public class Finalpage extends Order {
	
	
	@Test
	 public void Finalexecution4() throws InterruptedException {
name();
lastname();
Address();
card();
cc_type();
month();
year();
cvv();
Book();

driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

print();

}}
