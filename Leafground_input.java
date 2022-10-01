package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground_input {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager. chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://leafground.com/input.xhtml");
		driver.manage().window().maximize();
       
		//Type your name
		driver.findElement(By.id("j_idt88:name")) . sendKeys("abc");
		
		//Append Country to this City.
		driver.findElement(By.id("j_idt88:j_idt91")) . clear();
		driver.findElement(By.id("j_idt88:j_idt91")) . sendKeys("Ooty");
		
		//Verify if text box is disabled
		boolean selected = driver.findElement(By .xpath ("//h5[text()='Verify if text box is disabled']/following::div[1]")) .isSelected();
		if(!selected) {
		
			System.out.println("disabled");
		} else {
			System.out.println("not disabled");
		}
		
		//Clear the typed text.
		driver.findElement(By.id("j_idt88:j_idt95")) . clear();
		
		
		//Retrieve the typed text.
		String text = driver.findElement(By .xpath("//h5[text()='Retrieve the typed text.']/following::input[1]")). getAttribute("value");
		System.out.println(text);
	
		//Type email and Tab. Confirm control moved to next element.
		driver.findElement(By .xpath ("//input[@id = 'j_idt88:j_idt99']")). sendKeys("testleaf123@gmail.com");
		
		//Inorder to Confirm control moved to next element.
		WebElement activeElement = driver.switchTo().activeElement();
		String text1 = activeElement.getText();
		
		if(text.contains("About yourself") ) {
			System.out.println("control moved");
		} else {
			System.out.println("control not moved");
		}
		
		
		//Type about yourself
		driver.findElement(By .xpath ("//textarea[@id ='j_idt88:j_idt101']")) .sendKeys(" I am interested in learning new things");
		
		//Text Editor
		driver.findElement(By .xpath("//button[@class = 'ql-italic']")) . click();
		driver.findElement(By .xpath("//div[@class = 'ql-editor ql-blank']")) . sendKeys("Good Morning");
		
		//Just Press Enter and confirm error message*
		System.out.println("Just Press Enter and confirm error message*");
		driver.findElement(By.xpath("//input[@id ='j_idt106:thisform:age']")) .sendKeys(Keys.ENTER);
		String error = driver.findElement(By.xpath ("//span[@class='ui-message-error-detail']")) .getText();
		if(error.contains("Age is mandatory")) {
		 System.out.println("confirmed error message");
		 } else {
		 System.out.println("not confirmed error message");
		 }
		 
		 //Click and Confirm Label Position Changes
		System.out.println("Click and Confirm Label Position Changes");
		 WebElement label = driver.findElement(By.xpath("//span[@class='ui-float-label']"));
		 Point location = label.getLocation();
		 
		 //to get that location then click
		 label.click();
		 Point location2 = label.getLocation();
		 if(!location.equals(location2)) {
		 System.out.println("Position changed"); 
		 } else {
		 System.out.println("Position not changed");
		 }	 
		
		 //Type your name and choose the third option
		driver.findElement(By.xpath("//h5[text()='Type your name and choose the third option']/following::input[1]")) .sendKeys("TestLeaf");
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='j_idt106:auto-complete_panel']//li[text()=3]")).click();
		
		 
		 
		 //Type your DOB (mm/dd/yyyy) and confirm date chosen
		System.out.println("Type your DOB:");
        driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']")) . sendKeys("09/19/2022");
         
       //Type number and spin to confirm value changed
         System.out.println("Type number and spin to confirm value changed:");
         
        WebElement spin = driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']"));
		spin.sendKeys("5");
		String attribute1 = spin.getAttribute("value");
		driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-n']")) .click();
		String attribute2 = spin.getAttribute("value");
		 if(!attribute1 .equals (attribute2)) {
			 System.out.println("Confirmed value changed");
		 }else {
			 System.out.println("Value  not changed");
			  }
		 
		 
		 //Type random number (1-100) and confirm slider moves correctly
		 System.out.println("Type random number:");
		//position of that icon
		 Point location3 = driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle ui-corner-all ui-state-default')]")).getLocation();
		 driver.findElement(By.xpath("//input[@id='j_idt106:slider']")).sendKeys("25");
		 
		 Point location4 = driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle ui-corner-all ui-state-default')]")).getLocation();
		 
		 //compare two location
		 if(!location3 .equals(location4)) {
			 System.out.println("slide moved correctly");
			  }else {
				  System.out.println("slide not moved correctly");
			  }
		 
		 //Click and Confirm Keyboard appears
		 System.out.println("Click and Confirm Keyboard appears:");
		 driver.findElement(By.xpath("//input[@id='j_idt106:j_idt122']")).click();
		 boolean displayed = driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']")).isDisplayed();
		 if(displayed) {
			 System.out.println("Keyboard displayed");
		 }else {
			 System.out.println("Keyboard not displayed");
		 }
		 
		 
		 //Custom Toolbar
		 System.out.println("Custom Toolbar:");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_editor']/div[@class='ql-editor ql-blank']")).sendKeys("Hello");
		 
				
				
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
