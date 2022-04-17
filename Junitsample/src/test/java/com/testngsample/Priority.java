package com.testngsample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority {
	
	@BeforeSuite
	public void suite() {
		System.out.println("suite");
	}
	
	
	@BeforeTest
	public void test(){
		System.out.println("test");
	}
	
	@BeforeClass
	public void class1() {
		System.out.println("class1");
	}
	
	@BeforeMethod
	
	public void mrth(){
		System.out.println("mths");
		
	}
	
	@Test
	
	public void tet() {
		
		System.out.println("tet");
		
		
	}
	
	@AfterSuite
	public void ste() {
		System.out.println("suite");
	}
	
	
	@AfterTest
	public void test2(){
		System.out.println("test");
	}
	
	@BeforeClass
	public void class11() {
		System.out.println("class1");
	}
	
	@AfterMethod
	
	public void meths(){
		System.out.println("mths");
		
	}
	
	
}
