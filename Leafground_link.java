package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground_link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager. chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://leafground.com/link.xhtml");
		driver.manage().window().maximize();
		
		//Take me to dashboard
		driver.findElement(By.xpath("//a[text()='Go to Dashboard']")).click();
		String title = driver.getTitle();
        if(title .contains ("Dashboard")) {
        	System.out.println("Dashboard is Confirmed");
        	
        }else {
        	System.out.println("dashboard is not confirmed");
        }
        
        driver.navigate().back();
        
        
        //Find my destination
        System.out.println(driver.findElement(By.xpath("//a[text()='Find the URL without clicking me.']")). getAttribute("href"));        
        
        //Am I broken link?
        driver.findElement(By.xpath("//a[text()='Broken?']")).click();
        String title2 = driver.getTitle();
        if(title2.contains("404")) {
        	System.out.println("broken");
        }else {
        	System.out.println("Not Broken");
        }
        driver.navigate().back();
        
        //Duplicate Link
        driver.findElement(By.xpath("(//a[text()='Go to Dashboard'])[2]")).click();
        driver.navigate().back();
        
        
        //Count Links
        List<WebElement> ele = driver.findElements(By.xpath("//a[text()='How many links in this page?']"));
        System.out.println("count of links------->" +  ele.size());
        
        //Count Layout Links
        driver.findElement(By.xpath("//a[text()='How many links in this layout?']")).click();
        List<WebElement> ele1 = driver.findElements(By.tagName("a"));
        System.out.println("Count Layout Links------------>" + ele1.size());
        
        
        driver.close();
        
        
      
        
	}

}
