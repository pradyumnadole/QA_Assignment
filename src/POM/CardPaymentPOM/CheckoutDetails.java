package POM.CardPaymentPOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutDetails {

	
	public void Checkout (WebDriver driver, String email, String cardnumber_1, String cardnumber_2,String cardnumber_3,String cardnumber_4,String exp_1,String exp_2, String cvc,String zip) throws InterruptedException {
//		Thread.sleep(100);
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
//		Thread.sleep(100);
//		driver.findElement(By.xpath("//input[@id='card_number']")).sendKeys(cardnumber);
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@id='cc-exp']")).sendKeys(exp);
//		Thread.sleep(100);
//		driver.findElement(By.xpath("//input[@id='cc-csc']")).sendKeys(cvc);
//		Thread.sleep(100);
//		driver.findElement(By.xpath("//span[@class='iconTick']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@id='card_number']")).sendKeys(cardnumber_1);
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@id='card_number']")).sendKeys(cardnumber_1);
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@id='card_number']")).sendKeys(cardnumber_1);
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@id='card_number']")).sendKeys(cardnumber_1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='cc-exp']")).sendKeys(exp_1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='cc-exp']")).sendKeys(exp_2);
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@id='cc-csc']")).sendKeys(cvc);
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@id='billing-zip']")).sendKeys(zip);
		Thread.sleep(100);
		driver.findElement(By.xpath("//span[@class='iconTick']")).click();
		
	}
}
