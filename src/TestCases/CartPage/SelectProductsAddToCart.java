package TestCases.CartPage;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import POM.CardPaymentPOM.CheckoutDetails;
import POM.CartPOM.SelectProducts;
import POM.HomePOM.CurrentTemperature;
import dev.failsafe.internal.util.Assert;
import lib.DriverFactory;
import lib.PropertiesOperation;

public class SelectProductsAddToCart {

	static DriverFactory factory = new DriverFactory();
	static CurrentTemperature temp = new CurrentTemperature();


	@Test(priority = 0)
	public static void SelectObjectAddToCart () throws IOException, InterruptedException {
		WebDriver driver = factory.getDriver(PropertiesOperation.getValue("browser"));
		driver.get(PropertiesOperation.getValue("uri"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		temp.clickBuyOption(driver);	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		SelectProducts prd = new SelectProducts();	
		String prdtitle = driver.findElement(By.xpath("//h2")).getText();
		if (prdtitle.equals("Sunscreens")){
			prd.SelectItems(driver,"SPF-50");
			prd.SelectItems(driver,"SPF-30");
			//System.out.println("true");
		
		}
		else {
			//System.out.println("false");
			prd.SelectItems(driver,"Aloe");
			prd.SelectItems(driver,"Almond");
		}	
		
		String parent2=driver.getWindowHandle();
		System.out.println(parent2);
		driver.findElement(By.xpath("//button[@onclick='goToCart()']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));	
		String Title1 = driver.getTitle();
		System.out.println("Main window Title is " +Title1);
		String win1 = driver.getWindowHandle();
		System.out.println("Main window handle is " +win1);
		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		CheckoutDetails chk = new CheckoutDetails();
		chk.Checkout(driver, "xyz@ff.com", "4242","4242","4242","4242", "12","34", "555", "1234");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		driver.switchTo().defaultContent();
		
		if(driver.findElement(By.xpath("//h2[normalize-space()='PAYMENT SUCCESS']")).isDisplayed() ==true){
		assertEquals(true, true);
		System.out.println("Order placed successfully");
		}

		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
