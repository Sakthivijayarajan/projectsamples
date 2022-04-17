package com.testngsample;

import org.testng.annotations.Test;

public class Groupbytest {

	@Test(groups = { "smoke","reg" })

	public void test1() {

		System.out.println("smoke");

	}

	@Test(groups = { "sanity" })

	public void test2() {
		System.out.println("sanity");
	}

	@Test(groups = { "reg" })
	public void test3() {
		System.out.println("smoke1");

	}

	@Test(groups = { "sanity","reg" })
	public void test4() {
		System.out.println("sanity");
	}

}
