package com.runnerclass;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.executemain.Adacinfinal;
import com.executemain.Finalpage;
import com.executemain.Selectpage;
import com.locators.Bookpage;

public class Mutiplerun {
	
	
	@RunWith(Suite.class)
	@Suite.SuiteClasses({ Adacinfinal.class,Bookpage.class })
	public class Runner {

	}

}
