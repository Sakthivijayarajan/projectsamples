package com.Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.utils.FileUtil;
import com.google.common.io.Files;
import com.mongodb.MapReduceCommand.OutputType;

public class Basenew {
	
	

		public static WebDriver driver;
		@BeforeClass
		
		public static void browserlaunch() {

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\vijay\\eclipse-workspace\\Seleniumauto\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			//driver.get("https://adactinhotelapp.com/");
			//driver.manage().window().maximize();

			

		}
		


		public static void url(String url) {
			driver.get(url);
			driver.manage().window().maximize();
		}
		
		@AfterClass

		public static void browserClose() throws IOException {
			System.out.println("AfterCLass");
			
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			
			File source = scrShot.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
			File destination = new File("C:\\Users\\vijay\\OneDrive\\Documents\\Screen\\New Bitmap image.bmp");		
			Files.copy(source, destination);
			
			
			driver.close();
		}
	
		
		// 1.scenario for FindElement
		//WebElement findElement = driver.findElement(By.xpath(""));
		public static WebElement findElementByname(String name) {
			return driver.findElement(By.name(name));	
		}
		public static WebElement findElementById(String id) {
			return driver.findElement(By.id(id));	
		}
		public static WebElement findElementByxpath(String xpath) {
			return driver.findElement(By.xpath(xpath));	
		}

		// 2. scenario for FindElement
		// create a method using abtract class as argument
		public static WebElement findElementByAB(By ab) {
			return driver.findElement(ab);
		}
		
		public static WebElement findEle(By ab) {
			return driver.findElement(ab);
			
		}
		
		public static void typeData(WebElement element, String data) {
			element.sendKeys(data);
		}
		
		public static void jsGetData(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			Object print = js.executeScript("return arguments[0].getAttribute('value')", element);
			
			System.out.println(print);
		}
		
		public static void Selectdata(WebElement element, String data) {
			
			Select val= new Select(element);
			val.selectByValue(data);
		}

public static void Selectdatatext(WebElement element, String data) {
			
			Select val= new Select(element);
			val.selectByVisibleText(data);
		}

public static void implict()
{
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}

		public static void press(WebElement element) {
			element.click();}
		
		public static String read(String data) {
			
			 
			 String name= null;

			try {
				FileReader fd = new FileReader(new File(
						"C:\\Users\\vijay\\eclipse-workspace\\Junitsample\\src\\main\\resources\\filenew.properties"));
				Properties prop = new Properties();
				try {
					prop.load(fd);
				} catch (IOException e) {

					e.printStackTrace();
				}
				name= prop.getProperty(data);
				
				
				
				

			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
			return name;

		}
}
		

		






