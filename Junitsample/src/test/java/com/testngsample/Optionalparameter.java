package com.testngsample;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Optionalparameter {
	@Parameters({"name1"})
	@Test
	
	
	public void opt(String name)
	{
		System.out.println(name);
	}
@Parameters({"val"})
	@Test
	public void opt1(int a)
	{
		System.out.println(a);
	}

	@Parameters({"val1"})
	@Test
	
	public void opt1(@Optional("vijay")String email)
	{
		System.out.println(email);
	}
}
