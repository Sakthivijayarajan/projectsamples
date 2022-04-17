package com.executepage;

import com.Base.Basenew;
import com.locators.Bookpage;

import excelproject.Excelretrieve;

public class Bookpageexecute  extends Bookpage{
	
	public static void name() {
		Basenew.typeData(Basenew.findElementById(Bookpage.name), Excelretrieve.excelread1(10,0));	
	}
	
	public static void lastname() {
		Basenew.typeData(Basenew.findElementById(Bookpage.l_name), Excelretrieve.excelread1(11,0));
	}
	
	public static void Address() {
		Basenew.typeData(Basenew.findElementById(Bookpage.address), Excelretrieve.excelread1(12,0));
	}
	
	public static void card () {
		Basenew.typeData(Basenew.findElementById(Bookpage.card), Excelretrieve.excelread1(13,0));
	}
	
	public static void cc_type () {
		Basenew.Selectdatatext(Basenew.findElementById(Bookpage.cc_type ), Excelretrieve.excelread1(14,0));
	}
	
	public static void month () {
		Basenew.Selectdata(Basenew.findElementById(Bookpage.month), Excelretrieve.excelread1(15,0));
	}
	
	public static void year () {
		Basenew.Selectdatatext(Basenew.findElementById(Bookpage.year), Excelretrieve.excelread1(16,0));
	}
	
	public static void cvv () {
		Basenew.typeData(Basenew.findElementById(Bookpage.cvv), Excelretrieve.excelread1(17,0));
	}
	
	public static void Book() {
		Basenew.press(Basenew.findElementById(Bookpage.bookbutton));
	}
	
	
	
	
	
	
	
	
	
	
	

}
