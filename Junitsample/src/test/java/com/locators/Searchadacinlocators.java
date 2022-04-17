package com.locators;

import org.openqa.selenium.By;

import com.executepage.Locatorexe;

public class Searchadacinlocators extends Locatorexe {

	public static String location = "location";

	public static String hotels = "hotels";

	public static String roomtype = "room_type";

	public static String noforoom = "room_nos";
	public static String checkin = "datepick_in";
	public static String checkout = "datepick_out";
	public static String adults = "adult_room";
	public static String child = "child_room";
	
	public static String Searchbutton= "Submit";

	
	
	public static By Location = By.id("location");

	public static By Hotels = By.id("hotels");

	public static By Roomtype = By.id("room_type");
	public static By Noforoom = By.id("room_nos");
	public static By Checkin = By.id("datepick_in");
	public static By Checkout = By.id("datepick_out");
	public static By Adults = By.id("adult_room");
	public static By Child = By.id("child_room");

	
	public static By searchbutton= By.id("Submit");
	
	
	
	
}
