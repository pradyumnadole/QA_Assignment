package POM.HomePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CurrentTemperature {
	int i1 = 0;
	String tempVal;
	String new1;
	String new2;
	
	public void checkTemperature (WebDriver driver) {
			
		tempVal = driver.findElement(By.xpath("//span[@id = 'temperature']")).getText();
		System.out.println("Temperature displayed is "+ tempVal );
	}
	
	
	public void clickBuyOption(WebDriver driver) {	
		int count = 0;  
		checkTemperature(driver);
		for(int i = 0; i < tempVal.length(); i++) {    
            if(tempVal.charAt(i) != ' ')    
                count++;    
        }  
		System.out.println(count);
		if (count == 2) {
			new1 = tempVal.substring(0, 1);
		}
		else {
			new1 = tempVal.substring(0, 2);
		}		
		System.out.println("xxx" + new1);
		int i1=Integer.parseInt(new1); 
		System.out.println("iii" +i1);
		if(i1 < 19 ) {
			System.out.println("Temperature is less than 19 degrees, Moisturizers selected");
			driver.findElement(By.xpath("//a[@href='/moisturizer']")).click();
			
		}
		else if (i1 > 34) {
			System.out.println("Temperature is more than 34 degrees, sunscreen selected");
			driver.findElement(By.xpath("//a[@href='/sunscreen']")).click();
			
		}
		else {
			System.out.println("Temperature is in between of 19 & 34 degrees");
			driver.quit();
		}
		
	}
}

