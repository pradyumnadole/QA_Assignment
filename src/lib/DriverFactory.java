package lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	public WebDriver getDriver (String browserName) {
		
		WebDriver driver = null;
		if (browserName.equals("Chrome")) {
			driver = new ChromeDriver();
		}
		else if (browserName.equals("Firefox")) {
			driver = new FirefoxDriver();
		}
		return driver;
		
		
	}
	
	
	
}
