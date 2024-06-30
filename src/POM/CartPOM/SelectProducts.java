package POM.CartPOM;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

public class SelectProducts {
	String price;	
	int i2;
	int i1;
	public void SelectItems (WebDriver driver, String item) {
		
			List<WebElement> element1 = driver.findElements(By.xpath("//p[@class ='font-weight-bold top-space-10']"));
			TreeSet<Integer> priceVal = new TreeSet<Integer>();
			for (WebElement ele : element1) {		
				System.out.println(ele.getText());
			
				if (ele.getText().contains(item)) {			
					price =driver.findElement(RelativeLocator.with(By.tagName("p")).below(ele)).getText();
					System.out.println("Price is " + price );
				
					if (price.contains("Rs")) {
					      try {
								char[] chars = price.toCharArray();
								  StringBuilder sb = new StringBuilder();
								  for(char c : chars){
								     if(Character.isDigit(c)){
								        sb.append(c);
								     }
								  }
								  System.out.println("***"+sb);
								  i2= Integer.parseInt(sb.toString());
								  System.out.println(i2);
								  priceVal.add(i2);
						      } catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
						      }		
					}
					else {
						System.out.println("Price is " + price );
						String numbersOnly = price.replaceAll("[^0-9]", "");
						i1=Integer.parseInt(numbersOnly);
						System.out.println(i1);
						priceVal.add(i1);
					}					
				}					
			     for (Integer value : priceVal) {
			    	 // Print the values
			            System.out.print("From TreeSet: "+ value + ", "); 
			     		
			     }        
				
		}
			Integer lowValItem = priceVal.first();
			System.out.println("lowest price is : " + lowValItem);					
			List<WebElement>addToCart = driver.findElements(By.xpath("//div/button[@class='btn btn-primary']"));
			for (WebElement webElement : addToCart) {
				String btnName = webElement.getAttribute("onclick");
				 String xlowValItem = lowValItem + "";
				if(btnName.contains(item) && btnName.contains(xlowValItem)) {
					webElement.click();
				}
				
			}			
		}

	
}
