package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager. chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch the browser
		driver.get(" http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//Enter the username
		driver.findElement(By .xpath ("//input[@id='username']")) .sendKeys("DemoCSR");
		
		//Enter the password
		driver.findElement(By.xpath ("//input[@id = 'password']")) . sendKeys("crmsfa");
		
		//Click Login
		driver.findElement(By.xpath ("//input[@class = 'decorativeSubmit']")).click();
		
		//Click crm/sfa link
		driver.findElement(By.xpath ("//a[contains(text(),'CRM/SFA')]")).click();
		
		//Click Leads link
		driver.findElement(By.xpath ("//a[contains(text(),'Leads')]")).click();
		
		//Click Find leads
		driver.findElement(By .xpath ("//a[contains(text(),'Find Leads')]")).click();
		
		Thread.sleep(3000);
		
		//Click on Phone 
		// not able to view the xpath in the browser 
		driver.findElement(By .xpath("(//span[@class= 'x-tab-strip-text '])[2]")) .click();
		//input[@name='phoneCountryCode']
		driver.findElement(By.xpath ("//input[@name = 'phoneCountryCode']")) .sendKeys("");
		
		//Enter phone number
		driver.findElement(By.xpath ("//input[@name = 'phoneNumber']")) .sendKeys("1234567891");
		
		//Click find leads button
		driver.findElement(By.xpath ("//button[contains(text(),'Find Leads')]")) .click();
		
		Thread.sleep(300);
		
		//Capture lead ID of First Resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[4]")). click();
		
		System.out.println("The title is " +driver.getTitle());
		
		//Click Delete
				driver.findElement(By.xpath("//a[text()= 'Delete']") ).click();
				
				//Click Find leads
				driver.findElement(By .xpath ("//a[contains(text(),'Find Leads')]")).click();	
				
				//Enter captured lead ID
				driver.findElement(By .xpath ("//input[@class=' x-form-text x-form-field ']")) . sendKeys("11126");
				driver.findElement(By .xpath("(//button[@class='x-btn-text'])[6]")) .click();
				driver.close();
				
		

}
}