package com.testngsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

	WebDriver driver;

	@BeforeClass

	public void launch() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\Seleniumauto\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Test(dataProvider = "smoke")
	public void test1(String data1, String data2) throws InterruptedException {

		driver.findElement(By.id("username")).sendKeys(data1);
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys(data2);
		driver.findElement(By.id("login")).click();

	}

	@DataProvider(name = "smoke")
	public Object[][] dp() {
		return new Object[][] { { "sakthivijayarajan", "9755Z6" } ,{}};

	}

	@Test(dataProvider = "reg")
	public void test2(String data1, String data2, String data3, String data4, String data5, String data6, String data7,
			String data8) {
		WebElement loc = driver.findElement(By.id("location"));
		Select sc = new Select(loc);
		sc.selectByValue(data1);

		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select sc1 = new Select(hotel);
		sc1.selectByValue(data2);

		WebElement room = driver.findElement(By.id("room_type"));
		Select sc2 = new Select(room);
		sc2.selectByValue(data3);

		WebElement roomno = driver.findElement(By.id("room_nos"));
		Select sc3 = new Select(roomno);
		sc3.selectByValue(data4);

		WebElement datein = driver.findElement(By.id("datepick_in"));
		datein.sendKeys(data5);

		WebElement dateout = driver.findElement(By.id("datepick_out"));
		dateout.sendKeys(data6);

		WebElement adultroom = driver.findElement(By.id("adult_room"));
		Select sc4 = new Select(adultroom);
		sc4.selectByValue(data7);

		WebElement childroom = driver.findElement(By.id("child_room"));

		Select sc5 = new Select(childroom);
		sc5.selectByValue(data8);

		WebElement serach = driver.findElement(By.id("Submit"));

		serach.click();
		
		WebElement select= driver.findElement(By.id("radiobutton_0"));
				select.click();
				
				WebElement contin= driver.findElement(By.id("continue"));
				contin.click();
		
			}
	
	@DataProvider(name = "reg")
	public Object[][] dp1() {
		return new Object[][] { { "Paris", "Hotel Sunshine","Double","4","26-Apr-2022","29-Apr-2022","1","2" } };

	}
	
	@Test(dataProvider="tat")
	
	public void book(String data1,String data2,String data3,String data4,String data5,String data6,String data7,String data8)
	{
		WebElement name= driver.findElement(By.id("first_name"));
		name.sendKeys(data1);
		
		WebElement name2= driver.findElement(By.id("last_name"));
		name2.sendKeys(data2);
		
		WebElement address= driver.findElement(By.id("address"));
		address.sendKeys(data3);
		
		WebElement card= driver.findElement(By.id("cc_num"));
		card.sendKeys(data4);
				
		WebElement cardtyp= driver.findElement(By.id("cc_type"));
		
		Select sc= new Select(cardtyp);
		sc.selectByValue(data5);
		
WebElement month= driver.findElement(By.id("cc_exp_month"));
		
		Select sc1= new Select(month);
		sc1.selectByValue(data6);
		
WebElement year= driver.findElement(By.id("cc_exp_year"));
		
		Select sc2= new Select(year);
		sc2.selectByValue(data7);
		
		WebElement cvv= driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys(data8);
		
		WebElement finalbook= driver.findElement(By.id("book_now"));
		finalbook.click();
		
		
		}

	

	  
	
	
	
	
	
	

}