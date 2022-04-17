package com.executepage;

import com.Base.Basenew;
import com.locators.Loginlocators;

import excelproject.Excelretrieve;

public class Locatorexe  extends Loginlocators {
	
	public static void username() {
		Basenew.typeData(Basenew.findElementById(username), Excelretrieve.excelread1(0,0));	
	}
	
	public static void password() {
		Basenew.typeData(Basenew.findElementById(password), Excelretrieve.excelread1(1,0));
	}
	
	public static void loginButton() {
		Basenew.press(Basenew.findElementByxpath(loginButton));
	}

}
