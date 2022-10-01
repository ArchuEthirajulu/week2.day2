package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager. chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By .xpath ("//input[@id='username']")) .sendKeys("DemoCSR");
		driver.findElement(By.xpath ("//input[@id = 'password']")) . sendKeys("crmsfa");
		driver.findElement(By.xpath ("//input[@class = 'decorativeSubmit']")).click();
		
		
		driver.findElement(By.xpath ("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath ("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By .xpath ("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By .xpath ("(//input[@name = 'firstName'])[3]")) . sendKeys("Archana");
		driver.findElement(By .xpath("(//button[@class = 'x-btn-text'])[6]")) .click();
		System.out.println("The title is " +driver.getTitle());
		Thread.sleep(5000);
		
		
		
		// not able to view the xpath element in the chrome browser
	driver.findElement(By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'] /a ")) . click();
	driver.findElement(By.xpath("//a[text()= 'Edit']") ).click();
	driver.findElement(By .xpath ("//input[@id='updateLeadForm_companyName']")) .clear();
	driver.findElement(By .xpath ("//input[@id='updateLeadForm_companyName']")) .sendKeys("HCL");
	driver.findElement(By.xpath("//input[@class = 'smallSubmit']")).click();
	
	
	driver.close();
}
}
