package prop;

import org.jsoup.Connection.Base;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Base.Basenew;

public class propertycc {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\Seleniumauto\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.irctc.co.in/");

		WebElement later = driver.findElement(By.xpath("//button[@class='izooto-optin--cta izooto-optin--cta-later']"));
		later.click();

		WebElement ok = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));

		ok.click();
	}

}
