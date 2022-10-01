package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground_checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager. chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		
		//Basic Checkbox
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		
		//Notification
		 driver.findElement(By.xpath("//span[text()='Ajax']")). click();
		
		
		//Choose your favorite language(s)
		driver.findElement(By.xpath("//label[text()='Others']")).click();
		
		//Tri State Checkbox
		driver.findElement(By.xpath("//div[contains(@id,'ajaxTriState')]")).click();
		
		//Toggle Switch
	    driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).click();
	 
	 //Verify if check box is disabled
		boolean enabled = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")). isSelected();
		if(enabled==true) {
			System.out.println("Checkbox is enabled");
		}else {
			System.out.println("Checkbox is disabled");
		}
		
		
		
		//Select Multiple
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
	    driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
	    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
	    
	    
	    
	    
	    
	    
		
		
	}

}
