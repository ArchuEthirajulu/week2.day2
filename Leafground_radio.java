package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground_radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager. chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Your most favorite browser
		driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[9]")) . click();
		
		//UnSelectable
		driver.findElement(By.xpath("//label[text()='Chennai']")) . click();
		
		//Find the default select radio button
		
		String text = driver.findElement(By.xpath("//label[text()= 'Safari']")) . getText();
		System.out.println(text);
		
		//Select the age group (only if not selected)
		boolean selected = driver.findElement(By.xpath("//h5[text()='Select the age group (only if not selected)']/following::span")) . isSelected();
		if(!selected) {
			driver.findElement(By.xpath("//h5[text()='Select the age group (only if not selected)']/following::span")) . click();
		
	}
	}
}
