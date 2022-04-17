package com.executepage;

import com.Base.Basenew;
import com.locators.Searchadacinlocators;

import excelproject.Excelretrieve;

public class Searchexceute extends Searchadacinlocators {
	
	
	
	public static void Location() {
		Basenew.Selectdatatext(Basenew.findElementById(Searchadacinlocators.location), Excelretrieve.excelread1(2,0));	
	}
	
	public static void Hotels() {
		Basenew.Selectdatatext(Basenew.findElementById(Searchadacinlocators.hotels), Excelretrieve.excelread1(3,0));
	}
	
	public static void Roomtype() {
		Basenew.Selectdatatext(Basenew.findElementById(Searchadacinlocators.roomtype), Excelretrieve.excelread1(4,0));
	}
	
	public static void Roomno() {
		Basenew.Selectdata(Basenew.findElementById(Searchadacinlocators.noforoom), Excelretrieve.excelread1(5,0));
	}
	
	public static void Checkin() {
		Basenew.typeData(Basenew.findElementById(Searchadacinlocators.checkin), Excelretrieve.excelread1(6,0));
	}
	
	public static void Checkout() {
		Basenew.typeData(Basenew.findElementById(Searchadacinlocators.checkout), Excelretrieve.excelread1(7,0));
	}
	
	
	public static void Adult() {
		Basenew.Selectdata(Basenew.findElementById(Searchadacinlocators.adults), Excelretrieve.excelread1(8,0));
	}
	
	
	public static void Child() {
		Basenew.Selectdata(Basenew.findElementById(Searchadacinlocators.child), Excelretrieve.excelread1(9,0));
	}
	
	public static void Searchbutton() {
		Basenew.press(Basenew.findElementById(Searchadacinlocators.Searchbutton));
	}
	
	
	
	
	
	
	
	
	
}



