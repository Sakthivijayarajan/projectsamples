package com.testngsample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Failed {
	
	@Test(retryAnalyzer=FailedTestCaseReRun.class)
	public void test1() {
		Assert.assertTrue(false);
		System.out.println("Test1");
	}

	

	@Test
	public void test3() {
		System.out.println("Test3");

}
}