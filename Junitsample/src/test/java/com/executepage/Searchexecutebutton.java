package com.executepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.Basenew;
import com.locators.Selectdatapage;

import excelproject.Excelretrieve;

public class Searchexecutebutton extends Selectdatapage {
	
	
	
	public static void radiobutton() {
		Basenew.press(Basenew.findElementById(Selectdatapage.selectbutton));
	}
	
	public static void continues() {
		Basenew.press(Basenew.findElementById(Selectdatapage.cntinuebutton));
	}
}
