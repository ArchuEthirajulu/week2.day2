package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground_button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager. chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		//Click and Confirm title.
		String  title = driver.getTitle();
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String newtitle = driver.getTitle();
		
		if(title.equals(newtitle)) {
			System.out.println("control stays");
		
		}else {
			System.out.println("moved to another page:" + newtitle);
		}
		//navigate back to button page
		driver.navigate().back();
		
		//Confirm if the button is disabled.
		  boolean selected = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")). isSelected();
		  if(!selected) {
				
				System.out.println("disabled");
			} else {
				System.out.println("not disabled");
			}
		  
		  
		  //Find the position of the Submit button
         WebElement findElement = driver.findElement(By.xpath("//span[text()='Submit']"));
		  Point location = findElement.getLocation();
		  System.out.println("Find the position of the Submit button:" + location);
		  
		  //Find the Save button color
		   String color = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")).getCssValue("color");
		  System.out.println("Find the Save button color:" + color);
		  
		  //Find the height and width of this button
           Dimension size = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize();
           System.out.println("Height of button is:" + size.getHeight());
           System.out.println("Width of button is:"  + size.getWidth());
           
           //Mouse over and confirm the color changed
           String cssValue = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']")).getCssValue("background-color");
           System.out.println("Mouse over and confirm the color changed:" + cssValue);
           
           WebElement findElement2 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']/span"));
           Actions builder= new Actions(driver);
           builder.moveToElement(findElement2).perform();
           String cssValue1 = findElement2.getCssValue("background-color");
           if(cssValue != cssValue1) {
        	   System.out.println("Color changed after Mouse Over");
           }else {
        	   System.out.println("Color not changed after Mouse Over");
           }
           
           //Click Image Button and Click on any hidden button
          driver.findElement(By.xpath("//button[@id='j_idt88:j_idt102:imageBtn']")).click();
           
          //How many rounded buttons are there?
         List<WebElement> ele =   driver.findElements(By.xpath("//button[contains(@class,'rounded-button')]"));
         int numberofbuttons = ele.size();
         System.out.println("How many rounded buttons are there:"+ numberofbuttons);
         
         
         
         
         
         
         
         
         
           
           
           
           
           
           
           
           
           
           
           
           
           
		  
		  
		  
		  
		  
		  
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


