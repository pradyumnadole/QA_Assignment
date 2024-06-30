package TestCases.CardPaymentPage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POM.CardPaymentPOM.CheckoutDetails;
import POM.HomePOM.CurrentTemperature;
import lib.DriverFactory;
import lib.PropertiesOperation;

public class CheckoutandPay {

	static DriverFactory factory = new DriverFactory();
	static CurrentTemperature temp = new CurrentTemperature();
	
	
	@Test
	public static void checkOut() throws IOException, InterruptedException {
		WebDriver driver = factory.getDriver(PropertiesOperation.getValue("browser"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@onclick='goToCart()']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		CheckoutDetails chk = new CheckoutDetails();
		//chk.Checkout(driver, "xyz@ff.com", "4242424242424242", "1234", "555");
		
	}

	
	//input[@placeholder ='Email']
	//input[@placeholder ='Card number']
	//input[@placeholder ='MM / YY']
	//input[@placeholder ='CVC']
	//span[@class ='iconTick']
	
	
}
