package TestCases.HomePage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import POM.HomePOM.CurrentTemperature;
import lib.DriverFactory;
import lib.PropertiesOperation;

public class CurrentTemperatureDisplay {
	static DriverFactory factory = new DriverFactory();
	static CurrentTemperature temp = new CurrentTemperature();


	@Test(priority = 0)
	public static void TempDetailsOnHome () throws IOException, InterruptedException {
		WebDriver driver = factory.getDriver(PropertiesOperation.getValue("browser"));
		driver.get(PropertiesOperation.getValue("uri"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();	
		temp.checkTemperature(driver);	
		driver.quit();
		Thread.sleep(5000);
	}
	
	@Test (priority = 1)
	public static void CheckTemperatureAndBuy () throws IOException, InterruptedException  {
		WebDriver driver = factory.getDriver(PropertiesOperation.getValue("browser"));
		driver.get(PropertiesOperation.getValue("uri"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		temp.clickBuyOption(driver);
		driver.quit();
		Thread.sleep(5000);
	}
	
}
