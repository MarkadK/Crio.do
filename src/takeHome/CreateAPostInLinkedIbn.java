package takeHome;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAPostInLinkedIbn {

	public static void main(String[] args) throws InterruptedException, IOException {
		
			System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
			//WebDriverManager.chromedriver().setup();
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.linkedin.com/home");
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//input[@id='session_key']")).sendKeys("markadk@gmail.com");
	        driver.findElement(By.xpath("//input[@id='session_password']")).sendKeys("Kishor2511@");
	        driver.findElement(By.xpath("//button[@data-id='sign-in-form__submit-btn']")).click();
	        
	        Thread.sleep(3000);
	        
	        String profileViews = driver.findElement(By.xpath("(//div[@class='display-flex align-items-baseline']//div[2]/span)[1]")).getText();
	        System.out.println(profileViews);
	        
	        String impressions = driver.findElement(By.xpath("(//div[@class='display-flex align-items-baseline']//div[2]/span)[2]")).getText();
	        System.out.println(impressions);
	        
	       
	        
	        
	
	}
}
