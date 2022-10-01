package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground_select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager. chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		//Which is your favorite UI Automation tool?
		WebElement ele = driver.findElement(By.className("ui-selectonemenu"));
		Select dd = new Select(ele);
		dd.selectByVisibleText("Selenium");
		
		//Choose your preferred country.
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s ui-c']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		
		//Confirm Cities belongs to Country is loaded
		Thread.sleep(1000);
		WebElement findElement = driver.findElement(By.xpath("//label[@id='j_idt87:city_label']/following::div[1]"));
		findElement.click();
		
		Thread.sleep(1000);
		WebElement city = driver.findElement(By.xpath("//li[text()='Chennai']"));
		String text = city.getText();
		System.out.println(text);
		city.click();
		
		//Change the Country & check if City is changed
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s ui-c']")).click();
		driver.findElement(By.xpath("//li[text()='USA']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@id='j_idt87:city_label']/following::div[1]")).click();
		WebElement city1 = driver.findElement(By.xpath("//li[text()='New York']"));
		String text1 = city1.getText();
		System.out.println(text1);
		city1.click();
		
		
		//Choose the Course
		
		driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		
		
		//Choose language randomly
		driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Tamil']")).click();
		
		
		//Select 'Two' irrespective of the language chosen
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='j_idt87:value']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='இரண்டு']")).click();
		
		
		
		
		
		
		
		
	}

}
